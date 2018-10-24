package ml.yidreamc.upcpay.common.controller;

import ml.yidreamc.upcpay.common.dto.Response;
import ml.yidreamc.upcpay.common.entity.Bill;
import ml.yidreamc.upcpay.common.entity.BillRepository;
import ml.yidreamc.upcpay.auth.entity.Manage;
import ml.yidreamc.upcpay.auth.entity.ManageRepository;
import ml.yidreamc.upcpay.common.entity.entityenum.ManageType;
import ml.yidreamc.upcpay.common.upload.FileUploadService;
import ml.yidreamc.upcpay.common.upload.ReadExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.*;

@RestController
@RequestMapping("/manageadmin")
public class AdminController {


    @Autowired
    private HttpSession httpSession;

    @Autowired
    private ManageRepository manageRepository;

    @Autowired
    private BillRepository billRepository;

    @Autowired
    private FileUploadService fileUploadService;

    @GetMapping("/adminList")
    public Response adminList() {
        Manage manage = (Manage) httpSession.getAttribute("manage");
        if (manage == null) {
            return new Response(1, "没有权限操作");
        }
        int manageId = manage.getId();
        if (ManageType.SUPPER.equals(manage.getAdminType())) {
            return new Response(0, "", manageRepository.findAll());
        } else if (ManageType.DEP.equals(manage.getAdminType())) {
            return new Response(0, "", manageRepository.findByCreateId(manageId));
        } else {
            return new Response(1, "你没有权限操作");
        }
    }

    @PostMapping("/deleteManage")
    public Response deleteManage(@RequestBody Map<String, Integer> param) {
        int id = param.get("id");
        manageRepository.deleteById(id);
        return new Response(0, "");

    }

    @PostMapping("/addManage")
    public Response addManage(@RequestBody Map<String, String> param) {
        try {
            Manage manage = (Manage) httpSession.getAttribute("manage");
            if (manage == null) {
                return new Response(1, "没有权限操作");
            }
            int manageId = manage.getId();
            String un = param.get("un");
            String name = param.get("name");
            ManageType mt = null;
            if (ManageType.DEP.equals(manage.getAdminType())) {
                mt = ManageType.GENERAL;
            } else if(ManageType.SUPPER.equals(manage.getAdminType())){
                mt = ManageType.DEP;
            }else if(ManageType.GENERAL.equals(manage.getAdminType())){
                return new Response(10, "你没有权限操作");
            }

            if (un == null || name == null|| "".equals(un) || "".equals(name)) {
                return new Response(2, "用户名或工号不能为空");
            }

            Manage newManage = manageRepository.findByUname(un);

            if(newManage == null){
                newManage = new Manage(un, "", mt, name, manageId);
            }else {
                newManage.setAdminType(mt);
                newManage.setUname(name);
                newManage.setCreateId(manageId);
            }

            manageRepository.save(newManage);
            return new Response(0, "");
        } catch (Exception e) {
            return new Response(1, "创建失败请稍后再试");
        }
    }


    @GetMapping("/getBill")
    public Response getBill(){
        return new Response(0,"",billRepository.findAll());
    }

    @PostMapping("/deleteBill")
    public Response delete(@RequestBody Map<String,String> param){
        String id = param.get("id");
        Bill bill = billRepository.findByTaxCode(id);
        if(bill != null){
            billRepository.delete(bill);
            return new Response(0,"");
        }
        return new Response(1,"");
    }

    @PostMapping("/uploadfile")
    @Transactional
    public Object upload(MultipartFile file) throws Exception {
        Map<String, String> res = new HashMap<>();
        try {
            String filename = fileUploadService.upload(file);
            String filepath = "excel/" + filename;
            ReadExcelUtils excelUtils = new ReadExcelUtils(filepath);
            Map<Integer, Map<Integer, Object>> maps = excelUtils.readExcelContent();
            //删除excel
            File excel = new File(filepath);
            if (excel.exists()) {
                excel.delete();
            }
            List<Bill> list = new ArrayList<>();
            for (int i = 1; i <= maps.size(); i++) {
                String taxCode = maps.get(i).get(0).toString();
                String zzAddress = maps.get(i).get(1).toString();
                String zzBank = maps.get(i).get(2).toString();
                String zzBnkName = maps.get(i).get(3).toString();
                String zzTel = maps.get(i).get(4).toString();
                String zzUnit = maps.get(i).get(5).toString();
                Bill b = new Bill(taxCode, zzAddress, zzBank, zzBnkName, zzTel, zzUnit);
                list.add(b);
            }
            Iterator<Bill> bills = list.iterator();
            while (bills.hasNext()) {
                Bill bb = bills.next();
                billRepository.save(bb);
            }
            res.put("code", "0");
            return res;
        } catch (Exception e) {
            res.put("code", "1");
            res.put("msg", "error");
            return res;
        }
    }
}
