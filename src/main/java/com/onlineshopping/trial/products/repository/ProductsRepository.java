package com.onlineshopping.trial.products.repository;
import com.onlineshopping.trial.products.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface ProductsRepository extends JpaRepository<Products, UUID> {
    @Query("SELECT p FROM Products p WHERE p.productName = :productName")
   Optional<Products> findProductsByproductName(@Param("productName") String productName);


}
