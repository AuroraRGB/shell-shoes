package com.aurora.dao;

import com.aurora.model.entity.Customer;
import org.apache.ibatis.annotations.Param;

/**
 * CustomerDAO继承基类
 */
public interface CustomerDAO extends MyBatisBaseDao<Customer, Integer> {

    //通过用户名获取Customer
    Customer getByName(@Param("customerName") String customerName);

    //通过用户名获取用户ID
    Integer  getCustomerIdByName(@Param("customerName") String customerName);
}