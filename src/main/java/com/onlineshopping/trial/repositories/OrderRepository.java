package com.onlineshopping.trial.repositories;
import com.onlineshopping.trial.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
