package com.aurora.dao;

import com.aurora.entity.ShoesSize;

import java.util.List;

/**
 * ShoesSizeDAO继承基类
 */
public interface ShoesSizeDAO extends MyBatisBaseDao<ShoesSize, Integer> {
    /**
     @param shoesId 指定的鞋子ID
     @return 返回指定鞋子的所有尺码
     */
    public List<ShoesSize> queryAllSizeByShoesId(Integer shoesId);
}