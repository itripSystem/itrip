package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelOrder;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelOrderMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripHotelOrder record);

    int insertSelective(@Param("record") ItripHotelOrder record);

    ItripHotelOrder selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelOrder record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") ItripHotelOrder record);

    int updateByPrimaryKey(@Param("record") ItripHotelOrder record);
}