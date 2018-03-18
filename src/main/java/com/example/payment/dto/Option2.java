package com.example.payment.dto;

public class Option2 {

    private String type;
    private String money;
    private String key;

    public Option2(String type, String money, String key) {
        this.type = type;
        this.money = money;
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
