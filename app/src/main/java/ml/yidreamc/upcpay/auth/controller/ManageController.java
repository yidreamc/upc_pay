package ml.yidreamc.upcpay.auth.controller;

import ml.yidreamc.upcpay.common.dto.Response;
import ml.yidreamc.upcpay.auth.entity.Manage;
import ml.yidreamc.upcpay.auth.entity.ManageRepository;
import ml.yidreamc.upcpay.common.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class ManageController {

    @Autowired
    private ManageRepository manageRepository;

    @PostMapping("/login")
    public Response login(@RequestBody Map<String,String> params, HttpServletRequest request){
        String uname = params.get("uname");
        String pwd = params.get("pwd");
        Manage manage = manageRepository.findFirstByUnameAndPwd(uname,MD5.getMD5(uname + pwd));
        if(manage == null){
            return new Response(1,"用户名或密码不正确");
        }
        request.getSession().setAttribute("manage",manage);
        return new Response(0,"",manage);
    }
}
