package com.example.payment.model;

import javax.persistence.*;

@Entity
@Table(name = "payment_item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int nameid;

    private String name;
    private String value;

    public Item(int nameid, String name, String value) {
        this.nameid = nameid;
        this.name = name;
        this.value = value;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNameid() {
        return nameid;
    }

    public void setNameid(int nameid) {
        this.nameid = nameid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
