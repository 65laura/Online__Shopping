package com.onlineshopping.trial.repositories;
import com.onlineshopping.trial.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProductsRepository extends JpaRepository<Products, UUID> {
}
