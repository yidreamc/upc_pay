package com.example.payment.controller;

import com.example.payment.model.Admin;
import com.example.payment.model.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;


    @GetMapping("/allAdmin")
    public Object getAdmin(HttpServletRequest request){
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        if(admin == null || admin.getSadmin() == 0){
            return 0;
        }
        return adminRepository.findBySadmin(0);
    }

    @PostMapping("/addAdmin")
    public Object addAdmin(HttpServletRequest request, @RequestBody Map<String,Object> params){
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        Map<String,Object> res = new HashMap<>();
        if(admin == null || admin.getSadmin() == 0){
            res.put("code",1);
            res.put("msg","你没有权限操作！");
            return res;
        }
        Admin newAdmin = new Admin();
        String name = params.get("adminname").toString();
        String id = params.get("adminid").toString();

        if("".equals(name) || "".equals(id)){
            res.put("code",3);
            res.put("msg","参数不能为空！");
            return res;
        }
        newAdmin.setUnit(name);
        newAdmin.setUname(id);

        try {

            adminRepository.save(newAdmin);
            res.put("code",0);
            res.put("msg","创建成功！");
            return res;
        }catch (Exception e){
            res.put("code",2);
            res.put("msg","未知错误！");
            return res;
        }
    }

    @PostMapping("/deleteAdmin")
    public Object deleteAdmin(@RequestBody Map<String,Object> params,HttpServletRequest request){

        int id = Integer.valueOf(params.get("id").toString());
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        Map<String,Object> res = new HashMap<>();
        if(admin == null || admin.getSadmin() == 0){
            res.put("code",1);
            res.put("msg","你没有权限操作！");
            return res;
        }

        adminRepository.delete(id);
        res.put("code",0);
        res.put("msg","删除成功！");
        return res;

    }
}
