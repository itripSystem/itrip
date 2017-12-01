package cn.itrip.dao;

import cn.itrip.pojo.ItripProductStore;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripProductStoreMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripProductStore record);

    int insertSelective(@Param("record") ItripProductStore record);

    ItripProductStore selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripProductStore record);

    int updateByPrimaryKey(@Param("record") ItripProductStore record);
}