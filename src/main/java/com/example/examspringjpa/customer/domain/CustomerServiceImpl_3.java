package com.example.examspringjpa.customer.domain;

import com.example.examspringjpa.customer.infrastructure.CustomerEntity;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl_3 implements CustomerService_2 {

    private final CustomerRepository_4 customerRepository;

    //---############## 생성자
    public CustomerServiceImpl_3(final CustomerRepository_4 customerRepository)
    {
        this.customerRepository = customerRepository;
    }




    @Override
    @Transactional
    public CustomerEntity createCustomer(CustomerEntity customer)
    {
        return customerRepository.save(customer);
    }


    @Override
    public List<CustomerEntity> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }

    @Override
    public CustomerEntity getCustomer(long customerId)  {
//        // java 기존 문법
        CustomerEntity todoEntity = customerRepository.findById(customerId).get();

//        if (todoEntity == null) {
//            throw new Exception("Todo not found.");
//        }

        return todoEntity;

        // 2. functional Programming : Optional
//        return customerRepository.findById(customerId)
//                .orElseThrow(() -> new ChangeSetPersister.NotFoundException("Todo not found."));
    }

}
