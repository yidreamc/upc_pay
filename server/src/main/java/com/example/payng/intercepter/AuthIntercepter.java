package com.example.payng.intercepter;

import com.example.payng.entity.Manage;
import com.example.payng.entity.entityenum.ManageType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class AuthIntercepter extends HandlerInterceptorAdapter {

    @Value("${app.env}")
    private String env;


    @Override
    @SuppressWarnings("unchecked")
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Manage manage = (Manage) request.getSession().getAttribute("manage");

        if ("dev".equals(env)) {
            if(manage == null){
                manage = new Manage();
                manage.setId(1);
                manage.setAdminType(ManageType.DEP);
                request.getSession().setAttribute("manage", manage);
            }
            return true;
        }

        if (manage == null) {
            ServletOutputStream out = response.getOutputStream();
            out.print("{\n" +
                    "\t\"code\":401,\n" +
                    "\t\"msg\":\"no auth\",\n" +
                    "\t\"data\":\"\"\n" +
                    "}");
            return false;
        }
        return true;
    }
}
