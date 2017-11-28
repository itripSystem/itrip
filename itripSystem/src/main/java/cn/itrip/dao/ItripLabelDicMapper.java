package cn.itrip.dao;

import cn.itrip.pojo.ItripLabelDic;
import org.apache.ibatis.annotations.Param;

public interface ItripLabelDicMapper {
    int deleteByPrimaryKey(@Param("id") Long id);

    int insert(@Param("record") ItripLabelDic record);

    int insertSelective(@Param("record") ItripLabelDic record);

    ItripLabelDic selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(@Param("record") ItripLabelDic record);

    int updateByPrimaryKey(@Param("record") ItripLabelDic record);
}