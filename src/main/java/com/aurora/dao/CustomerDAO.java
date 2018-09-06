package com.aurora.dao;

import com.aurora.model.entity.Customer;
import org.apache.ibatis.annotations.Param;

/**
 * CustomerDAO继承基类
 */
public interface CustomerDAO extends MyBatisBaseDao<Customer, Integer> {

    Customer getByName(@Param("customerName") String customerName);

    /**
     判断手机号是否已经注册过
     @param telno 验证手机号码是否已经注册
     @return 若该手机号已经注册，则返回已注册的手机号，若没有注册过，则返回null
     */
    public Long isValidTelno(Long telno);

    /**
     判断邮箱是否已经注册过
     @param email 验证邮箱是否已经注册
     @return 若该邮箱已经注册，则返回已注册的邮箱，若没有注册过，则返回null
     */
    public String isValidEmail(String email);

    /**
     设置用户密码 ，根据用户ID修改密码
     @param customer 需要设置密码的用户，该对象封装了新密码
     @return 返回修改受影响行数
     */
    public int updatePwd(Customer customer);

    /**
     新用户注册
     @param customer 需要注册的会员
     @return 返回添加受影响行数
     */
    public int register(Customer customer);

    /**
     根据主键查询用户自己的信息
     @param custId 用户ID
     @return 返回用户详细信息
     */
    public Customer queryById(Integer custId);
    /**
     修改用户信息
     @param customer 要修改的用户信息
     @return 返回受影响的行数
     */
    public  int update(Customer customer);

}