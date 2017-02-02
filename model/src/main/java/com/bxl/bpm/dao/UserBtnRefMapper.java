package com.bxl.bpm.dao;

import com.bxl.bpm.model.UserBtnRef;
import com.bxl.bpm.model.UserBtnRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBtnRefMapper {
    int countByExample(UserBtnRefExample example);

    int deleteByExample(UserBtnRefExample example);

    int insert(UserBtnRef record);

    int insertSelective(UserBtnRef record);

    List<UserBtnRef> selectByExample(UserBtnRefExample example);

    int updateByExampleSelective(@Param("record") UserBtnRef record, @Param("example") UserBtnRefExample example);

    int updateByExample(@Param("record") UserBtnRef record, @Param("example") UserBtnRefExample example);
}