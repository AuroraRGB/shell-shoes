package com.aurora.dao;

import com.aurora.model.entity.ShoesColor;

import java.util.List;

/**
 * ShoesColorDAO继承基类
 */
public interface ShoesColorDAO extends MyBatisBaseDao<ShoesColor, Integer> {
    /**
     @param shoesId 指定的鞋子ID
     @return 返回指定鞋子的所有颜色
     */
    public List<ShoesColor> queryAllColorByShoesId(Integer shoesId);
}