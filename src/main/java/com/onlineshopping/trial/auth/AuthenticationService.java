package com.onlineshopping.trial.auth;

import com.onlineshopping.trial.Role;
import com.onlineshopping.trial.config.Jwt.JwtService;
import com.onlineshopping.trial.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private UserRepository userRepository;
    private  PasswordEncoder passwordEncoder;
    private JwtService jwtService;
    private AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest registerRequest) {
        var user= User.builder()
//                .firstName(registerRequest.getLastName)
//                .lastName(registerRequest.getLastName)
//                .email(registerRequest.getEmail())
//               .password(passwordEncoder.encode(registerRequest.getPassword()))
                .roles(String.valueOf(Role.customer))
                .build();
//         userRepository.save(user);
//         var jwtToken= jwtService.generateToken(user);
//        return AuthenticationResponse.builder();
//                .token(jwtToken)
//                .build();
//    }
//
//    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
// authenticationManager.authenticate(
//     new UsernamePasswordAuthenticationToken( registerRequest.getEmail(), registerRequest.getPassword()));
// var user=userRepository.findByEmail(registerRequest.getEmail())
//         .orElseThrow();
//       var jwtToken=jwtService.generateToken(user);
//        return AuthenticationResponse.builder()
//                .token(jwtToken)
//                .build();
  //  }
        return null;
}

    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        return null;
    }
}
