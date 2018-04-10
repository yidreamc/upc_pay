package com.example.payment.controller;

import com.alibaba.fastjson.JSON;
import com.example.payment.model.*;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Map;

@Controller
public class HomeController {

    private final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PayTypeRepository payTypeRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private BillRepository billRepository;

    @Value("${app.id}")
    private String wid;


    @Value("${app.agentid}")
    private String agentid;


    @GetMapping("/pay")
    public String payPage(Model model, @RequestParam(defaultValue = "0") int id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //每日封账
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        if((hour == 23 && min >= 30) || (hour == 0 && min <=30)){
            return "notice";
        }

        if(id != 0){
            request.getSession().setAttribute("id",id);
        }else {
            id = Integer.valueOf(request.getSession().getAttribute("id").toString());
        }
        Payment payment = paymentRepository.findOne(id);
        if (payment == null) {
            return "error";
        }
        model.addAttribute("id", id);
        model.addAttribute("name", payment.getName());
        model.addAttribute("remark", payment.getRemark());

        model.addAttribute("isIndefine", payment.isIndefine());

        if (payment.isIndefine() == true) {
            Iterable<PayType> types = payTypeRepository.findByPid(id);
            model.addAttribute("types", types);
        }



        //校内用户
        if(payment.getType() == 1){
            String state = request.getParameter("state");

            if (state != null && state.equals("paynew")) {
                String access_tokenUrl = "http://wxsportscard.upc.edu.cn:8088/accessToken";
                String access_token = IOUtils.toString(new URL(access_tokenUrl), "utf-8");
                String code = request.getParameter("code");
                String ret = IOUtils.toString(new URL("https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=" + access_token + "&code=" + code), "UTF-8");
                Map<String, Object> usercode = JSON.parseObject(ret, Map.class);
                ret = IOUtils.toString(new URL("https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=" + access_token + "&userid=" + usercode.get("UserId")), "UTF-8");
                Map<String, Object> user = JSON.parseObject(ret, Map.class);
                if(Integer.valueOf(user.get("errcode").toString()) != 0){
                    return "error";
                }
                System.out.println(user);
                model.addAttribute("uid", user.get("userid"));
                model.addAttribute("uname", user.get("name"));
            }else {
                redirectToAuth(request,response);
            }
            return "payschool";
        }else {
            //校外用户

            Object pp1 = ("".equals(payment.getP1name())?false:payment.getP1name());
            Object pp2 = ("".equals(payment.getP2name())?false:payment.getP2name());

            model.addAttribute("p1name", pp1);
            model.addAttribute("p2name", pp2);

//            if(payment.getIsnew() == 1){
//
//
//
//                return "paynew";
//            }
            model.addAttribute("p1item", false);
            model.addAttribute("p2item", false);

            int p1item = payment.getP1item();
            if( p1item!= 0 ){
                Iterable<Item> items = itemRepository.findByNameid(p1item);
                model.addAttribute("p1items", items);
                model.addAttribute("p1item", true);
            }

            int p2item = payment.getP2item();
            if( p2item!= 0 ){
                Iterable<Item> items = itemRepository.findByNameid(p2item);
                model.addAttribute("p2items", items);
                model.addAttribute("p2item", true);
            }


            //mark
            model.addAttribute("ismark", false);
            if(!"".equals(payment.getRemark())){
                model.addAttribute("ismark", true);
                model.addAttribute("mark", payment.getRemark());
            }


            //bill
            model.addAttribute("isBill",false);

            if(payment.isBill() == true){
                model.addAttribute("isBill",true);
                model.addAttribute("bills",billRepository.findAll());
            }

            return "pay";

        }
    }


    private void redirectToAuth(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String u = request.getRequestURL().toString();
        String reUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + wid + "&redirect_uri=" + URLEncoder.encode(u, "UTF-8") +
                "&response_type=code&scope=snsapi_base&agentid=" + agentid + "&state=" + "paynew" + "#wechat_redirect";
        response.sendRedirect(reUrl);
    }


}
