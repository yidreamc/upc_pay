package com.example.payment.pojo;

import com.example.payment.util.IdcardUtil;

public class IdCheck implements Check{


    @Override
    public boolean doCheck(String str) {
        return IdcardUtil.isIdcard(str);
    }

    @Override
    public String err() {
        return "身份证格式错误";
    }


}
