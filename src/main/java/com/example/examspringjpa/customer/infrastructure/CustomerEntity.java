package com.example.examspringjpa.customer.infrastructure;

import jakarta.persistence.*;

@Entity(name = "Customer")
public class CustomerEntity {

//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrimaryGrade() {
        return primaryGrade;
    }

    public void setPrimaryGrade(String primaryGrade) {
        this.primaryGrade = primaryGrade;
    }

    @Column(length = 1024)
    private String address;
    private String primaryGrade;        //-- 카멜케이스는 db 에 primary_Grade 대문자분리됨


    public CustomerEntity() {

    }

    public CustomerEntity(int id, String name, String address, String primaryGrade) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.primaryGrade = primaryGrade;
    }
}
