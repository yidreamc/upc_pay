package com.example.payment.model;

import javax.persistence.*;

@Entity
@Table(name = "admin_20180304")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String uname;
    private String pwd;

    public Admin(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public Admin() {
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
