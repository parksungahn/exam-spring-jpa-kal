package com.example.examspringjpa.customer.infrastructure;

import com.example.examspringjpa.customer.domain.CustomerRepository_4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerRepositoryConfig_6 {

    @Bean
    public CustomerRepository_4 customerRepository(CustomerRepositoryJpa_6 customerRepositoryJpa)
    {
        return new CustomerRepositoryImpl_5(customerRepositoryJpa);
    }
}
