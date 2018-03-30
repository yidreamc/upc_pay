package com.example.payment.model;

import javax.persistence.*;

@Entity
@Table(name = "payment_20180301")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String sysid;
    private String subsysid;

    @Column(length = 2047)
    private String cert;
    private String feeitemid;

    private String name;
    private String remark;

    private String p1name;
    private int p1code = 0;
    private String p2name;
    private int p2code = 0;
    private boolean isIndefine = true;

    private int type = 2;

    private int aid = 0;

    private int isnew = 0;


    private int p1item = 0;

    private int p2item = 0;

    public int getP1item() {
        return p1item;
    }

    public void setP1item(int p1item) {
        this.p1item = p1item;
    }

    public int getP2item() {
        return p2item;
    }

    public void setP2item(int p2item) {
        this.p2item = p2item;
    }

    public int getIsnew() {
        return isnew;
    }

    public void setIsnew(int isnew) {
        this.isnew = isnew;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getP1code() {
        return p1code;
    }

    public void setP1code(int p1code) {
        this.p1code = p1code;
    }

    public int getP2code() {
        return p2code;
    }

    public void setP2code(int p2code) {
        this.p2code = p2code;
    }

    public String getP1name() {
        return p1name;
    }

    public void setP1name(String p1name) {
        this.p1name = p1name;
    }

    public String getP2name() {
        return p2name;
    }

    public void setP2name(String p2name) {
        this.p2name = p2name;
    }

    public boolean isIndefine() {
        return isIndefine;
    }

    public void setIndefine(boolean indefine) {
        isIndefine = indefine;
    }

    public String getFeeitemid() {
        return feeitemid;
    }

    public void setFeeitemid(String feeitemid) {
        this.feeitemid = feeitemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
    }

    public String getSubsysid() {
        return subsysid;
    }

    public void setSubsysid(String subsysid) {
        this.subsysid = subsysid;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public Payment() {
    }

    public Payment(String sysid, String subsysid, String cert) {
        this.sysid = sysid;
        this.subsysid = subsysid;
        this.cert = cert;
    }

    public Payment(String sysid, String subsysid, String cert, String feeitemid, String name, String remark, String p1name, int p1code, String p2name, int p2code, boolean isIndefine) {
        this.sysid = sysid;
        this.subsysid = subsysid;
        this.cert = cert;
        this.feeitemid = feeitemid;
        this.name = name;
        this.remark = remark;
        this.p1name = p1name;
        this.p1code = p1code;
        this.p2name = p2name;
        this.p2code = p2code;
        this.isIndefine = isIndefine;
    }
}
