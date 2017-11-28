package cn.itrip.dao;

import cn.itrip.pojo.ItripHotel;
import cn.itrip.pojo.ItripHotelWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripHotelWithBLOBs record);

    int insertSelective(@Param("record") ItripHotelWithBLOBs record);

    ItripHotelWithBLOBs selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") ItripHotelWithBLOBs record);

    int updateByPrimaryKey(@Param("record") ItripHotel record);
}