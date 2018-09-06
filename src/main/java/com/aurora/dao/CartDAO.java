package com.aurora.dao;

import com.aurora.model.entity.Cart;

import com.aurora.entity.ShoesDetail;
import org.apache.ibatis.annotations.Param;


import java.util.List;


/**
 * CartDAO继承基类
 */
public interface CartDAO extends MyBatisBaseDao<Cart, Integer> {

    /**
     * save : 添加商品
     * @param shoesDetail
     * @param custId
     * @return
     */
    int save(ShoesDetail shoesDetail, Integer custId);

    /**
     * delete : 购物车中的商品
     * @param shoesDetailId : 商品详情id
     * @param custId : 用户id
     * @return : 返回受影响行数
     */
    int delete(@Param("shoesDetailId") Integer shoesDetailId, @Param("custId") Integer custId);

    /**
     * updateCount : 修改商品的数量
     * @param shoesDetailId : 鞋子详情id
     * @param custId : 用户id
     * @param count : 购物车中鞋子数量
     * @return : 返回受影响行数
     */
     int updateCount(@Param("shoesDetailId") Integer shoesDetailId, @Param("custId") Integer custId, @Param("count") Integer count);

    /**
     * queryAll : 根据购物车id查询所有商品
     * @param cartId : 购物车id
     * @return
     */
    List<Cart> queryAll(Integer cartId);

    /**
     * queryAll1 : 查看购物车中所有商品
     * @param custId : 用户id
     * @return :  返回当前用户购物车中所有的鞋子
     */
    List<ShoesDetail> queryAll1(Integer custId);
}