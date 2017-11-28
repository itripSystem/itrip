package cn.itrip.dao;

import cn.itrip.pojo.ItripImage;
import org.apache.ibatis.annotations.Param;

public interface ItripImageMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripImage record);

    int insertSelective(@Param("record") ItripImage record);

    ItripImage selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripImage record);

    int updateByPrimaryKey(@Param("record") ItripImage record);
}