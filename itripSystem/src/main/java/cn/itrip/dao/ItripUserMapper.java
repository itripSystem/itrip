package cn.itrip.dao;

import cn.itrip.pojo.ItripUser;
import org.apache.ibatis.annotations.Param;

public interface ItripUserMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripUser record);

    int insertSelective(@Param("record") ItripUser record);

    ItripUser selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripUser record);

    int updateByPrimaryKey(@Param("record") ItripUser record);
}