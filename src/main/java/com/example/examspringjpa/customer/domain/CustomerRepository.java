package com.example.examspringjpa.customer.domain;

import com.example.examspringjpa.customer.infrastructure.CustomerEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    CustomerEntity save(CustomerEntity customer);

    List<CustomerEntity> getAllCustomer();

    Optional<CustomerEntity> findById(long customerId);
}
