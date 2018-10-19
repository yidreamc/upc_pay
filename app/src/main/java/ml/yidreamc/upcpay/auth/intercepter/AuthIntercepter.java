package ml.yidreamc.upcpay.auth.intercepter;

import ml.yidreamc.upcpay.common.entity.Manage;
import ml.yidreamc.upcpay.common.entity.entityenum.ManageType;
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
