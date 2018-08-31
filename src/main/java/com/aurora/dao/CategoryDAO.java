package com.aurora.dao;

import com.aurora.entity.Category;

import java.util.List;

/**
 * CategoryDAO继承基类
 */
public interface CategoryDAO extends MyBatisBaseDao<Category, Integer> {
    /**
     * 查看所有鞋子的类别
     @return 返回所有鞋子的类别
     */
    public List<Category> queryAll();
}