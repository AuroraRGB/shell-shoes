package com.aurora.service;


import com.aurora.model.entity.Customer;

public interface LoginService {
    Customer checkTelnoAndPwd(Customer customer);
}
