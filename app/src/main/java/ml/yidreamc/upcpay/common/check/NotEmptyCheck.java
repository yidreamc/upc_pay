package ml.yidreamc.upcpay.common.check;

public class NotEmptyCheck implements Check {

    @Override
    public void doCheck(String str) throws Exception {
        if("".equals(str) || null == str){
            throw new Exception("必填参数不能为空");
        }
    }

}
