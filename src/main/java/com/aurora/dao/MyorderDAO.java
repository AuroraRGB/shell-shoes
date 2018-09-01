package com.aurora.dao;

import com.aurora.entity.Myorder;
import org.apache.ibatis.annotations.Param;

/**
 * MyorderDAO继承基类
 */
public interface MyorderDAO extends MyBatisBaseDao<Myorder, Integer> {

    /**
     @param order 添加的新订单对象
     @return 返回受影响行数
     */
    int save(Myorder order);

    int updateStatus(@Param("status") Integer status, @Param("orderId") Integer orderId);

}