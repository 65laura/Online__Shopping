package com.onlineshopping.trial.repositories;

import com.onlineshopping.trial.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart,UUID> {
    @Query(value = "SELECT c FROM Cart c ")
    Cart findAllOrdersByCartId(UUID cartId);
    @Query(value ="SELECT c FROM Cart c" )
    <E> Cart findAll(List<E> of);
}
