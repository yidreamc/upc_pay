package com.example.payment.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Created by xhaiben on 2017/6/22.
 * 订单信息 javaBean
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "version",
        "billno",
        "orderinfono",
        "orderinfoname",
        "returnURL",
        "billremark",
        "billdtl"
})
@XmlRootElement(name = "billinfo")
public class BillInfo {
    private String version;
    private String billno;
    private String orderinfono;
    private String orderinfoname;
    private String returnURL;
    private String billremark;
    private List<BillDtl> billdtl;

    public BillInfo() {

    }

    public List<BillDtl> getBilldtl() {
        return billdtl;
    }

    public void setBilldtl(List<BillDtl> billdtl) {
        this.billdtl = billdtl;
    }


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getOrderinfono() {
        return orderinfono;
    }

    public void setOrderinfono(String orderinfono) {
        this.orderinfono = orderinfono;
    }

    public String getOrderinfoname() {
        return orderinfoname;
    }

    public void setOrderinfoname(String orderinfoname) {
        this.orderinfoname = orderinfoname;
    }

    public String getReturnURL() {
        return returnURL;
    }

    public void setReturnURL(String returnURL) {
        this.returnURL = returnURL;
    }

    public String getBillremark() {
        return billremark;
    }

    public void setBillremark(String billremark) {
        this.billremark = billremark;
    }

}
