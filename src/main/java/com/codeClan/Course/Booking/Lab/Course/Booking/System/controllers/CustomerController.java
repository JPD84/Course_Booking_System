package com.codeClan.Course.Booking.Lab.Course.Booking.System.controllers;

import com.codeClan.Course.Booking.Lab.Course.Booking.System.models.Customer;
import com.codeClan.Course.Booking.Lab.Course.Booking.System.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Customer>getAllCustomers(){
        return customerRepository.findAll();
    }
}
