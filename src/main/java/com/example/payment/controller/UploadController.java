package com.example.payment.controller;

import com.example.payment.model.Bill;
import com.example.payment.model.BillRepository;
import com.example.payment.upload.FileUploadService;
import com.example.payment.util.ReadExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;

@RestController
public class UploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @Autowired
    private BillRepository billRepository;


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
