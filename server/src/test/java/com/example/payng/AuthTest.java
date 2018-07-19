package com.example.payng;

import com.example.payng.util.MD5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthTest {


    @Value("${app.key}")
    private String key;

    @Test
    public void  auth(){
//        String un = "1507020129";
        String un = "20110034";
        String time = "1";

        String str = un + key + time;
        str = MD5.getMD5(str);

//        str = "http://wxsportscard.upc.edu.cn:8080/admin?un=1507020129&time=1&verify=" + str;
        str = "http://wxsportscard.upc.edu.cn:8080/admin?un=20110034&time=1&verify=" + str;
        System.out.println(str);

    }
}
