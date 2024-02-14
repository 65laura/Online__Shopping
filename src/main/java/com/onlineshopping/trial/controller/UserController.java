package com.onlineshopping.trial.controller;
import com.onlineshopping.trial.model.User;
import com.onlineshopping.trial.repositories.UserRepository;
import com.onlineshopping.trial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

public class UserController {

    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @PostMapping("users/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("users/all")
    public ResponseEntity<Page<User>> getAllUsers(Pageable pageable){
        return userService.getAllUsers(pageable);
    }
    @GetMapping("/single/{id}")
    public ResponseEntity<User> getSingleUserById(@PathVariable UUID id){
        return userService.getSingleUser(id);
    }


    @GetMapping("/users/single")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public ResponseEntity<Object> getMyDetails(){
        return ResponseEntity.ok(userRepository.findByEmail(getLoggedInUserDetails().getUsername()));
    }

    public UserDetails getLoggedInUserDetails(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null && authentication.getPrincipal() instanceof UserDetails){
            return (UserDetails) authentication.getPrincipal();
        }
        return null;
    }

}

