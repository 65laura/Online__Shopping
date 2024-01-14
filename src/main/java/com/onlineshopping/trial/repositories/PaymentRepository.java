package com.onlineshopping.trial.repositories;
import com.onlineshopping.trial.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface PaymentRepository extends JpaRepository<Payment, UUID> {
}
