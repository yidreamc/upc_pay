package com.example.payng.check;

import com.example.payng.check.util.IdcardUtil;
import com.example.payng.check.util.MobileUtils;

public class PhoneCheck implements Check {

    @Override
    public void doCheck(String str) throws Exception {
        if (!MobileUtils.isMobileNO(str)) {
            throw new Exception("手机号格式错误");
        }
    }
}
