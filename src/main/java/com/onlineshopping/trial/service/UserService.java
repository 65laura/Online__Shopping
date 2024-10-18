package com.onlineshopping.trial.service;
import com.onlineshopping.trial.dto.UserDto;
import com.onlineshopping.trial.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import java.util.UUID;
@Service
public interface UserService extends UserDetailsService{
    User createUser(UserDto userdto) ;

    ResponseEntity<String> deleteUser(UUID user_id);

     ResponseEntity<User> editUser(UUID user_id);

     ResponseEntity<Page<User>> getAllUsers(Pageable pageable);

    ResponseEntity<User> getSingleUser(UUID user_id);
}

