package com.bxl.bpm.dao;

import com.bxl.bpm.model.LogDetail;
import com.bxl.bpm.model.LogDetailExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface LogDetailMapper extends GenericDao<LogDetail, Integer> {
    int countByExample(LogDetailExample example);

    int deleteByExample(LogDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogDetail record);

    int insertSelective(LogDetail record);

    List<LogDetail> selectByExample(LogDetailExample example);

    LogDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogDetail record, @Param("example") LogDetailExample example);

    int updateByExample(@Param("record") LogDetail record, @Param("example") LogDetailExample example);

    int updateByPrimaryKeySelective(LogDetail record);

    int updateByPrimaryKey(LogDetail record);
}