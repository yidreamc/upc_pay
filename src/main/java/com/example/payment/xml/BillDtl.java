package com.example.payment.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 订单详细信息 javaBean
 */
@XmlType(propOrder = {
        "feeitemid",
        "feeord",
        "amt",
        "dtlremark"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class BillDtl {
    @XmlElement
    private String feeitemid;
    private String feeord;
    private double amt;
    private String dtlremark;

    public BillDtl() {
    }

    public String getDtlremark() {
        return dtlremark;
    }

    public void setDtlremark(String dtlremark) {
        this.dtlremark = dtlremark;
    }


    public String getFeeitemid() {
        return feeitemid;
    }

    public void setFeeitemid(String feeitemid) {
        this.feeitemid = feeitemid;
    }

    public String getFeeord() {
        return feeord;
    }

    public void setFeeord(String feeord) {
        this.feeord = feeord;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
}
