package com.onlineshopping.trial.controller;
import com.onlineshopping.trial.service.CustomerService;
import com.onlineshopping.trial.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {
    public final CustomerService customerService;
            @Autowired
    private CustomersController(CustomerService customerService){this.customerService=customerService;}
    @PostMapping
    public ResponseEntity<Customers> createCustomer(@RequestBody Customers customers){

try {
        Customers newCustomer = customerService.createCustomer(customers);
        return ResponseEntity.ok(newCustomer);
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

    }
}}
