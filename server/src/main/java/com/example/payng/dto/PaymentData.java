package com.example.payng.dto;

import java.util.List;

public class PaymentData {

    private int id;

    private String p1;

    private String p2;

    private List<Double> amt;

    private String taxCode;

    private String zzAddress;

    private String zzBank;

    private String zzBnkName;

    private String zzTel;

    private String zzUnit;

    public PaymentData() {
    }

    public PaymentData(String p1, String p2, List<Double> amt, String taxCode, String zzAddress, String zzBank, String zzBnkName, String zzTel, String zzUnit) {
        this.p1 = p1;
        this.p2 = p2;
        this.amt = amt;
        this.taxCode = taxCode;
        this.zzAddress = zzAddress;
        this.zzBank = zzBank;
        this.zzBnkName = zzBnkName;
        this.zzTel = zzTel;
        this.zzUnit = zzUnit;
    }

    public PaymentData(int id, String p1, String p2, List<Double> amt, String taxCode, String zzAddress, String zzBank, String zzBnkName, String zzTel, String zzUnit) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.amt = amt;
        this.taxCode = taxCode;
        this.zzAddress = zzAddress;
        this.zzBank = zzBank;
        this.zzBnkName = zzBnkName;
        this.zzTel = zzTel;
        this.zzUnit = zzUnit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public List<Double> getAmt() {
        return amt;
    }

    public void setAmt(List<Double> amt) {
        this.amt = amt;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getZzAddress() {
        return zzAddress;
    }

    public void setZzAddress(String zzAddress) {
        this.zzAddress = zzAddress;
    }

    public String getZzBank() {
        return zzBank;
    }

    public void setZzBank(String zzBank) {
        this.zzBank = zzBank;
    }

    public String getZzBnkName() {
        return zzBnkName;
    }

    public void setZzBnkName(String zzBnkName) {
        this.zzBnkName = zzBnkName;
    }

    public String getZzTel() {
        return zzTel;
    }

    public void setZzTel(String zzTel) {
        this.zzTel = zzTel;
    }

    public String getZzUnit() {
        return zzUnit;
    }

    public void setZzUnit(String zzUnit) {
        this.zzUnit = zzUnit;
    }
}
