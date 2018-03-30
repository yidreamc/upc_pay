package com.example.payment.model;

import javax.persistence.*;

@Entity
@Table(name = "payment_itemname")
public class ItemName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public ItemName(String name) {
        this.name = name;
    }

    public ItemName() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
