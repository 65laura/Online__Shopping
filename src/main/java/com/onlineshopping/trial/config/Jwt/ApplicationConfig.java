package com.onlineshopping.trial.config.Jwt;
import com.onlineshopping.trial.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    private UserRepository userRepository;
    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return userRepository.findByEmail(username)
                        .orElseThrow(() ->new UsernameNotFoundException("user not found"));
            }
            @Bean
            public AuthenticationProvider authenticationProvider(){
                DaoAuthenticationProvider authenticationProvider= new DaoAuthenticationProvider();
                authenticationProvider.setUserDetailsService(userDetailsService());
                authenticationProvider.setPasswordEncoder(passwordEncoder());
                return authenticationProvider;
            }
            @Bean
            public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
               return configuration.getAuthenticationManager();
            }
        };
    }
@Bean
    public PasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
    }

}
