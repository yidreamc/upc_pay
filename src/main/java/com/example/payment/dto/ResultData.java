package com.example.payment.dto;


import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class ResultData {
    private static Map<String, Object> resultMap;

    public static <T> String ok(T data) {
        resultMap = new HashMap<>();
        resultMap.put("result", "success");
        resultMap.put("data", data);
        return JSON.toJSONString(resultMap);
    }

    public static String error(String message) {
        resultMap = new HashMap<>();
        resultMap.put("result", "error");
        resultMap.put("message", message);
        return JSON.toJSONString(resultMap);
    }
}
