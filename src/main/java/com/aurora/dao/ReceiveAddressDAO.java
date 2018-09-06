package com.aurora.dao;

import com.aurora.model.entity.ReceiveAddress;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * ReceiveAddressDAO继承基类
 */
public interface ReceiveAddressDAO extends MyBatisBaseDao<ReceiveAddress, Integer> {


    /**
     * save : 添加收件地址
     * @param newAddress : 新地址
     * @return : 返回受影响的行数
     */
    int save(ReceiveAddress newAddress);


    /**
     * queryAll : 查询该用户的所有收件地址
     * @param custId : 用户id
     * @return : 返回该用户的所有地址集合
     */
    List<ReceiveAddress> queryAll(Integer custId);

    /**
     * delete : 删除收件地址
     * @param addressId : 地址id
     * @param custId : 用户id
     * @return : 返回受影响的行数
     */
    int delete(@Param("addressId") Integer addressId, @Param("custId") Integer custId);

    /**
     * update : 修改收件地址
     * @param receiveAddress : 地址
     * @return : 返回受影响的行数
     */
    int update(ReceiveAddress receiveAddress);


    /**
     * updateDefaultAddress : 设置一个为默认地址
     * @param addressId : 地址id
     * @param custId : 用户id
     * @return : 返回受影响行数
     */
    int UpdateDefaultAddress(@Param("addressId") Integer addressId, @Param("custId") Integer custId);


}