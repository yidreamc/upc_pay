package ml.yidreamc.upcpay.auth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ml.yidreamc.upcpay.common.entity.entityenum.ManageType;

import javax.persistence.*;

@Entity
@Table(name = "pay_manage")
public class Manage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 用户名 登录名
     */
    private String uname;

    @JsonIgnore
    private String pwd;

    @Enumerated(EnumType.STRING)
    private ManageType adminType;


    private String unit;

    private int createId;

    public Manage(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public Manage(String uname, String pwd, ManageType adminType, String unit, int createId) {
        this.uname = uname;
        this.pwd = pwd;
        this.adminType = adminType;
        this.unit = unit;
        this.createId = createId;
    }

    public Manage() {
    }

    public int getCreateId() {
        return createId;
    }

    public void setCreateId(int createId) {
        this.createId = createId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ManageType getAdminType() {
        return adminType;
    }

    public void setAdminType(ManageType adminType) {
        this.adminType = adminType;
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
