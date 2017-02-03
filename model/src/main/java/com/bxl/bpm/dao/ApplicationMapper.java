package com.bxl.bpm.dao;

import com.bxl.bpm.model.Application;
import com.bxl.bpm.model.ApplicationExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMapper extends GenericDao<Application, Integer> {
    int countByExample(ApplicationExample example);

    int deleteByExample(ApplicationExample example);

    int insert(Application record);

    int insertSelective(Application record);

    List<Application> selectByExample(ApplicationExample example);

    int updateByExampleSelective(@Param("record") Application record, @Param("example") ApplicationExample example);

    int updateByExample(@Param("record") Application record, @Param("example") ApplicationExample example);
}