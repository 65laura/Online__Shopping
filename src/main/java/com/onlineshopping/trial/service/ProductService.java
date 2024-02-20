package com.onlineshopping.trial.service;

import com.onlineshopping.trial.model.Products;
import com.onlineshopping.trial.model.User;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface ProductService {
    Products createProduct(Products products);
    public ResponseEntity<Products> findProductsByProductName(String product_name);

}
