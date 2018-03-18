package com.example.payment.model;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "order_20180301")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String uname;
    private String uid;
    private Timestamp orderTime;

    private String orderId;

    public Order() {
    }

    public Order(String uname, String uid) {
        this.uname = uname;
        this.uid = uid;
        this.orderTime = new Timestamp(System.currentTimeMillis());
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }
}
