package com.onlineshopping.trial.service.impl;

import com.onlineshopping.trial.dto.UserDto;
import com.onlineshopping.trial.model.User;
import com.onlineshopping.trial.service.IUserServiceMapper;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;

@Generated(value = "org.mapstruct.ap.MappingProcessor",
        date = "2024-10-03T21:17:15+0200",
        comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)")
@Component
public class UserServiceMapper implements IUserServiceMapper {
    @Override
    public User toUserServiceEntity(UserDto userDto) {
        if(userDto == null){
            return null;
        }
        User newUser = new User();
        newUser.setEmail(userDto.getEmail());
        newUser.setGender(userDto.getGender());
        newUser.setRole(userDto.getRole());
        newUser.setFirstName(userDto.getFirstName());
        newUser.setLastName(userDto.getLastName());
        newUser.setPhoneNumber(userDto.getPhoneNumber());
        return newUser;
    }
}
