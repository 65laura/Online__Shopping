package com.onlineshopping.trial.controller;

import com.onlineshopping.trial.service.ProductService;
import com.onlineshopping.trial.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private final ProductService productService;
    @Autowired
    private ProductsController(ProductService productService){
        this.productService=productService;
    }
    @PostMapping
    private ResponseEntity<Products>createProduct(@RequestBody Products products) {

        try {
            Products newProduct = productService.createProduct(products);
            return ResponseEntity.ok(newProduct);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }}
