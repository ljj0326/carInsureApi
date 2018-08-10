package com.songzhi.carInsure.web.dao;

import com.songzhi.carInsure.web.po.TRisk;
import com.songzhi.carInsure.web.po.TRiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRiskMapper {
    int countByExample(TRiskExample example);

    int deleteByExample(TRiskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TRisk record);

    int insertSelective(TRisk record);

    List<TRisk> selectByExample(TRiskExample example);

    TRisk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TRisk record, @Param("example") TRiskExample example);

    int updateByExample(@Param("record") TRisk record, @Param("example") TRiskExample example);

    int updateByPrimaryKeySelective(TRisk record);

    int updateByPrimaryKey(TRisk record);
}