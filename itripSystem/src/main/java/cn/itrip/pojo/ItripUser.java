package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripUser {
    private BigDecimal id;

    private Object usercode;

    private Object userpassword;

    private Long usertype;

    private BigDecimal flatid;

    private Object username;

    private Object wechat;

    private Object qq;

    private Object weibo;

    private Object baidu;

    private Date creationdate;

    private BigDecimal createdby;

    private Date modifydate;

    private BigDecimal modifiedby;

    private Long activated;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Object getUsercode() {
        return usercode;
    }

    public void setUsercode(Object usercode) {
        this.usercode = usercode;
    }

    public Object getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(Object userpassword) {
        this.userpassword = userpassword;
    }

    public Long getUsertype() {
        return usertype;
    }

    public void setUsertype(Long usertype) {
        this.usertype = usertype;
    }

    public BigDecimal getFlatid() {
        return flatid;
    }

    public void setFlatid(BigDecimal flatid) {
        this.flatid = flatid;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getWechat() {
        return wechat;
    }

    public void setWechat(Object wechat) {
        this.wechat = wechat;
    }

    public Object getQq() {
        return qq;
    }

    public void setQq(Object qq) {
        this.qq = qq;
    }

    public Object getWeibo() {
        return weibo;
    }

    public void setWeibo(Object weibo) {
        this.weibo = weibo;
    }

    public Object getBaidu() {
        return baidu;
    }

    public void setBaidu(Object baidu) {
        this.baidu = baidu;
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

    public Long getActivated() {
        return activated;
    }

    public void setActivated(Long activated) {
        this.activated = activated;
    }
}