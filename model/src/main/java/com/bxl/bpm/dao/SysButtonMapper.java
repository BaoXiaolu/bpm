package com.bxl.bpm.dao;

import com.bxl.bpm.model.SysButton;
import com.bxl.bpm.model.SysButtonExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface SysButtonMapper extends GenericDao<SysButton, Integer> {
    int countByExample(SysButtonExample example);

    int deleteByExample(SysButtonExample example);

    int insert(SysButton record);

    int insertSelective(SysButton record);

    List<SysButton> selectByExample(SysButtonExample example);

    int updateByExampleSelective(@Param("record") SysButton record, @Param("example") SysButtonExample example);

    int updateByExample(@Param("record") SysButton record, @Param("example") SysButtonExample example);
}