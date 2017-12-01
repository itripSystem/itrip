package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripUserLinkUser {
    private BigDecimal id;

    private Object linkusername;

    private Object linkidcard;

    private Object linkphone;

    private Long userid;

    private Date creationdate;

    private BigDecimal createdby;

    private Date modifydate;

    private BigDecimal modifiedby;

    private Long linkidcardtype;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Object getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(Object linkusername) {
        this.linkusername = linkusername;
    }

    public Object getLinkidcard() {
        return linkidcard;
    }

    public void setLinkidcard(Object linkidcard) {
        this.linkidcard = linkidcard;
    }

    public Object getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(Object linkphone) {
        this.linkphone = linkphone;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
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

    public Long getLinkidcardtype() {
        return linkidcardtype;
    }

    public void setLinkidcardtype(Long linkidcardtype) {
        this.linkidcardtype = linkidcardtype;
    }
}