package ml.yidreamc.upcpay.common.controller;

import ml.yidreamc.upcpay.common.dto.Response;
import ml.yidreamc.upcpay.common.entity.Manage;
import ml.yidreamc.upcpay.common.entity.ManageRepository;
import ml.yidreamc.upcpay.common.util.MD5;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

@Controller
@Slf4j
public class ManageController {

    @Autowired
    private HttpSession httpSession;

    @Value("${app.key}")
    private String key;

    @Value("${app.fronturl}")
    private String fronturl;


    @Autowired
    private ManageRepository manageRepository;

    @RequestMapping(value = "/admin", params = {"verify"})
    public String auth(String verify, String un, String time) throws NoSuchAlgorithmException {
        Boolean jd = md5ParaVerify(time, un, verify);

        //数字石大登陆成功
        if (jd == true) {
            Manage manage = manageRepository.findByUname(un);
            //不在管理员列表中
            if (manage == null) {
                log.info(un + " 不在管理员列表中");
                return "redirect:" + fronturl + "/#/noauth";
            }
            return "redirect:" + fronturl + "/#/auth?verify=" + MD5.getMD5(un + key) + "&un=" + un;
        }
        log.info(un + " 数字石大登陆验证失败");
        return "redirect:" + fronturl + "/#/noauth";
    }

    @PostMapping(value = "/auth")
    @ResponseBody
    public Response getPaymentPageData(@RequestBody Map<String,String> map) {
        String un = map.get("un");
        String verify = map.get("verify");

        String str = un + key;
        str = MD5.getMD5(str);
        if (str.equals(verify)) {
            log.info("管理员 : " + un + " 登陆成功");

            Manage manage = manageRepository.findByUname(un);
            //不在管理员列表中
            if (manage == null) {
                return new Response(1, "");
            }

            httpSession.setAttribute("manage", manage);
            return new Response(0, "");
        }
        return new Response(1, "");

    }

    @GetMapping("/isauth")
    @ResponseBody
    public Response isAuth(@RequestBody Map<String,String> param){
        String un = param.get("un");
        Manage manage = manageRepository.findByUname(un);
        //不在管理员列表中
        if (manage == null) {
            return new Response(1, "");
        }

        manage = (Manage)httpSession.getAttribute("manage");

        //没有登陆过
        if(manage == null){
            return new Response(1,"");
        }
        return new Response(0,"");
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
