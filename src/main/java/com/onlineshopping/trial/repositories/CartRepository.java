package com.onlineshopping.trial.repositories;

import com.onlineshopping.trial.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart,UUID> {


}
