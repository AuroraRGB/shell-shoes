package com.aurora.dao;

import com.aurora.model.entity.OrderDetail;
import com.aurora.model.entity.OrderDetailKey;

/**
 * OrderDetailDAO继承基类
 */
public interface OrderDetailDAO extends MyBatisBaseDao<OrderDetail, OrderDetailKey> {
    /**
     @param orderDetail 添加的新订单详情对象
     @return 返回受影响行数
     */
    int saveDetails(OrderDetail orderDetail);



}