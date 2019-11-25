package com.how2java.tmall.po;

import java.util.Date;

public class Category {
    private Byte category_id;

    private String name;

    private Date last_update;

    public Byte getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Byte category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}