package cn.itrip.dao;

import cn.itrip.pojo.ItripOrderLinkUser;
import org.apache.ibatis.annotations.Param;

public interface ItripOrderLinkUserMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripOrderLinkUser record);

    int insertSelective(@Param("record") ItripOrderLinkUser record);

    ItripOrderLinkUser selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripOrderLinkUser record);

    int updateByPrimaryKey(@Param("record") ItripOrderLinkUser record);
}