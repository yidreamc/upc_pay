package ml.yidreamc.upcpay.common.check;

import ml.yidreamc.upcpay.common.check.util.IdcardUtil;

public class IDCheck implements Check {

    @Override
    public void doCheck(String str) throws Exception {
        if (!IdcardUtil.isIdcard(str)) {
            throw new Exception("身份证格式错误");
        }
    }
}
