package com.example.examspringjpa.customer.domain;

import com.example.examspringjpa.customer.infrastructure.CustomerEntity;

import java.util.List;

public interface CustomerService {

    CustomerEntity createCustomer(CustomerEntity customer);
//    CustomerEntity updateCustomer(CustomerEntity customer);
    List<CustomerEntity> getAllCustomer();

    CustomerEntity getCustomer(long customerId);

}
