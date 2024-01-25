package com.onlineshopping.trial.demo;

import com.onlineshopping.trial.auth.AuthenticationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/demo")

public class DemoController {
    @GetMapping
    public ResponseEntity<String>sayHello(){
        return ResponseEntity.ok("hello from secured endpoint");
    }
}
