package ml.yidreamc.upcpay.auth.intercepter;

import com.google.gson.Gson;
import ml.yidreamc.upcpay.auth.entity.Manage;
import lombok.extern.slf4j.Slf4j;
import ml.yidreamc.upcpay.common.dto.Response;
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
            Gson gson = new Gson();
            String res = gson.toJson(new Response(401,"no auth"));
            out.print(res);
            return false;
        }
        return true;
    }
}
