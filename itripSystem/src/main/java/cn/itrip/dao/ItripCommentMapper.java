package cn.itrip.dao;

import cn.itrip.pojo.ItripComment;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripCommentMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripComment record);

    int insertSelective(@Param("record") ItripComment record);

    ItripComment selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripComment record);

    int updateByPrimaryKey(@Param("record") ItripComment record);
}