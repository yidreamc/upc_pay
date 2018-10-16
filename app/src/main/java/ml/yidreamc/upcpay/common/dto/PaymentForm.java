package ml.yidreamc.upcpay.common.dto;

import ml.yidreamc.upcpay.common.entity.entityenum.CheckType;
import ml.yidreamc.upcpay.common.entity.entityenum.FillType;
import ml.yidreamc.upcpay.common.entity.entityenum.UserType;

import java.util.List;

public class PaymentForm {

    private int id = 0;

    private String name;
    private UserType type;

    private String p1name;
    private FillType p1method;
    private List<POpt> p1opt;
    private CheckType p1code;

    private String p2name;
    private FillType p2method;
    private List<POpt> p2opt;
    private CheckType p2code;

    private List<Items> items;

    private BillType isBill;

    private String remark;

    private String subsysid;
    private String sysid;
    private String feeitemid;
    private String cert;

    //老版本的id，为了兼容，新版本创建项目不需要此参数
    private int oldId = 0;

    public PaymentForm() {
    }

    public PaymentForm(String name, UserType type, String p1name, FillType p1method, List<POpt> p1opt, CheckType p1code, String p2name, FillType p2method, List<POpt> p2opt, CheckType p2code, List<Items> items, BillType isBill, String remark, String subsysid, String sysid, String feeitemid, String cert) {
        this.name = name;
        this.type = type;
        this.p1name = p1name;
        this.p1method = p1method;
        this.p1opt = p1opt;
        this.p1code = p1code;
        this.p2name = p2name;
        this.p2method = p2method;
        this.p2opt = p2opt;
        this.p2code = p2code;
        this.items = items;
        this.isBill = isBill;
        this.remark = remark;
        this.subsysid = subsysid;
        this.sysid = sysid;
        this.feeitemid = feeitemid;
        this.cert = cert;
    }

    public PaymentForm(String name, UserType type, String p1name, FillType p1method, CheckType p1code, String p2name, FillType p2method, CheckType p2code, BillType isBill, String remark, String subsysid, String sysid, String feeitemid, String cert) {
        this.name = name;
        this.type = type;
        this.p1name = p1name;
        this.p1method = p1method;
        this.p1code = p1code;
        this.p2name = p2name;
        this.p2method = p2method;
        this.p2code = p2code;
        this.isBill = isBill;
        this.remark = remark;
        this.subsysid = subsysid;
        this.sysid = sysid;
        this.feeitemid = feeitemid;
        this.cert = cert;
    }

    public int getId() {
        return id;
    }

    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
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

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getP1name() {
        return p1name;
    }

    public void setP1name(String p1name) {
        this.p1name = p1name;
    }

    public FillType getP1method() {
        return p1method;
    }

    public void setP1method(FillType p1method) {
        this.p1method = p1method;
    }

    public List<POpt> getP1opt() {
        return p1opt;
    }

    public void setP1opt(List<POpt> p1opt) {
        this.p1opt = p1opt;
    }

    public CheckType getP1code() {
        return p1code;
    }

    public void setP1code(CheckType p1code) {
        this.p1code = p1code;
    }

    public String getP2name() {
        return p2name;
    }

    public void setP2name(String p2name) {
        this.p2name = p2name;
    }

    public FillType getP2method() {
        return p2method;
    }

    public void setP2method(FillType p2method) {
        this.p2method = p2method;
    }

    public List<POpt> getP2opt() {
        return p2opt;
    }

    public void setP2opt(List<POpt> p2opt) {
        this.p2opt = p2opt;
    }

    public CheckType getP2code() {
        return p2code;
    }

    public void setP2code(CheckType p2code) {
        this.p2code = p2code;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public BillType getIsBill() {
        return isBill;
    }

    public void setIsBill(BillType isBill) {
        this.isBill = isBill;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSubsysid() {
        return subsysid;
    }

    public void setSubsysid(String subsysid) {
        this.subsysid = subsysid;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
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
