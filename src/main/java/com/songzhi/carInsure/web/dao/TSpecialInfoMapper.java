package com.songzhi.carInsure.web.dao;

import com.songzhi.carInsure.web.po.TSpecialInfo;
import com.songzhi.carInsure.web.po.TSpecialInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSpecialInfoMapper {
    int countByExample(TSpecialInfoExample example);

    int deleteByExample(TSpecialInfoExample example);

    int deleteByPrimaryKey(Integer siId);

    int insert(TSpecialInfo record);

    int insertSelective(TSpecialInfo record);

    List<TSpecialInfo> selectByExample(TSpecialInfoExample example);

    TSpecialInfo selectByPrimaryKey(Integer siId);

    int updateByExampleSelective(@Param("record") TSpecialInfo record, @Param("example") TSpecialInfoExample example);

    int updateByExample(@Param("record") TSpecialInfo record, @Param("example") TSpecialInfoExample example);

    int updateByPrimaryKeySelective(TSpecialInfo record);

    int updateByPrimaryKey(TSpecialInfo record);
}