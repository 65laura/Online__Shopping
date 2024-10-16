package com.onlineshopping.trial.service.impl;

import com.onlineshopping.trial.model.Customers;
import com.onlineshopping.trial.repositories.CustomersRepository;
import com.onlineshopping.trial.service.CustomerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private final CustomersRepository customersRepository;

    public CustomerServiceImpl(final CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    @Override
    public Customers createCustomer(Customers customers) {

        return customersRepository.save(customers);
    }
}
