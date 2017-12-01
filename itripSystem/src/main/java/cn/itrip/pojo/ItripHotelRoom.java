package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripHotelRoom {
    private BigDecimal id;

    private BigDecimal hotelid;

    private Object roomtitle;

    private BigDecimal roomprice;

    private BigDecimal roombedtypeid;

    private Long ishavingbreakfast;

    private Long paytype;

    private BigDecimal satisfaction;

    private Long isbook;

    private Long iscancel;

    private Long istimelyresponse;

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

    public Object getRoomtitle() {
        return roomtitle;
    }

    public void setRoomtitle(Object roomtitle) {
        this.roomtitle = roomtitle;
    }

    public BigDecimal getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(BigDecimal roomprice) {
        this.roomprice = roomprice;
    }

    public BigDecimal getRoombedtypeid() {
        return roombedtypeid;
    }

    public void setRoombedtypeid(BigDecimal roombedtypeid) {
        this.roombedtypeid = roombedtypeid;
    }

    public Long getIshavingbreakfast() {
        return ishavingbreakfast;
    }

    public void setIshavingbreakfast(Long ishavingbreakfast) {
        this.ishavingbreakfast = ishavingbreakfast;
    }

    public Long getPaytype() {
        return paytype;
    }

    public void setPaytype(Long paytype) {
        this.paytype = paytype;
    }

    public BigDecimal getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(BigDecimal satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Long getIsbook() {
        return isbook;
    }

    public void setIsbook(Long isbook) {
        this.isbook = isbook;
    }

    public Long getIscancel() {
        return iscancel;
    }

    public void setIscancel(Long iscancel) {
        this.iscancel = iscancel;
    }

    public Long getIstimelyresponse() {
        return istimelyresponse;
    }

    public void setIstimelyresponse(Long istimelyresponse) {
        this.istimelyresponse = istimelyresponse;
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