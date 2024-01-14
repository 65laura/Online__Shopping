package com.onlineshopping.trial.repositories;
import com.onlineshopping.trial.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CustomersRepository extends JpaRepository<Customers, UUID> {
}
