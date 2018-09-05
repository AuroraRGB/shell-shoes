package com.aurora.service;

import com.aurora.dao.CustomerDAO;
import com.aurora.model.entity.Customer;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class CustomerService {

    SqlSession session= MyBatisUtil.getSession();
    CustomerDAO customerDAO=session.getMapper(CustomerDAO.class);

    public boolean login(String userName,String userPassword){
        Customer customer=customerDAO.getByName(userName);
        if (null !=customerDAO){
            if (customer.getCustPwd().equals(userPassword)){
                return true;
            }
        }else {
            return false;
        }
        return false;
    }
}
