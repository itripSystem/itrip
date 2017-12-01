package cn.itrip.dao;

import cn.itrip.pojo.ItripTradeEnds;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripTradeEndsMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripTradeEnds record);

    int insertSelective(@Param("record") ItripTradeEnds record);

    ItripTradeEnds selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripTradeEnds record);

    int updateByPrimaryKey(@Param("record") ItripTradeEnds record);
}