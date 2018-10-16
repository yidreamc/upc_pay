package ml.yidreamc.upcpay.common.check;

import ml.yidreamc.upcpay.common.check.util.MobileUtils;

public class PhoneCheck implements Check {

    @Override
    public void doCheck(String str) throws Exception {
        if (!MobileUtils.isMobileNO(str)) {
            throw new Exception("手机号格式错误");
        }
    }
}
