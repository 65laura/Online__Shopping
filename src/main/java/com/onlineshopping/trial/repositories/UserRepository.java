package com.onlineshopping.trial.repositories;
import com.onlineshopping.trial.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface  UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);
    @Query(value = "SELECT u FROM User u")
    Page<User> getAllUsers(Pageable pageable);
}
