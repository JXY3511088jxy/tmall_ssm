package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.CategoryExample;

import java.util.List;


public interface CategoryService {

    void deleteByPrimaryKey(Integer id);

    void insert(Category record);

    void insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(Category record);

    void updateByPrimaryKey(Category record);
}
