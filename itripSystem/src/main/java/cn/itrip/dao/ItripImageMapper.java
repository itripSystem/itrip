package cn.itrip.dao;

import cn.itrip.pojo.ItripImage;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripImageMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripImage record);

    int insertSelective(@Param("record") ItripImage record);

    ItripImage selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripImage record);

    int updateByPrimaryKey(@Param("record") ItripImage record);
}