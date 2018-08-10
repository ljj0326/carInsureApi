package com.songzhi.carInsure.web.dao;

import com.songzhi.carInsure.web.po.TAttachment;
import com.songzhi.carInsure.web.po.TAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAttachmentMapper {
    int countByExample(TAttachmentExample example);

    int deleteByExample(TAttachmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAttachment record);

    int insertSelective(TAttachment record);

    List<TAttachment> selectByExample(TAttachmentExample example);

    TAttachment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAttachment record, @Param("example") TAttachmentExample example);

    int updateByExample(@Param("record") TAttachment record, @Param("example") TAttachmentExample example);

    int updateByPrimaryKeySelective(TAttachment record);

    int updateByPrimaryKey(TAttachment record);
}