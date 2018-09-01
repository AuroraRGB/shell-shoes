package com.aurora.dao;

import com.aurora.entity.OrderDetail;
import com.aurora.entity.OrderDetailKey;
import org.apache.ibatis.annotations.Param;

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