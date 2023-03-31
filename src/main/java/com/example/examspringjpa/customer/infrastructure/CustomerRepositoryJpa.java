package com.example.examspringjpa.customer.infrastructure;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepositoryJpa extends CrudRepository<CustomerEntity, Long> {


}
