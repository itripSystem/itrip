package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelExtendProperty;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelExtendPropertyMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripHotelExtendProperty record);

    int insertSelective(@Param("record") ItripHotelExtendProperty record);

    ItripHotelExtendProperty selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelExtendProperty record);

    int updateByPrimaryKey(@Param("record") ItripHotelExtendProperty record);
}