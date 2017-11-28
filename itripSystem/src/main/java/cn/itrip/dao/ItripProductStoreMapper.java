package cn.itrip.dao;

import cn.itrip.pojo.ItripProductStore;
import org.apache.ibatis.annotations.Param;

public interface ItripProductStoreMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripProductStore record);

    int insertSelective(@Param("record") ItripProductStore record);

    ItripProductStore selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripProductStore record);

    int updateByPrimaryKey(@Param("record") ItripProductStore record);
}