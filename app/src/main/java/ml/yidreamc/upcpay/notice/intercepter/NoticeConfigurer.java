package ml.yidreamc.upcpay.notice.intercepter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class NoticeConfigurer extends WebMvcConfigurerAdapter {

    @Autowired
    private NoticeIntercepter noticeIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(noticeIntercepter).addPathPatterns("/pay/**");
        super.addInterceptors(registry);
    }
}
