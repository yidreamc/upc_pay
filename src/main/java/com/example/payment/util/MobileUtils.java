package com.example.payment.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileUtils {

    public static boolean isMobileNO(String mobiles) {
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4])|(18[0-9])|(17[0-9])|(147))\\d{8}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }
}
