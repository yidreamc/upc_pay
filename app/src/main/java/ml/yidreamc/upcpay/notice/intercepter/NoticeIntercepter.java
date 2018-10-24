package ml.yidreamc.upcpay.notice.intercepter;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import ml.yidreamc.upcpay.common.dto.Response;
import ml.yidreamc.upcpay.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
@Slf4j
public class NoticeIntercepter extends HandlerInterceptorAdapter {

    @Autowired
    private NoticeService noticeService;

    @Override
    @SuppressWarnings("unchecked")
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        String check = noticeService.checkNow();
        if(check!= null){
            response.setContentType("text/html; charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            Gson gson = new Gson();
            String res = gson.toJson(new Response<>(503,check));
            out.print(res);
            return false;
        }
        return true;
    }
}
