package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelTradingArea;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelTradingAreaMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripHotelTradingArea record);

    int insertSelective(@Param("record") ItripHotelTradingArea record);

    ItripHotelTradingArea selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelTradingArea record);

    int updateByPrimaryKey(@Param("record") ItripHotelTradingArea record);
}