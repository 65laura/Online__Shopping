package com.onlineshopping.trial.repositories;

import com.onlineshopping.trial.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SellerRepository extends JpaRepository<Seller, UUID> {
}
