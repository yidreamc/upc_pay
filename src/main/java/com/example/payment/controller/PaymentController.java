package com.example.payment.controller;

import com.example.payment.dto.ResultData;
import com.example.payment.model.*;
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

    private ModelXmlBeanFactory modelXmlBeanFactory;

    @Autowired
    private BillRepository billRepository;


    private Check check;

    private String serverPath = "http://wxsportscard.upc.edu.cn:8088";


    @GetMapping("/getPaymentData")
    public Object getPaymentData(String zzAddress, String zzBank, String zzBnkName, String zzTel, String zzUnit, String taxCode, String uid, String uname, String amt, int pid, String mark) throws UnsupportedEncodingException {

        Payment payment = paymentRepository.findOne(pid);
        if (payment == null) {
            return "false";
        }
        System.out.println("uid:" + uid);

        int type = payment.getType();

        //no shcool
        if (type != 1) {

            int p1code = payment.getP1code();
            int p2code = payment.getP2code();

            String p1 = payment.getP1name();
            String p2 = payment.getP2name();

            System.out.println("".equals(p1));
            System.out.println("".equals(p2));
            System.out.println(uid == null);
            if ("".equals(p1)) {
                uname = "default";
            }

            if ("".equals(p2)) {
                uid = "default";
            }

            if (uname == "" || uid == "") {
                Map<String, String> err = new HashMap<>();
                err.put("code", "0");
                err.put("info", "参数不能为空");
                return ResultData.ok(err);
            }
            if (p1code != 0) {

                //身份证
                if (p1code == 1) {
                    check = new IdCheck();
                    if (check.doCheck(uname) == false) {
                        Map<String, String> err = new HashMap<>();
                        err.put("code", "0");
                        err.put("info", check.err());
                        return ResultData.ok(err);
                    }
                }

                //手机号
                if (p1code == 2) {
                    if (MobileUtils.isMobileNO(uname) == false) {
                        Map<String, String> err = new HashMap<>();
                        err.put("code", "0");
                        err.put("info", "请输入正确的手机号");
                        return ResultData.ok(err);
                    }
                }

                if (p1code == 3) {
                    if (getLen(uname) > 50) {
                        Map<String, String> err = new HashMap<>();
                        err.put("code", "0");
                        err.put("info", "参数的长度必须小于50个字");
                        return ResultData.ok(err);
                    }
                }

            }


            if (p2code != 0) {

                if (p2code == 1) {
                    check = new IdCheck();
                    if (check.doCheck(uid) == false) {
                        Map<String, String> err = new HashMap<>();
                        err.put("code", "0");
                        err.put("info", check.err());
                        return ResultData.ok(err);
                    }
                }

                //手机号
                if (p2code == 2) {
                    if (MobileUtils.isMobileNO(uid) == false) {
                        Map<String, String> err = new HashMap<>();
                        err.put("code", "0");
                        err.put("info", "请输入正确的手机号");
                        return ResultData.ok(err);
                    }
                }

            }

        }


        String sysid = payment.getSysid();
        String subsysid = payment.getSubsysid();
        String cert = payment.getCert();
        String feeitemid = payment.getFeeitemid();


        Order order = new Order(uid, uname);

        System.out.println("uid: " + uid + "  uname: " + uname);
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
        billInfo.setBillremark(mark);
        billInfo.setBilldtl(billDtls);


        // String zzAddress, String zzBank, String zzBnkName, String zzTel, String zzUnit, String taxCode,


        if ("".equals(zzAddress) || "".equals(zzBank) || "".equals(zzBnkName) || "".equals(zzTel) || "".equals(zzUnit) || "".equals(taxCode)) {
            Map<String, String> err = new HashMap<>();
            err.put("code", "0");
            err.put("info", "开票参数不能为空");
            return ResultData.ok(err);
        }
        else {
            billInfo.setTaxCode(taxCode);
            billInfo.setZzAddress(zzAddress);
            billInfo.setZzBank(zzBank);
            billInfo.setZzBnkName(zzBnkName);
            billInfo.setZzTel(zzTel);
            billInfo.setZzUnit(zzUnit);
        }


        String data = XMLUtils.javaBean2xml(billInfo);
        String sign = MD5.getMD5(sysid + subsysid + cert + data).toLowerCase();
        data = URLEncoder.encode(data, "UTF-8");

        Map<String, String> retMap = new HashMap<>();

        retMap.put("sysid", sysid);
        retMap.put("subsysid", subsysid);
        retMap.put("data", data);
        retMap.put("sign", sign);
        retMap.put("code", "1");

        System.out.println("mark" + mark.length());

        //System.out.println(username + " " + idcard + " start");
        return ResultData.ok(retMap);

    }


    /**
     * 获取字符串的长度，如果有中文，则每个中文字符计为2位
     *
     * @param value 指定的字符串
     * @return 字符串的长度
     */
    public int getLen(String value) {
        int valueLength = 0;
        String chinese = "[\u0391-\uFFE5]";
        /* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
        for (int i = 0; i < value.length(); i++) {
            /* 获取一个字符 */
            String temp = value.substring(i, i + 1);
            /* 判断是否为中文字符 */
            if (temp.matches(chinese)) {
                /* 中文字符长度为2 */
                valueLength += 2;
            } else {
                /* 其他字符长度为1 */
                valueLength += 1;
            }
        }
        return valueLength;
    }
}
