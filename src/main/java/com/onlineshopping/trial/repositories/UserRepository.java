package com.onlineshopping.trial.repositories;
import com.onlineshopping.trial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface UserRepository extends JpaRepository<User, UUID> {
}
