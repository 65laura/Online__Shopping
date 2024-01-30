package com.onlineshopping.trial.controller;

import com.onlineshopping.trial.dto.RequestResponse;
import com.onlineshopping.trial.model.Products;
import com.onlineshopping.trial.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AdminCustomer {
    @Autowired
    private ProductsRepository productsRepository;
    @GetMapping("/public/product")
    public ResponseEntity<Object>getAllProducts(){
        return ResponseEntity.of(Optional.of(productsRepository.findAll()));
    }
//    @PostMapping("/admin/saveProduct")
//    public ResponseEntity<Object>signUp(@RequestBody RequestResponse requestResponse){
//        Products productToSave = new Products();
//        productToSave.(productRequest.getName());
//    }


}
