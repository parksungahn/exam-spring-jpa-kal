package com.example.examspringjpa.customer.infrastructure;

import com.example.examspringjpa.customer.domain.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerRepositoryConfig {

    @Bean
    public CustomerRepository customerRepository(CustomerRepositoryJpa customerRepositoryJpa)
    {
        return new CustomerRepositoryImpl(customerRepositoryJpa);
    }
}
