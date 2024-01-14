package com.onlineshopping.trial.repositories;
import com.onlineshopping.trial.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CategoriesRepository extends JpaRepository<Categories, UUID> {
}
