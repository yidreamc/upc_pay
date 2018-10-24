package ml.yidreamc.upcpay.net.config;

import ml.yidreamc.upcpay.net.ruijieservice.SamServicePortType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuijieBean {

    @Value("${app.ruijie.user}")
    private String user;

    @Value("${app.ruijie.pwd}")
    private String pwd;

    @Value("${app.ruijie.addr}")
    private String addr;


    @Bean
    public SamServicePortType getSamServicePortType(){
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setUsername(user);
        factoryBean.setPassword(pwd);
        factoryBean.setAddress(addr);
        factoryBean.setServiceClass(SamServicePortType.class);
        return factoryBean.create(SamServicePortType.class);
    }
}
