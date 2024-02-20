package com.onlineshopping.trial.service.impl;
import com.onlineshopping.trial.model.Products;
import com.onlineshopping.trial.repositories.ProductsRepository;
import com.onlineshopping.trial.service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductsServiceImpl implements ProductService {
    @Autowired
    public ProductsRepository productsRepository;
    @Override
    public Products createProduct (Products products){
        return productsRepository.save(products);
    }

    @Override
    public ResponseEntity<Products> findProductsByProductName(String product_name) {
        Products products=  productsRepository.findProductsByproductName(product_name);
        return ResponseEntity.ok(products);
    }
}
