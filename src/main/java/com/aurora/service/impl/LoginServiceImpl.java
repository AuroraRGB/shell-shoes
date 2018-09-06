package com.aurora.service.impl;

import com.aurora.dao.CustLoginDAO;

import com.aurora.model.entity.Customer;
import com.aurora.service.LoginService;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.Cookie;

public class LoginServiceImpl implements LoginService {

    @Override
    public Customer checkTelnoAndPwd(Customer customer) {
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustLoginDAO loginDAO = sqlSession.getMapper(CustLoginDAO.class);
        Customer customer1 = loginDAO.checkTelnoAndPwd(customer.getCustPhone(), customer.getCustPwd());
        return customer1;
    }
}
