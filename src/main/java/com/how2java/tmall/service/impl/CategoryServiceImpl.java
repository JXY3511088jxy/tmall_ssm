package com.how2java.tmall.service.impl;

import com.how2java.tmall.mapper.CategoryMapper;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.CategoryExample;
import com.how2java.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;


    @Override
    public void deleteByPrimaryKey(Integer id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(Category record) {
        categoryMapper.insert(record);
    }

    @Override
    public void insertSelective(Category record) {
        categoryMapper.insertSelective(record);
    }

    @Override
    public List<Category> selectByExample(CategoryExample example) {
        return categoryMapper.selectByExample(example);
    }

    @Override
    public Category selectByPrimaryKey(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(Category record) {
        categoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void updateByPrimaryKey(Category record) {
        categoryMapper.updateByPrimaryKey(record);
    }
}
