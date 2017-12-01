package cn.itrip.dao;

import cn.itrip.pojo.ItripUser;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

public interface ItripUserMapper {
    int deleteByPrimaryKey(@Param("id") BigDecimal id);

    int insert(@Param("record") ItripUser record);

    int insertSelective(@Param("record") ItripUser record);

    ItripUser selectByPrimaryKey(@Param("id") BigDecimal id);

    int updateByPrimaryKeySelective(@Param("record") ItripUser record);

    int updateByPrimaryKey(@Param("record") ItripUser record);
    
    ItripUser queryByLog(@Param("userCode")String userCode,@Param("userPassword")String userPassword);
}