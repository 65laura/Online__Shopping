package com.onlineshopping.trial.security;
import com.onlineshopping.trial.dto.RequestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/signup")
    public RequestResponse signUp(@RequestBody RequestResponse signupRequest){
        return authService.signUp(signupRequest);
    }
    @PostMapping("/login")
    public RequestResponse signIn(@RequestBody RequestResponse signInRequest){
        return authService.signIn(signInRequest);
    }
    @PostMapping("/refresh")
    public RequestResponse refreshToken(@RequestBody RequestResponse refreshTokenRequest){
        return (authService.refreshToken(refreshTokenRequest));
    }
}
