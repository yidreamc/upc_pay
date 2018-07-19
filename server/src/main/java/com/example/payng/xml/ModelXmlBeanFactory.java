package com.example.payng.xml;


public class ModelXmlBeanFactory {

    private String xml_version = "1.0.0.4";

    private String nic_netfee_feeitemid;

    private BillDtl billDtl;
    private BillInfo billInfo;
    private PayResult payResult;

    public ModelXmlBeanFactory(String nic_netfee_feeitemid) {
        this.nic_netfee_feeitemid = nic_netfee_feeitemid;
    }

    public BillDtl getBillDtlBean() {
        BillDtl billDtl = new BillDtl();
        billDtl.setFeeitemid(this.nic_netfee_feeitemid);
        this.billDtl = billDtl;
        return this.billDtl;
    }

    public BillDtl getBillDtlBean(String feeord, double amt, String dtlremark) {
        this.getBillDtlBean();
        this.billDtl.setFeeord(feeord);
        this.billDtl.setAmt(amt);
        this.billDtl.setDtlremark(dtlremark);
        return this.billDtl;
    }

    public BillInfo getBillInfoBean() {
        BillInfo billInfo = new BillInfo();
        billInfo.setVersion(this.xml_version);
        this.billInfo = billInfo;
        return billInfo;
    }

    public PayResult getPayResultBean() {
        this.payResult = new PayResult();
        return this.payResult;
    }
}
