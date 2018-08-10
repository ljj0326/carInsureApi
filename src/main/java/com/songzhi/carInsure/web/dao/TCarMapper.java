package com.songzhi.carInsure.web.dao;

import com.songzhi.carInsure.web.po.TCar;
import com.songzhi.carInsure.web.po.TCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCarMapper {
    int countByExample(TCarExample example);

    int deleteByExample(TCarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCar record);

    int insertSelective(TCar record);

    List<TCar> selectByExample(TCarExample example);

    TCar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCar record, @Param("example") TCarExample example);

    int updateByExample(@Param("record") TCar record, @Param("example") TCarExample example);

    int updateByPrimaryKeySelective(TCar record);

    int updateByPrimaryKey(TCar record);
}