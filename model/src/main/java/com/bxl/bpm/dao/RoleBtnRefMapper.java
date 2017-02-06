package com.bxl.bpm.dao;

import com.bxl.bpm.model.RoleBtnRef;
import com.bxl.bpm.model.RoleBtnRefExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface RoleBtnRefMapper extends GenericDao<RoleBtnRef, Integer> {
    int countByExample(RoleBtnRefExample example);

    int deleteByExample(RoleBtnRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleBtnRef record);

    int insertSelective(RoleBtnRef record);

    List<RoleBtnRef> selectByExample(RoleBtnRefExample example);

    RoleBtnRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleBtnRef record, @Param("example") RoleBtnRefExample example);

    int updateByExample(@Param("record") RoleBtnRef record, @Param("example") RoleBtnRefExample example);

    int updateByPrimaryKeySelective(RoleBtnRef record);

    int updateByPrimaryKey(RoleBtnRef record);
}