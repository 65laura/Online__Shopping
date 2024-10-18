package com.onlineshopping.trial.repositories;

import com.onlineshopping.trial.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart,UUID> {
    @Query(value = "SELECT c FROM Cart c WHERE c.cartId =:cartId")
    Optional<Cart> findByCartId(@Param("cartId") UUID cartId);

}
