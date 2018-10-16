package ml.yidreamc.upcpay.common.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OldToNewMap {

    @Id
    @GeneratedValue
    private int id;

    private int oldId;
    private int newId;

    public OldToNewMap(int oldId, int newId) {
        this.oldId = oldId;
        this.newId = newId;
    }

    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public OldToNewMap() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
