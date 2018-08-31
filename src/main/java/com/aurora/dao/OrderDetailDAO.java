package com.aurora.dao;

import com.aurora.entity.Myorder;
import com.aurora.entity.OrderDetail;
import com.aurora.entity.OrderDetailKey;

import java.util.List;

/**
 * OrderDetailDAO继承基类
 */
public interface OrderDetailDAO extends MyBatisBaseDao<OrderDetail, OrderDetailKey> {

    /**
     @param order 添加的新订单对象
     @return 返回受影响行数
     */



    /**
     @param orderDetail 添加的新订单详情对象
     @return 返回受影响行数
     */

    public int saveDetails(OrderDetail orderDetail);

    /**
     @param custId 当前用户的ID
     @return 返回当前账户的所有订单列表
     */

    public List<Myorder> queryAll(Integer custId);

    /**
     @param shoesName 要查询的鞋的名称（模糊查询）
     @param custId 当前用户的ID
     @return 返回当前用户的要查询的订单列表
     */


    public  List<Myorder> queryByShooesName(String shoesName,Integer custId);

    /**
     @param orderNumber 要查询的鞋编号（模糊查询）
     @param custId 当前用户的ID
     @return 返回当前用户的要查询指定的订单详情
     */

    public  List<Myorder> queryById(Integer orderNumber,Integer custId);

    /**
     @param status  修改订单状态
     @param orderId  指定的要修改的订单ID
     @return  返回受影响行数
     */

    public  int updateStatus(Integer status,Integer orderId);

}