package cn.itrip.dao;

import cn.itrip.pojo.ItripHotelFeature;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripHotelFeatureMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripHotelFeature record);

    int insertSelective(@Param("record") ItripHotelFeature record);

    ItripHotelFeature selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripHotelFeature record);

    int updateByPrimaryKey(@Param("record") ItripHotelFeature record);
}