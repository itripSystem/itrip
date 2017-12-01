package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripHotel {
    private BigDecimal id;

    private Object hotelname;

    private BigDecimal countryid;

    private BigDecimal provinceid;

    private BigDecimal cityid;

    private Object address;

    private Object details;

    private Object facilities;

    private Object hotelpolicy;

    private Long hoteltype;

    private Long hotellevel;

    private Long isgrouppurchase;

    private Object redundantcityname;

    private Object redundantprovincename;

    private Object redundantcountryname;

    private Long redundanthotelstore;

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

    public Object getHotelname() {
        return hotelname;
    }

    public void setHotelname(Object hotelname) {
        this.hotelname = hotelname;
    }

    public BigDecimal getCountryid() {
        return countryid;
    }

    public void setCountryid(BigDecimal countryid) {
        this.countryid = countryid;
    }

    public BigDecimal getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(BigDecimal provinceid) {
        this.provinceid = provinceid;
    }

    public BigDecimal getCityid() {
        return cityid;
    }

    public void setCityid(BigDecimal cityid) {
        this.cityid = cityid;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

    public Object getFacilities() {
        return facilities;
    }

    public void setFacilities(Object facilities) {
        this.facilities = facilities;
    }

    public Object getHotelpolicy() {
        return hotelpolicy;
    }

    public void setHotelpolicy(Object hotelpolicy) {
        this.hotelpolicy = hotelpolicy;
    }

    public Long getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(Long hoteltype) {
        this.hoteltype = hoteltype;
    }

    public Long getHotellevel() {
        return hotellevel;
    }

    public void setHotellevel(Long hotellevel) {
        this.hotellevel = hotellevel;
    }

    public Long getIsgrouppurchase() {
        return isgrouppurchase;
    }

    public void setIsgrouppurchase(Long isgrouppurchase) {
        this.isgrouppurchase = isgrouppurchase;
    }

    public Object getRedundantcityname() {
        return redundantcityname;
    }

    public void setRedundantcityname(Object redundantcityname) {
        this.redundantcityname = redundantcityname;
    }

    public Object getRedundantprovincename() {
        return redundantprovincename;
    }

    public void setRedundantprovincename(Object redundantprovincename) {
        this.redundantprovincename = redundantprovincename;
    }

    public Object getRedundantcountryname() {
        return redundantcountryname;
    }

    public void setRedundantcountryname(Object redundantcountryname) {
        this.redundantcountryname = redundantcountryname;
    }

    public Long getRedundanthotelstore() {
        return redundanthotelstore;
    }

    public void setRedundanthotelstore(Long redundanthotelstore) {
        this.redundanthotelstore = redundanthotelstore;
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