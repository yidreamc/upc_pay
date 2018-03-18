package com.example.payment.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 支付结果 javaBean
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "payResult")

public class PayResult {

    private String billno;
    private double billamt;
    private String paidtime;
    private String trade_no;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public double getBillamt() {
        return billamt;
    }

    public void setBillamt(double billamt) {
        this.billamt = billamt;
    }

    public String getPaidtime() {
        return paidtime;
    }

    public void setPaidtime(String paidtime) {
        this.paidtime = paidtime;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    @Override
    public String toString() {
        return "PayResult{" +
                "billno='" + billno + '\'' +
                ", billamt='" + billamt + '\'' +
                ", paidtime='" + paidtime + '\'' +
                ", trade_no='" + trade_no + '\'' +
                '}';
    }
}
