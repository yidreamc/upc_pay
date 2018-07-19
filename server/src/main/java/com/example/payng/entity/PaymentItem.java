package com.example.payng.entity;

import com.example.payng.entity.entityenum.FillType;

import javax.persistence.*;

/**
 * 缴费类型
 */
@Entity
@Table(name = "payment_item")
public class PaymentItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //缴费项目
    private int paymentId;

    //单项名称
    private String name;

    // 缴费方式
    // 0 手动输入  1 根据列表选择
    @Enumerated(EnumType.STRING)
    private FillType type;

    public PaymentItem(int paymentId, String name, FillType type) {
        this.paymentId = paymentId;
        this.name = name;
        this.type = type;
    }



    public PaymentItem() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FillType getType() {
        return type;
    }

    public void setType(FillType type) {
        this.type = type;
    }


}
