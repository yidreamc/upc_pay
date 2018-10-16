package ml.yidreamc.upcpay.common.dto;

import ml.yidreamc.upcpay.common.entity.entityenum.FillType;

import java.util.List;

public class Items {

    private String name;

    private String key;

    private FillType method;

    private List<ItemOpt> opt;

    public Items(String name, String key, FillType method, List<ItemOpt> opt) {
        this.name = name;
        this.key = key;
        this.method = method;
        this.opt = opt;
    }

    public Items(String name, String key, FillType method) {
        this.name = name;
        this.key = key;
        this.method = method;
    }

    public Items() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public FillType getMethod() {
        return method;
    }

    public void setMethod(FillType method) {
        this.method = method;
    }

    public List<ItemOpt> getOpt() {
        return opt;
    }

    public void setOpt(List<ItemOpt> opt) {
        this.opt = opt;
    }
}
