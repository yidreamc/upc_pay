package com.example.payng.entity;

import com.example.payng.dto.BillType;
import com.example.payng.entity.entityenum.CheckType;
import com.example.payng.entity.entityenum.FillType;
import com.example.payng.entity.entityenum.ProType;
import com.example.payng.entity.entityenum.UserType;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //缴费项目名称
    private String name;

    //缴费项目备注
    private String remark;

    //参数及校验规则
    private String p1name;
    @Enumerated(EnumType.STRING)
    private CheckType p1Check;
    private String p2name;
    @Enumerated(EnumType.STRING)
    private CheckType p2Check;

    //用户填入参数的方式
    @Enumerated(EnumType.STRING)
    private FillType p1method;
    @Enumerated(EnumType.STRING)
    private FillType p2method;

    //缴费类型
    @Enumerated(EnumType.STRING)
    private UserType type;

    //是否引入票据信息
    @Enumerated(EnumType.STRING)
    private BillType isBill;

    //项目类型
    @Enumerated(EnumType.STRING)
    private ProType proType;

    //必填参数
    private String sysid;
    private String subsysid;
    private String feeitemid;
    @Column(length = 2047)
    private String cert;

    //创建者
    private int createUser;

    public Payment() {
    }

    public Payment(String name, String remark, String p1name, CheckType p1Check, String p2name, CheckType p2Check, FillType p1method, FillType p2method, UserType type, BillType isBill, ProType proType, String sysid, String subsysid, String feeitemid, String cert) {
        this.name = name;
        this.remark = remark;
        this.p1name = p1name;
        this.p1Check = p1Check;
        this.p2name = p2name;
        this.p2Check = p2Check;
        this.p1method = p1method;
        this.p2method = p2method;
        this.type = type;
        this.isBill = isBill;
        this.proType = proType;
        this.sysid = sysid;
        this.subsysid = subsysid;
        this.feeitemid = feeitemid;
        this.cert = cert;
    }

    public void setData(String name, String remark, String p1name, CheckType p1Check, String p2name, CheckType p2Check, FillType p1method, FillType p2method, UserType type, BillType isBill, ProType proType, String sysid, String subsysid, String feeitemid, String cert) {
        this.name = name;
        this.remark = remark;
        this.p1name = p1name;
        this.p1Check = p1Check;
        this.p2name = p2name;
        this.p2Check = p2Check;
        this.p1method = p1method;
        this.p2method = p2method;
        this.type = type;
        this.isBill = isBill;
        this.proType = proType;
        this.sysid = sysid;
        this.subsysid = subsysid;
        this.feeitemid = feeitemid;
        this.cert = cert;
    }

    public int getCreateUser() {
        return createUser;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getP1name() {
        return p1name;
    }

    public void setP1name(String p1name) {
        this.p1name = p1name;
    }

    public CheckType getP1Check() {
        return p1Check;
    }

    public void setP1Check(CheckType p1Check) {
        this.p1Check = p1Check;
    }

    public String getP2name() {
        return p2name;
    }

    public void setP2name(String p2name) {
        this.p2name = p2name;
    }

    public CheckType getP2Check() {
        return p2Check;
    }

    public void setP2Check(CheckType p2Check) {
        this.p2Check = p2Check;
    }

    public FillType getP1method() {
        return p1method;
    }

    public void setP1method(FillType p1method) {
        this.p1method = p1method;
    }

    public FillType getP2method() {
        return p2method;
    }

    public void setP2method(FillType p2method) {
        this.p2method = p2method;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public BillType getBill() {
        return isBill;
    }

    public void setBill(BillType bill) {
        isBill = bill;
    }

    public ProType getProType() {
        return proType;
    }

    public void setProType(ProType proType) {
        this.proType = proType;
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

    public String getFeeitemid() {
        return feeitemid;
    }

    public void setFeeitemid(String feeitemid) {
        this.feeitemid = feeitemid;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }
}
