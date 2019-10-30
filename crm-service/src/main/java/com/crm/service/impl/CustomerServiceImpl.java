package com.crm.service.impl;

import com.crm.model.Customer;
import com.crm.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {


    public Customer findCustomerById(String id){
        return new Customer();
    }
}
