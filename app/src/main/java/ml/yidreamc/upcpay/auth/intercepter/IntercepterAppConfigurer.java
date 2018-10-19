package ml.yidreamc.upcpay.auth.intercepter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class IntercepterAppConfigurer extends WebMvcConfigurerAdapter {

    @Autowired
    private AuthIntercepter authIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(authIntercepter).addPathPatterns("/manage/**");
        registry.addInterceptor(authIntercepter).addPathPatterns("/manageadmin/**");
        super.addInterceptors(registry);
    }
}
