package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Property;
import com.how2java.tmall.pojo.PropertyExample;
import java.util.List;

public interface PropertyMapper {

    void deleteByPrimaryKey(Integer id);

    void insert(Property record);

    void insertSelective(Property record);

    List<Property> selectByExample(PropertyExample example);

    Property selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(Property record);

    void updateByPrimaryKey(Property record);
}