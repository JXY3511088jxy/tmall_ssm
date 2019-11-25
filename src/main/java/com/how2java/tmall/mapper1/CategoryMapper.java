package com.how2java.tmall.mapper1;

import com.how2java.tmall.po.Category;
import com.how2java.tmall.po.CategoryExample;
import java.util.List;

public interface CategoryMapper {
    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);
}