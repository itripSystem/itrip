package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelTempStore;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelTempStoreMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripHotelTempStore record);

    int insertSelective(@Param("record") ItripHotelTempStore record);

    ItripHotelTempStore selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelTempStore record);

    int updateByPrimaryKey(@Param("record") ItripHotelTempStore record);
}