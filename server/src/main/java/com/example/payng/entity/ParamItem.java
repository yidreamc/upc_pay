package com.example.payng.entity;

import com.example.payng.entity.entityenum.ParamType;

import javax.persistence.*;

/**
 * 选择项 - 如果参数为用户选择
 */
@Entity
@Table(name = "param_item")
public class ParamItem {

    @Id
    @GeneratedValue
    private int id;

    //缴费项目的id
    private int paymentId;

    //具体哪个参数 1 or 2
    @Enumerated(EnumType.STRING)
    private ParamType pnum;

    //值
    private String value;

    public ParamItem(int paymentId, ParamType pnum, String value) {
        this.paymentId = paymentId;
        this.pnum = pnum;
        this.value = value;
    }

    public ParamItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public ParamType getPnum() {
        return pnum;
    }

    public void setPnum(ParamType pnum) {
        this.pnum = pnum;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
