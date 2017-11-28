package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelTradingArea;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelTradingAreaMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripHotelTradingArea record);

    int insertSelective(@Param("record") ItripHotelTradingArea record);

    ItripHotelTradingArea selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelTradingArea record);

    int updateByPrimaryKey(@Param("record") ItripHotelTradingArea record);
}