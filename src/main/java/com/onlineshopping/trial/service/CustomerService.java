package com.onlineshopping.trial.service;

import com.onlineshopping.trial.model.Customers;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customers createCustomer(Customers customers);
}
