package com.onlineshopping.trial.products.service;
import com.onlineshopping.trial.dto.ProductDto;
import com.onlineshopping.trial.products.model.Products;
import com.onlineshopping.trial.products.repository.ProductsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductsServiceImpl implements IProductService {

    public final ProductsRepository productsRepository;
    public final IProductServiceMapper productServiceMapper;


    @Override
    @SneakyThrows
    public Products createProduct(ProductDto products) {
        Optional<Products> existingProduct = productsRepository.findProductsByproductName(products.getProductName());
        if(existingProduct.isPresent()){
            throw new RuntimeException("Product Already exists");
                }
        return productServiceMapper.toProductServiceEntity(products);
    }

}
