package com.bxl.bpm.dao;

import com.bxl.bpm.model.SysButton;
import com.bxl.bpm.model.SysButtonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysButtonMapper {
    int countByExample(SysButtonExample example);

    int deleteByExample(SysButtonExample example);

    int insert(SysButton record);

    int insertSelective(SysButton record);

    List<SysButton> selectByExample(SysButtonExample example);

    int updateByExampleSelective(@Param("record") SysButton record, @Param("example") SysButtonExample example);

    int updateByExample(@Param("record") SysButton record, @Param("example") SysButtonExample example);
}