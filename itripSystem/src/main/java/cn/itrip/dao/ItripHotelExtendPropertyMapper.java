package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelExtendProperty;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelExtendPropertyMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripHotelExtendProperty record);

    int insertSelective(@Param("record") ItripHotelExtendProperty record);

    ItripHotelExtendProperty selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelExtendProperty record);

    int updateByPrimaryKey(@Param("record") ItripHotelExtendProperty record);
}