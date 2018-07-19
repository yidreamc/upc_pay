package com.example.payng.dto;

public class ItemOpt {

    private String name;

    private String key;

    private double amt;

    public ItemOpt(String name, String key, double amt) {
        this.name = name;
        this.key = key;
        this.amt = amt;
    }

    public ItemOpt() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
}
