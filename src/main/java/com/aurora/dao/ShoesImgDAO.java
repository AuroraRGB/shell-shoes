package com.aurora.dao;

import com.aurora.entity.ShoesImg;

import java.util.List;

/**
 * ShoesImgDAO继承基类
 */
public interface ShoesImgDAO extends MyBatisBaseDao<ShoesImg, Integer> {

    public List<ShoesImg> queryAllImgByShoesId(Integer shoesId);


}