package com.example.payment.controller;

import com.example.payment.model.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BillController {

    @Autowired
    private BillRepository billRepository;

    @GetMapping("/getBill")
    public Object getBill(){
        return billRepository.findAll();
    }

    @PostMapping("/deleteBill")
    public Object delete(@RequestBody Map<String,Integer> param){
        int id = param.get("id");
        billRepository.delete(id);
        return 1;
    }
}
