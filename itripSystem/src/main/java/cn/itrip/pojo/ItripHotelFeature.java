package cn.itrip.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ItripHotelFeature {
    private BigDecimal id;

    private BigDecimal hotelid;

    private BigDecimal featureid;

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

    public BigDecimal getFeatureid() {
        return featureid;
    }

    public void setFeatureid(BigDecimal featureid) {
        this.featureid = featureid;
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