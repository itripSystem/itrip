package cn.itrip.dao;

import cn.itrip.pojo.ItripOrderLinkUser;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripOrderLinkUserMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripOrderLinkUser record);

    int insertSelective(@Param("record") ItripOrderLinkUser record);

    ItripOrderLinkUser selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripOrderLinkUser record);

    int updateByPrimaryKey(@Param("record") ItripOrderLinkUser record);
}