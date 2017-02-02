package com.bxl.bpm.dao;

import com.bxl.bpm.model.SysNavBtnRef;
import com.bxl.bpm.model.SysNavBtnRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNavBtnRefMapper {
    int countByExample(SysNavBtnRefExample example);

    int deleteByExample(SysNavBtnRefExample example);

    int insert(SysNavBtnRef record);

    int insertSelective(SysNavBtnRef record);

    List<SysNavBtnRef> selectByExample(SysNavBtnRefExample example);

    int updateByExampleSelective(@Param("record") SysNavBtnRef record, @Param("example") SysNavBtnRefExample example);

    int updateByExample(@Param("record") SysNavBtnRef record, @Param("example") SysNavBtnRefExample example);
}