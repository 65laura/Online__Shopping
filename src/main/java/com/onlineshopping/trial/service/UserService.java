package com.onlineshopping.trial.service;
import com.onlineshopping.trial.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import java.util.UUID;
@Service
public interface UserService extends UserDetailsService{
    public User createUser(User user) ;

    public ResponseEntity<String> deleteUser(UUID user_id);

    public ResponseEntity<User> editUser(UUID user_id);

    public ResponseEntity<Page<User>> getAllUsers(Pageable pageable);

   public ResponseEntity<User> getSingleUser(UUID user_id);
}

