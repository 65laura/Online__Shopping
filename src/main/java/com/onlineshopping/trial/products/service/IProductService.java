package com.onlineshopping.trial.products.service;

import com.onlineshopping.trial.dto.ProductDto;
import com.onlineshopping.trial.products.model.Products;
import org.springframework.http.ResponseEntity;

public interface IProductService {
    Products createProduct(ProductDto products);

}
