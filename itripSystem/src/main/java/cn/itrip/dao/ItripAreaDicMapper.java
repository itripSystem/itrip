package cn.itrip.dao;

import cn.itrip.pojo.ItripAreaDic;
import org.apache.ibatis.annotations.Param;

public interface ItripAreaDicMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripAreaDic record);

    int insertSelective(@Param("record") ItripAreaDic record);

    ItripAreaDic selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripAreaDic record);

    int updateByPrimaryKey(@Param("record") ItripAreaDic record);
}