package com.example.payng.dto;

public class POpt {

    private String value;

    private String key;

    public POpt(String value, String key) {
        this.value = value;
        this.key = key;
    }

    public POpt() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
