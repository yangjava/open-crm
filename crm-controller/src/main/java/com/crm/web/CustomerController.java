package com.crm.web;

import com.crm.model.Customer;
import com.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("findCustomerById")
    public String findCustomerById(@RequestParam("id") String id){
        Customer customer = customerService.findCustomerById(id);
        return "SUCCESS";
    }
}
