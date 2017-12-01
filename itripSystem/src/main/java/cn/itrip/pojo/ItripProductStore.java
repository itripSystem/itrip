package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripProductStore {
    private BigDecimal id;

    private Long producttype;

    private BigDecimal productid;

    private Long store;

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

    public Long getProducttype() {
        return producttype;
    }

    public void setProducttype(Long producttype) {
        this.producttype = producttype;
    }

    public BigDecimal getProductid() {
        return productid;
    }

    public void setProductid(BigDecimal productid) {
        this.productid = productid;
    }

    public Long getStore() {
        return store;
    }

    public void setStore(Long store) {
        this.store = store;
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