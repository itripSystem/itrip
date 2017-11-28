package cn.itrip.dao;

import cn.itrip.pojo.ItripComment;
import org.apache.ibatis.annotations.Param;

public interface ItripCommentMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripComment record);

    int insertSelective(@Param("record") ItripComment record);

    ItripComment selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripComment record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") ItripComment record);

    int updateByPrimaryKey(@Param("record") ItripComment record);
}