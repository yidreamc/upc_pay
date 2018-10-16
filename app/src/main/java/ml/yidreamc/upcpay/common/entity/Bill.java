package ml.yidreamc.upcpay.common.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 开票信息
 */
@Entity
@Table(name = "payment_bill")
public class Bill {

    @Id
    private String taxCode;

    private String zzAddress;

    private String zzBank;

    private String zzBnkName;

    private String zzTel;

    private String zzUnit;

    public Bill(String taxCode, String zzAddress, String zzBank, String zzBnkName, String zzTel, String zzUnit) {
        this.taxCode = taxCode;
        this.zzAddress = zzAddress;
        this.zzBank = zzBank;
        this.zzBnkName = zzBnkName;
        this.zzTel = zzTel;
        this.zzUnit = zzUnit;
    }

    public Bill() {
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
