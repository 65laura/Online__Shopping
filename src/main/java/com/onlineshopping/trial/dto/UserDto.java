package com.onlineshopping.trial.dto;

import com.onlineshopping.trial.enums.EGender;
import com.onlineshopping.trial.enums.ERole;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDto {
    String email;
    String firstName;
    String lastName;
    String phoneNumber;
    LocalDateTime dateOfBirth;
    ERole role;
    EGender gender;
}
