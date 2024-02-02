package com.onlineshopping.trial.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.onlineshopping.trial.enums.Role;
import com.onlineshopping.trial.model.Products;
import com.onlineshopping.trial.model.User;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestResponse {
    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationDate;
    private String name;
    private String email;
    private String role;
    private String password;
    private List<Products>products;
    private User user;
    private String expirationTime;


    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public Role getRole(){
        return Role.valueOf(this.role);
    }
    public  User setUsers(User user){
        return user = this.user;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getToken() {
        return  this.token;
    }
}

