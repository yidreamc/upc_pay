package ml.yidreamc.upcpay.auth.controller;

import ml.yidreamc.upcpay.common.dto.Response;
import ml.yidreamc.upcpay.common.entity.Manage;
import ml.yidreamc.upcpay.common.entity.ManageRepository;
import ml.yidreamc.upcpay.common.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ManageController {

    @Autowired
    private ManageRepository manageRepository;

    @PostMapping("/login")
    public Response login(@RequestBody Map<String,String> params){
        String uname = params.get("uname");
        String pwd = params.get("pwd");
        Manage manage = manageRepository.findFirstByUnameAndPwd(uname,MD5.getMD5(uname + pwd));
        if(manage == null){
            return new Response(1,"用户名或密码不正确");
        }
        return new Response(0,"",manage);
    }
}