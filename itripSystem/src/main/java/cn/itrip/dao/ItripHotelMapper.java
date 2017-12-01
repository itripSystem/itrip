package cn.itrip.dao;

import cn.itrip.pojo.ItripHotel;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripHotel record);

    int insertSelective(@Param("record") ItripHotel record);

    ItripHotel selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotel record);

    int updateByPrimaryKey(@Param("record") ItripHotel record);
}