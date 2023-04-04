package com.example.examspringjpa.customer.controller;

import com.example.examspringjpa.customer.domain.CustomerService_2;
import com.example.examspringjpa.customer.infrastructure.CustomerEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/v1/customer")
public class CustomerController_1 {

    private final CustomerService_2 customerService;


    public CustomerController_1(final CustomerService_2 customerService)
    {
        this.customerService = customerService;
    }



    // http://localhost:8080/customer?name=홍길동1&address=서울시1&primaryGrade=1
//    @GetMapping("/customer")
//    public String searchCustomer() {
//        return "Helloworld";
//    }

    // http://localhost:8080/customer
    //--@RequestBody 는 꼭 Body에 json으로 넘겨야함.
//    {
//        "name":"홍길동1"
//            ,"address":"hong@gmail.com"
//            ,"primaryGrade": 2
//    }



    //--http://localhost:8080/customer
    @GetMapping("/customer")
    public List<CustomerEntity> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    //--http://localhost:8080/customer/1
    @GetMapping("/customer/{id}")
    public CustomerEntity getCustomer(@PathVariable(name = "id") long customerId) {
        return customerService.getCustomer(customerId);
    }


    @PostMapping("/customer")
    public CustomerEntity createCustomer(@RequestBody CustomerEntity customer) {
        return customerService.createCustomer(customer);
    }


//    @PutMapping("/customer")
//    public CustomerEntity putCustomer(@RequestBody CustomerEntity customer)
//    {
//        return customerService.save(customer);
//    }

}
