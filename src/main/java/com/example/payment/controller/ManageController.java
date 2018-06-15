package com.example.payment.controller;

import com.example.payment.model.Admin;
import com.example.payment.model.AdminRepository;
import com.example.payment.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.NoSuchAlgorithmException;

@Controller
public class ManageController {


    @Value("${app.key}")
    private String key;


    @Autowired
    private AdminRepository adminRepository;


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin")
    public String adminPage(HttpServletRequest request) {
        Object admin = request.getSession().getAttribute("admin");
        if (admin == null) {
            return "error";
        }

        long now = System.currentTimeMillis()/1000;
        if(now >= 1527782400 && now < 1529424000){
            return "weihu";
        }

        return "admin";
    }

    @RequestMapping(value = "/admin", params = {"verify"})
    public String auth(String verify, String un, String time, HttpServletRequest request) throws NoSuchAlgorithmException {

        Boolean jd = md5ParaVerify(time, un, verify);
        if (jd == true) {
            Admin admin = adminRepository.findFirstByUname(un);
            if (admin == null) {
                return "error";
            }
            request.getSession().setAttribute("admin", admin);
            return "redirect:/admin";
        }
        return "redirect:/error";
    }

    private Boolean md5ParaVerify(String timestamp, String un, String verify) throws NoSuchAlgorithmException {
        String str = un + key + timestamp;
        str = MD5.getMD5(str);
        if (str.equals(verify)) {
            return true;
        }
        return false;
    }


}
