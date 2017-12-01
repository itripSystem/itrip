package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripOrderLinkUser {
    private BigDecimal id;

    private BigDecimal orderid;

    private BigDecimal linkuserid;

    private Object linkusername;

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

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getLinkuserid() {
        return linkuserid;
    }

    public void setLinkuserid(BigDecimal linkuserid) {
        this.linkuserid = linkuserid;
    }

    public Object getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(Object linkusername) {
        this.linkusername = linkusername;
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