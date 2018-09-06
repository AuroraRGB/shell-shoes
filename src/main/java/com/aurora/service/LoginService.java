package com.aurora.service;

import com.aurora.entity.Customer;

public interface LoginService {
    Customer checkTelnoAndPwd(Customer customer);
}
