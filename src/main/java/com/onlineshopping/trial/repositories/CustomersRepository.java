package com.onlineshopping.trial.repositories;
import com.onlineshopping.trial.model.Customers;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface CustomersRepository extends JpaRepository<Customers, UUID> {
    @Query(value = "SELECT c FROM Customers c ")
    List<Customers> findAllCustomers(Sort sort);

}
