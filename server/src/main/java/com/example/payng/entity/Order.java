package com.example.payng.entity;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String p1;
    private String p2;
    private Timestamp orderTime;

    private int paymentId;

    public Order() {
    }

    public Order(String p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.orderTime = new Timestamp(System.currentTimeMillis());
    }

    public Order(String p1, String p2, int paymentId) {
        this.p1 = p1;
        this.p2 = p2;
        this.orderTime = new Timestamp(System.currentTimeMillis());
        this.paymentId = paymentId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }
}
