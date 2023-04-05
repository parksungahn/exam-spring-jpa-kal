package com.example.examspringjpa.customer.infrastructure;

import com.example.examspringjpa.customer.domain.CustomerRepository_4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


//@Repository
public class CustomerRepositoryImpl_5 implements CustomerRepository_4 {

    private final CustomerRepositoryJpa_6 customerRepositoryJpa;

    //---############## 생성자
    public CustomerRepositoryImpl_5(final CustomerRepositoryJpa_6 customerRepositoryJpa)
    {
        this.customerRepositoryJpa = customerRepositoryJpa;
    }





    @Override
    public CustomerEntity save(CustomerEntity customerEntity)
    {
        return customerRepositoryJpa.save(customerEntity);
    }

    @Override
    public List<CustomerEntity> getAllCustomer() {
        return StreamSupport.stream(customerRepositoryJpa.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CustomerEntity> findById(long customerId) {
        return customerRepositoryJpa.findById(customerId);
    }



//    @Override
//    public CustomerEntity update(CustomerEntity customerEntity)
//    {
//        return customerRepositoryJpa.(customerEntity);
//    }

}
