package com.bxl.bpm.dao;

import com.bxl.bpm.model.SysNavigation;
import com.bxl.bpm.model.SysNavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNavigationMapper {
    int countByExample(SysNavigationExample example);

    int deleteByExample(SysNavigationExample example);

    int insert(SysNavigation record);

    int insertSelective(SysNavigation record);

    List<SysNavigation> selectByExample(SysNavigationExample example);

    int updateByExampleSelective(@Param("record") SysNavigation record, @Param("example") SysNavigationExample example);

    int updateByExample(@Param("record") SysNavigation record, @Param("example") SysNavigationExample example);
}