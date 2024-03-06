package com.onlineshopping.trial.service;
import com.onlineshopping.trial.model.Cart;
import java.util.UUID;
public interface CartService {
    Cart findAllOrdersByCartId(UUID cartId);
}
