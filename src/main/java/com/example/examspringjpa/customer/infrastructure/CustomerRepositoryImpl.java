package com.example.examspringjpa.customer.infrastructure;

import com.example.examspringjpa.customer.domain.CustomerRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


//@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private final CustomerRepositoryJpa customerRepositoryJpa;

    public CustomerRepositoryImpl(final CustomerRepositoryJpa customerRepositoryJpa)
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
