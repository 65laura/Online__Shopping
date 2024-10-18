package com.onlineshopping.trial.service;
import com.onlineshopping.trial.model.Cart;

import java.util.Optional;
import java.util.UUID;
public interface CartService {
    Optional<Cart> findByCartId(UUID cartId);
}
