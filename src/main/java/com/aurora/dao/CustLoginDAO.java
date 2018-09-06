package com.aurora.dao;


import com.aurora.model.entity.CustLogin;
import com.aurora.model.entity.Customer;
import org.apache.ibatis.annotations.Param;

/**
 * CustLoginDAO继承基类
 */
public interface CustLoginDAO extends MyBatisBaseDao<CustLogin, Integer> {

    /**
     判断用户登录的手机号与密码是否正确
     @param telno 登录手机号（注册时手机号）
     @param password 登录密码
     @return 返回登录用户信息，若返回null,表示账户或密码错误
     */
    public Customer checkTelnoAndPwd (@Param("telno")Long telno, @Param("password")String password);

    /**
     判断用户登录的邮箱与密码是否正确
     @param email 登录邮箱（注册时的邮箱）
     @param password 登录密码
     @return 返回登录用户信息，若返回null,表示账户或密码错误
     */
    public Customer checkEmailAndPwd (@Param("email")String email, @Param("password")String password );
    /**
     添加登录记录
     @param custLogin 用户登录信息对象
     @return  返回添加受影响的行数
     */
    public int save(CustLogin custLogin);

}