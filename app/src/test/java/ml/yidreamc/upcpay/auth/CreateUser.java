package ml.yidreamc.upcpay.auth;


import ml.yidreamc.upcpay.common.entity.Manage;
import ml.yidreamc.upcpay.common.entity.ManageRepository;
import ml.yidreamc.upcpay.common.entity.entityenum.ManageType;
import ml.yidreamc.upcpay.common.util.MD5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateUser {

    @Autowired
    private ManageRepository manageRepository;

    @Test
    public void create(){
        Manage manage = new Manage();
        manage.setUname("admin");
        manage.setPwd(MD5.getMD5("admin" + "admin"));
        manage.setAdminType(ManageType.SUPPER);
        manageRepository.save(manage);
    }
}
