package com.example.payment.util;

import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestUtils {

    public static Object post(String urlStr, JSONObject postData) throws IOException {
        String respData;
        URL url = new URL(urlStr);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        IOUtils.write(postData.toString(), httpURLConnection.getOutputStream(), "UTF-8");
        respData = IOUtils.toString(httpURLConnection.getInputStream(), "UTF-8");
        JSONObject respJson = JSONObject.fromObject(respData);
        return respJson;
    }

    public static JSONObject get(String urlStr) throws IOException {
        String responseBody = null;
        try {
            URL getUrl = new URL(urlStr);
            HttpURLConnection urlConnection = (HttpURLConnection) getUrl
                    .openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            int respCode = urlConnection.getResponseCode();
            if (HttpURLConnection.HTTP_OK == respCode) {
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
                String readLine = null;
                StringBuffer response = new StringBuffer();
                while (null != (readLine = bufferedReader.readLine())) {
                    response.append(readLine);
                }

                bufferedReader.close();
                responseBody = response.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return JSONObject.fromObject(responseBody);

    }

}
