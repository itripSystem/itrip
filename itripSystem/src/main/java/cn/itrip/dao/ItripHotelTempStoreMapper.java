package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelTempStore;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelTempStoreMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripHotelTempStore record);

    int insertSelective(@Param("record") ItripHotelTempStore record);

    ItripHotelTempStore selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelTempStore record);

    int updateByPrimaryKey(@Param("record") ItripHotelTempStore record);
}