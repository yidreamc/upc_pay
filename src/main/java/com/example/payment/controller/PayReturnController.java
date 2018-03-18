package com.example.payment.controller;

import com.example.payment.xml.PayResult;
import com.example.payment.xml.XMLUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.NoSuchAlgorithmException;

@Controller
public class PayReturnController {


    private static Logger LOGGER = LoggerFactory.getLogger(PayReturnController.class);

    @RequestMapping(value = "/payreturn/{cardNum}/{name}", produces = "text/plain;charset=utf-8")
    public String paymentResultttt(@PathVariable("cardNum") String cardNum, @PathVariable("name") String name, String data, Model model) throws NoSuchAlgorithmException {

        PayResult payResult = XMLUtils.xml2javaBean(data);

        String billno = payResult.getBillno();
        double billamt = payResult.getBillamt();
        String paidtime = payResult.getPaidtime();
        String trade_no = payResult.getTrade_no();

        model.addAttribute("billno",billno);
        model.addAttribute("billamt",billamt);
        model.addAttribute("paidtime",paidtime);
        model.addAttribute("trade_no",trade_no);
        model.addAttribute("cardNum",cardNum);
        model.addAttribute("name",name);

        System.out.println(name + " " + cardNum + " success" );
        return "payreturn";
    }
}
