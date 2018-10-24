package ml.yidreamc.upcpay.notice;

import ml.yidreamc.upcpay.notice.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Redis {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void redis(){

        List<String>  l = new ArrayList<>();
        l.add("2");
        l.add("2");
        l.add("2");
        redisUtil.setValue("l",l);

        l = (List<String>) redisUtil.getValue("l");

        for(String i:l){
            System.out.println(i);
        }

    }
}
