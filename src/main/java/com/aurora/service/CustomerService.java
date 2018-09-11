package com.aurora.service;

import com.aurora.dao.CustomerDAO;
import com.aurora.model.dto.PageDTO;
import com.aurora.model.entity.Customer;
import com.aurora.util.MyBatisUtil;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

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

    public Integer queryCustomerIDByName(String userName){
        Integer customerId=customerDAO.getCustomerIdByName(userName);
        System.out.println(customerId);
        return customerId;
    }

    public Integer queryCountCustomer(){
        Integer countCustomer=customerDAO.getCountCustomer();
        return countCustomer;
    }

    public PageDTO<Customer> queryAllPage(PageDTO pageDTO){
        List<Customer> list=customerDAO.getAllByPage(pageDTO);
        pageDTO.setModelList(list);
        return pageDTO;
    }

}
