package com.bxl.bpm.dao;

import com.bxl.bpm.model.UserBtnRef;
import com.bxl.bpm.model.UserBtnRefExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface UserBtnRefMapper extends GenericDao<UserBtnRef, Integer> {
    int countByExample(UserBtnRefExample example);

    int deleteByExample(UserBtnRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBtnRef record);

    int insertSelective(UserBtnRef record);

    List<UserBtnRef> selectByExample(UserBtnRefExample example);

    UserBtnRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBtnRef record, @Param("example") UserBtnRefExample example);

    int updateByExample(@Param("record") UserBtnRef record, @Param("example") UserBtnRefExample example);

    int updateByPrimaryKeySelective(UserBtnRef record);

    int updateByPrimaryKey(UserBtnRef record);
}