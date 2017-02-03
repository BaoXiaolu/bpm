package com.bxl.bpm.dao;

import com.bxl.bpm.model.DicCategory;
import com.bxl.bpm.model.DicCategoryExample;
import java.util.List;

import com.bxl.common.generic.GenericDao;
import org.apache.ibatis.annotations.Param;

public interface DicCategoryMapper extends GenericDao<DicCategory, Integer> {
    int countByExample(DicCategoryExample example);

    int deleteByExample(DicCategoryExample example);

    int insert(DicCategory record);

    int insertSelective(DicCategory record);

    List<DicCategory> selectByExample(DicCategoryExample example);

    int updateByExampleSelective(@Param("record") DicCategory record, @Param("example") DicCategoryExample example);

    int updateByExample(@Param("record") DicCategory record, @Param("example") DicCategoryExample example);
}