package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripAreaDic {
    private BigDecimal id;

    private Object name;

    private Object areano;

    private BigDecimal parent;

    private Long isactivated;

    private Long istradingarea;

    private Long ishot;

    private Long level;

    private Long ischina;

    private Object pinyin;

    private Date creationdate;

    private BigDecimal createdby;

    private Date modifydate;

    private BigDecimal modifiedby;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getAreano() {
        return areano;
    }

    public void setAreano(Object areano) {
        this.areano = areano;
    }

    public BigDecimal getParent() {
        return parent;
    }

    public void setParent(BigDecimal parent) {
        this.parent = parent;
    }

    public Long getIsactivated() {
        return isactivated;
    }

    public void setIsactivated(Long isactivated) {
        this.isactivated = isactivated;
    }

    public Long getIstradingarea() {
        return istradingarea;
    }

    public void setIstradingarea(Long istradingarea) {
        this.istradingarea = istradingarea;
    }

    public Long getIshot() {
        return ishot;
    }

    public void setIshot(Long ishot) {
        this.ishot = ishot;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getIschina() {
        return ischina;
    }

    public void setIschina(Long ischina) {
        this.ischina = ischina;
    }

    public Object getPinyin() {
        return pinyin;
    }

    public void setPinyin(Object pinyin) {
        this.pinyin = pinyin;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public BigDecimal getCreatedby() {
        return createdby;
    }

    public void setCreatedby(BigDecimal createdby) {
        this.createdby = createdby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public BigDecimal getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(BigDecimal modifiedby) {
        this.modifiedby = modifiedby;
    }
}