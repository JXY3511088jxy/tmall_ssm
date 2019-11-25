package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

import java.util.List;


public interface CategoryService {

    List<Category> list2();

//    int total();
//
//    List<Category> list(Page page);

    List<Category> list();

    void add(Category category);
    //新增删除方法
    void delete(int id);

    Category get(int id);

    void update(Category category);
}
