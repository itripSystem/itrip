package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelRoom;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelRoomMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripHotelRoom record);

    int insertSelective(@Param("record") ItripHotelRoom record);

    ItripHotelRoom selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelRoom record);

    int updateByPrimaryKey(@Param("record") ItripHotelRoom record);
}