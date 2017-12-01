package cn.itrip.dao;

import cn.itrip.pojo.ItripUserLinkUser;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripUserLinkUserMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripUserLinkUser record);

    int insertSelective(@Param("record") ItripUserLinkUser record);

    ItripUserLinkUser selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripUserLinkUser record);

    int updateByPrimaryKey(@Param("record") ItripUserLinkUser record);
}