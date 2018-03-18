package com.example.payment.controller;

import com.example.payment.dto.ResultData;
import com.example.payment.model.Order;
import com.example.payment.model.OrderRepository;
import com.example.payment.model.Payment;
import com.example.payment.model.PaymentRepository;
import com.example.payment.pojo.Check;
import com.example.payment.pojo.IdCheck;
import com.example.payment.util.MD5;
import com.example.payment.util.MobileUtils;
import com.example.payment.xml.BillDtl;
import com.example.payment.xml.BillInfo;
import com.example.payment.xml.ModelXmlBeanFactory;
import com.example.payment.xml.XMLUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderRepository orderRepository;

    private int orderBase = 100000;

    private ModelXmlBeanFactory modelXmlBeanFactory ;


    private Check check;

    private String serverPath = "http://wxsportscard.upc.edu.cn:8088";




    @GetMapping("/getPaymentData")
    public Object getPaymentData(String uid,String uname,String amt,int pid) throws UnsupportedEncodingException {

        Payment payment = paymentRepository.findOne(pid);
        if(payment == null){
            return "false";
        }
        System.out.println("uid:" + uid);

        int type = payment.getType();

        //no shcool
        if(type != 1){

            int p1code = payment.getP1code();
            int p2code = payment.getP2code();


            if(uname == "" || uid == ""){
                Map<String, String> err = new HashMap<>();
                err.put("code","0");
                err.put("info","参数不能为空");
                return ResultData.ok(err);
            }

            if(p1code != 0){


                //身份证
                if(p1code == 1){
                    check = new IdCheck();
                    if(check.doCheck(uname) == false){
                        Map<String, String> err = new HashMap<>();
                        err.put("code","0");
                        err.put("info",check.err());
                        return ResultData.ok(err);
                    }
                }

                //手机号
                if(p1code == 2){
                    if(MobileUtils.isMobileNO(uname) == false){
                        Map<String, String> err = new HashMap<>();
                        err.put("code","0");
                        err.put("info","请输入正确的手机号");
                        return ResultData.ok(err);
                    }
                }

            }


            if(p2code != 0){

                if(p2code == 1){
                    check = new IdCheck();
                    if(check.doCheck(uid) == false){
                        Map<String, String> err = new HashMap<>();
                        err.put("code","0");
                        err.put("info",check.err());
                        return ResultData.ok(err);
                    }
                }

                //手机号
                if(p2code == 2){
                    if(MobileUtils.isMobileNO(uid) == false){
                        Map<String, String> err = new HashMap<>();
                        err.put("code","0");
                        err.put("info","请输入正确的手机号");
                        return ResultData.ok(err);
                    }
                }

            }

        }


        String sysid = payment.getSysid();
        String subsysid = payment.getSubsysid();
        String cert = payment.getCert();
        String feeitemid = payment.getFeeitemid();



        Order order = new Order(uid,uname);
        order = orderRepository.save(order);
        order.setOrderId(String.valueOf(order.getId() + orderBase));
        orderRepository.save(order);

        modelXmlBeanFactory = new ModelXmlBeanFactory(feeitemid);
        BillInfo billInfo = modelXmlBeanFactory.getBillInfoBean();
        List<BillDtl> billDtls = new ArrayList<>();
        billDtls.add(modelXmlBeanFactory.getBillDtlBean("1", Double.valueOf(amt), ""));
        billInfo.setBillno(order.getOrderId());
        billInfo.setOrderinfono(uid);
        billInfo.setOrderinfoname(uname);
        billInfo.setReturnURL(serverPath + "/payreturn/" + uid + "/" + uname);
        //LOGGER.info(serverPath + "/mapi/payment_result");
        billInfo.setBillremark("缴费");
        billInfo.setBilldtl(billDtls);


        String data = XMLUtils.javaBean2xml(billInfo);
        String sign = MD5.getMD5(sysid + subsysid + cert + data).toLowerCase();

        data = URLEncoder.encode(data, "UTF-8");

        Map<String, String> retMap = new HashMap<>();

        retMap.put("sysid", sysid);
        retMap.put("subsysid", subsysid);
        retMap.put("data", data);
        retMap.put("sign", sign);
        retMap.put("code","1");

        //System.out.println(username + " " + idcard + " start");
        return ResultData.ok(retMap);



    }
}
