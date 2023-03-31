package com.example.examspringjpa.controller;

import com.example.examspringjpa.customer.infrastructure.CustomerEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class testController {


    // http://localhost:8080/test
    @GetMapping("/test")
    public String searchCustomer() {
        return "Helloworld";
    }
}
