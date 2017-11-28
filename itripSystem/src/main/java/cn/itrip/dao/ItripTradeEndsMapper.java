package cn.itrip.dao;

import cn.itrip.pojo.ItripTradeEnds;
import org.apache.ibatis.annotations.Param;

public interface ItripTradeEndsMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripTradeEnds record);

    int insertSelective(@Param("record") ItripTradeEnds record);

    ItripTradeEnds selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripTradeEnds record);

    int updateByPrimaryKey(@Param("record") ItripTradeEnds record);
}