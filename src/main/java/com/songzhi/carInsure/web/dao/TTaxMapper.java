package com.songzhi.carInsure.web.dao;

import com.songzhi.carInsure.web.po.TTax;
import com.songzhi.carInsure.web.po.TTaxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTaxMapper {
    int countByExample(TTaxExample example);

    int deleteByExample(TTaxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTax record);

    int insertSelective(TTax record);

    List<TTax> selectByExample(TTaxExample example);

    TTax selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTax record, @Param("example") TTaxExample example);

    int updateByExample(@Param("record") TTax record, @Param("example") TTaxExample example);

    int updateByPrimaryKeySelective(TTax record);

    int updateByPrimaryKey(TTax record);
}