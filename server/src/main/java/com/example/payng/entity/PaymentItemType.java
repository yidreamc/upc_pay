package com.example.payng.entity;

import javax.persistence.*;

@Entity
@Table(name = "payment_item_type")
public class PaymentItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int itemId;

    private String name;

    //缴费价格
    private double price;

    public PaymentItemType(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public PaymentItemType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
