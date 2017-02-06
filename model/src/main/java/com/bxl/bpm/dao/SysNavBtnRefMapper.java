package com.bxl.bpm.dao;

import com.bxl.bpm.model.SysNavBtnRef;
import com.bxl.bpm.model.SysNavBtnRefExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface SysNavBtnRefMapper extends GenericDao<SysNavBtnRef, Integer> {
    int countByExample(SysNavBtnRefExample example);

    int deleteByExample(SysNavBtnRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysNavBtnRef record);

    int insertSelective(SysNavBtnRef record);

    List<SysNavBtnRef> selectByExample(SysNavBtnRefExample example);

    SysNavBtnRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysNavBtnRef record, @Param("example") SysNavBtnRefExample example);

    int updateByExample(@Param("record") SysNavBtnRef record, @Param("example") SysNavBtnRefExample example);

    int updateByPrimaryKeySelective(SysNavBtnRef record);

    int updateByPrimaryKey(SysNavBtnRef record);
}