package com.example.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/admin")
    public String adminPage(HttpServletRequest request){
        Object admin = request.getSession().getAttribute("admin");
        if(admin == null){
            return "error";
        }
        return "admin";
    }


}
