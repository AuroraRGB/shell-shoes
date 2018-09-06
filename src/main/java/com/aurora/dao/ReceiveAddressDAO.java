package com.aurora.dao;

import com.aurora.entity.ReceiveAddress;

/**
 * ReceiveAddressDAO继承基类
 */
public interface ReceiveAddressDAO extends MyBatisBaseDao<ReceiveAddress, Integer> {
    /**
     @param newAddress 新增的收件地址对象
     @return 返回受影响行数
     */
    int save(ReceiveAddress newAddress);
}