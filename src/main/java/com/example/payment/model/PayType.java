package com.example.payment.model;

import javax.persistence.*;

@Entity
@Table(name = "paytype_20180301")
public class PayType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String type;
    private double money;

    private int pid;

    private String mykey;

    public PayType(String type, double money, int pid, String mykey) {
        this.type = type;
        this.money = money;
        this.pid = pid;
        this.mykey = mykey;
    }

    public String getMykey() {
        return mykey;
    }

    public void setMykey(String mykey) {
        this.mykey = mykey;
    }

    public PayType(String type, double money) {
        this.type = type;
        this.money = money;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public PayType(String type, double money, int pid) {
        this.type = type;
        this.money = money;
        this.pid = pid;
    }

    public PayType() {
    }
}
