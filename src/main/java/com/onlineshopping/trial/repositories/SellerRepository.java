package com.onlineshopping.trial.repositories;

import com.onlineshopping.trial.model.Seller;
import com.onlineshopping.trial.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface SellerRepository extends JpaRepository<Seller, UUID> {
    @Query(value = "SELECT s FROM Seller s")
    Page<User> getAllSellers(Pageable pageable);
}
