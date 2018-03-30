package com.example.payment.controller;

import com.example.payment.dto.Option;
import com.example.payment.dto.Option2;
import com.example.payment.model.*;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ManageResController {


    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PayTypeRepository payTypeRepository;


    @PostMapping("/login")
    public Object doLogin(@RequestBody Map<Object, Object> param, HttpServletRequest request) {
        String uname = param.get("uname").toString();
        String pwd = param.get("pwd").toString();
        if("".equals(pwd) || pwd == null){
            return 0;
        }
        if (uname != null && pwd != null) {
            Admin admin = adminRepository.findFirstByUnameAndPwd(uname, pwd);
            if (admin != null) {
                request.getSession().setAttribute("admin", admin);
                return 1;
            }
        }
        return 0;
    }

    @GetMapping("/islogin")
    private Object isLogin(HttpServletRequest request) {
        Object admin = request.getSession().getAttribute("admin");
        if (admin == null) {
            return 0;
        }
        return 1;
    }

    @GetMapping("/getpays")
    public Object getPays(HttpServletRequest request,HttpServletResponse response) throws IOException {
        Admin admin = (Admin)request.getSession().getAttribute("admin");
        if(admin == null){
            response.sendRedirect("/error");
        }
        if(admin.getSadmin() == 1){
            return paymentRepository.findByOrderByIdDesc();
        }else {
            return paymentRepository.findByAidOrderById(admin.getId());
        }

    }

    @GetMapping("/getType")
    public Object getType(int id) {
        return payTypeRepository.findByPid(id);
    }

    @GetMapping("/getadmin")
    public Object getAdmin(HttpServletRequest request,HttpServletResponse response) throws IOException {
        Admin admin = (Admin)request.getSession().getAttribute("admin");
        if(admin == null){
            response.sendRedirect("/error");
        }
        return admin;
    }

    @PostMapping("/delete")
    public Object delete(@RequestBody Map<Object, Integer> param) {
        paymentRepository.delete(param.get("id"));
        return 1;
    }

    @PostMapping("/create")
    public Object createPayment(@RequestBody Map<Object, Object> param, HttpServletRequest req, HttpServletResponse response) throws IOException {

        Admin admin = (Admin) req.getSession().getAttribute("admin");
        int aid = 0;
        if(admin!= null){
            aid = admin.getId();
        }else {
            response.sendRedirect("/error");
        }


        String name = param.get("name").toString();
        Integer type = Integer.valueOf(param.get("type").toString());
        Integer isIndefine = Integer.valueOf(param.get("isIndefine").toString());
        Integer bill = Integer.valueOf(param.get("isBill").toString());
        String p1name = null, p2name = null;
        Integer p1code = 0, p2code = 0;

        // type = 1 校内用户
        if (type != 1) {
            p1name = param.get("p1name").toString();
            p1code = Integer.valueOf(param.get("p1code").toString());
            p2name = param.get("p2name").toString();
            p2code = Integer.valueOf(param.get("p2code").toString());
        }

        String subsysid = param.get("subsysid").toString();
        String sysid = param.get("sysid").toString();
        String feeitemid = param.get("feeitemid").toString();
        String cert = param.get("cert").toString();

        Option[] options = new Gson().fromJson(param.get("stringify").toString(), Option[].class);

        boolean in = (isIndefine == 1) ? true : false;

        boolean bi = (bill == 1) ? true : false;

        Payment payment = new Payment(sysid, subsysid, cert, feeitemid, name, "", p1name, p1code, p2name, p2code, in);
        payment.setType(type);
        payment.setAid(aid);
        payment.setBill(bi);


        payment = paymentRepository.save(payment);

        int pid = payment.getId();
        Map<Object, Object> map = new HashMap<>();

        if (in == true) {

            PayType payType = null;
            for (int i = 0; i < options.length; i++) {
                Option o = options[i];
                try {
                    System.out.println(o.getKey());
                    System.out.println(o.getName());
                    System.out.println(Double.valueOf(o.getValue()));
                    System.out.println(Double.valueOf(pid));
                    payType = new PayType(o.getName(), Double.valueOf(o.getValue()), pid, o.getKey());
                    payTypeRepository.save(payType);
                } catch (Exception e) {
                    map.put("code", "0");
                    map.put("message", "生成失败！！请检查金额是否不是数字！！");
                    return map;
                }
            }

        }
        String qrcode = "http://qr.liantu.com/api.php?&w=200&text=http://wxsportscard.upc.edu.cn:8088/pay?id=" + pid;
        map.put("code", "1");
        map.put("qrcodeurl", qrcode);
        return map;
    }


    @PostMapping("/edit")
    public Object edit(@RequestBody Map<Object, Object> param, HttpServletRequest req) {
        String name = param.get("name").toString();
        Integer type = Integer.valueOf(param.get("type").toString());
        Integer isIndefine = Integer.valueOf(param.get("isIndefine").toString());
        Integer bill = Integer.valueOf(param.get("isBill").toString());
        String p1name = null, p2name = null;
        Integer p1code = 0, p2code = 0;
        // type = 1 校内用户
        if (type != 1) {
            p1name = param.get("p1name").toString();
            p1code = Integer.valueOf(param.get("p1code").toString());
            p2name = param.get("p2name").toString();
            p2code = Integer.valueOf(param.get("p2code").toString());
        }

        String subsysid = param.get("subsysid").toString();
        String sysid = param.get("sysid").toString();
        String feeitemid = param.get("feeitemid").toString();
        String cert = param.get("cert").toString();
        Option2[] options = new Gson().fromJson(param.get("stringify").toString(), Option2[].class);
        boolean in = (isIndefine == 1) ? true : false;
        boolean bi = (bill == 1) ? true : false;

        int id = Integer.valueOf(param.get("id").toString());
        Payment payment = paymentRepository.findOne(id);
        payment.setSysid(sysid);
        payment.setSubsysid(subsysid);
        payment.setCert(cert);
        payment.setFeeitemid(feeitemid);
        payment.setName(name);
        payment.setP1code(p1code);
        payment.setP1name(p1name);
        payment.setP2code(p2code);
        payment.setP2name(p2name);
        payment.setIndefine(in);
        payment.setType(type);
        payment.setBill(bi);

        paymentRepository.save(payment);

        Map<Object, Object> map = new HashMap<>();

        Iterable<PayType> payTypes = payTypeRepository.findByPid(id);

        payTypeRepository.delete(payTypes);

        if (in == true) {
            PayType payType = null;
            for (int i = 0; i < options.length; i++) {
                Option2 o = options[i];

                try {
                    payType = new PayType(o.getType(), Double.valueOf(o.getMoney()), id, o.getKey());
                    payTypeRepository.save(payType);
                } catch (Exception e) {
                    map.put("code", "0");
                    map.put("message", "保存失败！！请检查金额是否不是数字！！");
                    return map;
                }
            }

        }
        map.put("code", "1");
        return map;
    }

}
