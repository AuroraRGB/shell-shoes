package com.aurora.dao;

import com.aurora.model.entity.Customer;
import org.apache.ibatis.annotations.Param;

/**
 * CustomerDAO继承基类
 */
public interface CustomerDAO extends MyBatisBaseDao<Customer, Integer> {
    Customer getByName(@Param("customerName") String customerName);
}