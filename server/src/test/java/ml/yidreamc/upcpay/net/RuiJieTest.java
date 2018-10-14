package ml.yidreamc.upcpay.net;

import ml.yidreamc.upcpay.net.config.PackageName;
import ml.yidreamc.upcpay.net.config.TemplateName;
import ml.yidreamc.upcpay.net.ruijieservice.*;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;


public class RuiJieTest {

    private SamServicePortType samServicePortType;

//    private String userId = "1507010425"; // 刘宁
    private String userId = "1507020129";

    @Before
    public void init(){
        samServicePortType = getSamServicePortType();
    }


    /**
     * 测试缴费
     */
    @Test
    public void testFund(){
        String txid = samServicePortType.createTxid();
        AccountOperationResult result = getSamServicePortType().fund(userId,23,BigDecimal.valueOf(20),txid);
        System.out.println(result.getErrorMessage());
    }

    /**
     * 查询所用用户套餐和模板
     */
    @Test
    public void findAllUserTemplatePackagesResult(){
        FindAllUserTemplatePackagesResult result =  samServicePortType.findAllUserTemplatePackages();
        List<UserPackageTemplate> templates = result.getTemplatePackages();
        templates.forEach(template ->{
            System.out.println(template.getUserPackageId());
            System.out.println(template.getUserTemplateId());
        } );
    }

    @Test
    public void queryUser(){
        QueryUserParams params = new QueryUserParams();
        params.setUserId(userId);
        QueryUserResult result = samServicePortType.queryUser(params);
        List<UserInfo> infos = result.getData();
        UserInfo i = infos.get(0);
        System.out.println(i.getAtName());
        System.out.println(i.getPackageName());
        System.out.println(i.getPeriodStartTime());
        System.out.println(i.getAccountFee());
    }

    /**
     * 变更用户套餐
     */
    @Test
    public void testModifyUserPackage(){
        short type = 2;
        SamApiBaseResult result =  samServicePortType.modifyPackageConfirmInfos(userId,TemplateName.TWENTY_YUN,PackageName.TWENTY_YUN,type);
        System.out.println(result.getErrorCode());
        System.out.println(result.getErrorMessage());
    }

    public SamServicePortType getSamServicePortType(){
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setUsername("weixin");
        factoryBean.setPassword("Weixin1386@upc");
        factoryBean.setAddress("http://121.251.251.210:8080/sam/services/samapi?wsdl");
        factoryBean.setServiceClass(SamServicePortType.class);
        return factoryBean.create(SamServicePortType.class);
    }
}
