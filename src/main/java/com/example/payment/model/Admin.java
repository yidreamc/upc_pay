package com.example.payment.model;

import javax.persistence.*;

@Entity
@Table(name = "admin_20180304")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //工号
    private String uname;
    private String pwd;
    private int sadmin;


    private String unit;

    public Admin(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public Admin() {
    }


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getSadmin() {
        return sadmin;
    }

    public void setSadmin(int sadmin) {
        this.sadmin = sadmin;
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
