package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripImage {
    private BigDecimal id;

    private Object type;

    private BigDecimal targetid;

    private Long position;

    private Object imgurl;

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

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public BigDecimal getTargetid() {
        return targetid;
    }

    public void setTargetid(BigDecimal targetid) {
        this.targetid = targetid;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Object getImgurl() {
        return imgurl;
    }

    public void setImgurl(Object imgurl) {
        this.imgurl = imgurl;
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