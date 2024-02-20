package com.onlineshopping.trial.service.impl;
import com.onlineshopping.trial.model.User;
import com.onlineshopping.trial.repositories.UserRepository;
import com.onlineshopping.trial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public ResponseEntity<String> deleteUser(UUID user_id) {
        return null;
    }

    @Override
    public ResponseEntity<User> editUser(UUID user_id) {
        return null;
    }

    @Override
    public ResponseEntity<Page<User>> getAllUsers(Pageable pageable) {
        Page<User> users =  userRepository.getAllUsers(pageable);
        return ResponseEntity.ok(users);
    }

    @Override
    public ResponseEntity<User> getSingleUser(UUID user_id) {
        User user =  userRepository.getSingleUserById(user_id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User with such an ID not found"));
        return ResponseEntity.ok(user);}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).orElseThrow();
}}
