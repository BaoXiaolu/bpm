package com.bxl.bpm.dao;

import com.bxl.bpm.model.SysNavigation;
import com.bxl.bpm.model.SysNavigationExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface SysNavigationMapper extends GenericDao<SysNavigation, Integer> {
    int countByExample(SysNavigationExample example);

    int deleteByExample(SysNavigationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysNavigation record);

    int insertSelective(SysNavigation record);

    List<SysNavigation> selectByExample(SysNavigationExample example);

    SysNavigation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysNavigation record, @Param("example") SysNavigationExample example);

    int updateByExample(@Param("record") SysNavigation record, @Param("example") SysNavigationExample example);

    int updateByPrimaryKeySelective(SysNavigation record);

    int updateByPrimaryKey(SysNavigation record);
}