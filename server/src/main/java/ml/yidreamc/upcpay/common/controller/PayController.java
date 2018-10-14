package ml.yidreamc.upcpay.common.controller;

import ml.yidreamc.upcpay.common.check.CheckUtil;
import ml.yidreamc.upcpay.common.dto.PaymentData;
import ml.yidreamc.upcpay.common.dto.Response;
import ml.yidreamc.upcpay.common.entity.Order;
import ml.yidreamc.upcpay.common.entity.OrderRepository;
import ml.yidreamc.upcpay.common.entity.Payment;
import ml.yidreamc.upcpay.common.entity.PaymentRepository;
import ml.yidreamc.upcpay.common.util.MD5;
import ml.yidreamc.upcpay.common.xml.BillDtl;
import ml.yidreamc.upcpay.common.xml.BillInfo;
import ml.yidreamc.upcpay.common.xml.ModelXmlBeanFactory;
import ml.yidreamc.upcpay.common.xml.XMLUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private ManageRestController manageRestController;

    @Autowired
    private AdminController adminController;

    @Autowired
    private OrderRepository orderRepository;


    @Value("${app.fronturl}")
    private String fronturl;



    @GetMapping("/getPaymentPageData")
    public Response getPaymentPageData(int id) {
        return manageRestController.getOne(id);
    }

    @GetMapping("/allBill")
    public Response allBill() {
        return adminController.getBill();
    }

    @PostMapping("/getPaymentData")
    public Response getPaymentData(@RequestBody PaymentData paymentData) throws UnsupportedEncodingException {
        Payment payment = paymentRepository.findById(paymentData.getId()).get();
        if(payment == null){
            return new Response(1,"该缴费项目已被管理员删除！无法缴费");
        }

        CheckUtil checkUtil = new CheckUtil();

        //校验
        try {
            checkUtil.check(paymentData.getP1(),payment.getP1Check());
            checkUtil.check(paymentData.getP2(),payment.getP2Check());
        }catch (Exception e){
            return new Response(2,e.getMessage());
        }

        //订单
        Order order = new Order(paymentData.getP1(), paymentData.getP2(),payment.getId());
        order = orderRepository.save(order);
        //总金额
        double amts = 0;
        List<Double> list = paymentData.getAmt();
        for(int i = 0;i<list.size();i++){
            amts += list.get(i);
        }
        //签名
        ModelXmlBeanFactory modelXmlBeanFactory = new ModelXmlBeanFactory(payment.getFeeitemid());
        BillInfo billInfo = modelXmlBeanFactory.getBillInfoBean();
        List<BillDtl> billDtls = new ArrayList<>();
        billDtls.add(modelXmlBeanFactory.getBillDtlBean("1", amts, ""));
        billInfo.setBillno(String.valueOf(order.getId()));
        billInfo.setOrderinfono(paymentData.getP1());
        billInfo.setOrderinfoname(paymentData.getP2());
        billInfo.setReturnURL(fronturl + "/payreturn?amt=" + amts  + "&orderId=" + order.getId() + "&name=" + payment.getName());
        billInfo.setBilldtl(billDtls);
        String data = XMLUtils.javaBean2xml(billInfo);
        String sign = MD5.getMD5(payment.getSysid() + payment.getSubsysid() + payment.getCert() + data).toLowerCase();
        data = URLEncoder.encode(data, "UTF-8");


        Map<String,String> res = new HashMap<>();
        res.put("subSign",sign);
        res.put("subSysid",payment.getSysid());
        res.put("subSubsysid",payment.getSubsysid());
        res.put("subData",data);

        return new Response(0,"",res);
    }

}
