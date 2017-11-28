package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelRoom;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelRoomMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripHotelRoom record);

    int insertSelective(@Param("record") ItripHotelRoom record);

    ItripHotelRoom selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelRoom record);

    int updateByPrimaryKey(@Param("record") ItripHotelRoom record);
}