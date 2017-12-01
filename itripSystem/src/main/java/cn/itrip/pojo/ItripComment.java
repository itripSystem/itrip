package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripComment {
    private BigDecimal id;

    private BigDecimal hotelid;

    private BigDecimal productid;

    private BigDecimal orderid;

    private Long producttype;

    private Object content;

    private BigDecimal userid;

    private Long ishavingimg;

    private Long positionscore;

    private Long facilitiesscore;

    private Long servicescore;

    private Long hygienescore;

    private Long score;

    private BigDecimal tripmode;

    private Long isok;

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

    public BigDecimal getHotelid() {
        return hotelid;
    }

    public void setHotelid(BigDecimal hotelid) {
        this.hotelid = hotelid;
    }

    public BigDecimal getProductid() {
        return productid;
    }

    public void setProductid(BigDecimal productid) {
        this.productid = productid;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public Long getProducttype() {
        return producttype;
    }

    public void setProducttype(Long producttype) {
        this.producttype = producttype;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public Long getIshavingimg() {
        return ishavingimg;
    }

    public void setIshavingimg(Long ishavingimg) {
        this.ishavingimg = ishavingimg;
    }

    public Long getPositionscore() {
        return positionscore;
    }

    public void setPositionscore(Long positionscore) {
        this.positionscore = positionscore;
    }

    public Long getFacilitiesscore() {
        return facilitiesscore;
    }

    public void setFacilitiesscore(Long facilitiesscore) {
        this.facilitiesscore = facilitiesscore;
    }

    public Long getServicescore() {
        return servicescore;
    }

    public void setServicescore(Long servicescore) {
        this.servicescore = servicescore;
    }

    public Long getHygienescore() {
        return hygienescore;
    }

    public void setHygienescore(Long hygienescore) {
        this.hygienescore = hygienescore;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public BigDecimal getTripmode() {
        return tripmode;
    }

    public void setTripmode(BigDecimal tripmode) {
        this.tripmode = tripmode;
    }

    public Long getIsok() {
        return isok;
    }

    public void setIsok(Long isok) {
        this.isok = isok;
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