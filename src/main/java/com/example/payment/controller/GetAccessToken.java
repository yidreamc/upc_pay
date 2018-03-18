package com.example.payment.controller;

import com.example.payment.util.HttpUtils;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.util.Calendar;


@RestController
public class GetAccessToken {

    private static Calendar calendar = Calendar.getInstance();
    private static String token = null;

    @Value("${app.id}")
    private String id ;

    @Value("${app.secrect}")
    private String secrect ;

    @GetMapping("/accessToken")
    public Object getToken() {
        try {
            long oldDate = calendar.getTime().getTime();
            Calendar c = Calendar.getInstance();
            long newDate = c.getTime().getTime();
            if (newDate - oldDate >= 7200000) {
                calendar = Calendar.getInstance();
                token = null;
            }
            if (token == null) {
                URL url = new URL("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=" +
                        id + "&corpsecret=" + secrect);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.connect();
                String respContent = HttpUtils.getPostData(httpsURLConnection);
                System.out.println(respContent);
                JSONObject jsonObject = JSONObject.fromObject(respContent);
                token = jsonObject.getString("access_token");
            }
            return token;

        } catch (Exception e) {

            e.printStackTrace();
            return "error";
        }
    }
}
