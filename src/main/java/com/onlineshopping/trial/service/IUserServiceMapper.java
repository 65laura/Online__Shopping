package com.onlineshopping.trial.service;


import com.onlineshopping.trial.dto.UserDto;
import com.onlineshopping.trial.model.User;
import com.onlineshopping.trial.products.service.IgnoreNullMappingConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = IgnoreNullMappingConfig.class,componentModel = "Spring")
public interface IUserServiceMapper {
    @Mapping(target = "firstName", ignore = true)
    @Mapping(target = "lastName", ignore = true)
    @Mapping(target = "phoneNumber", ignore = true)
    @Mapping(target = "dateOfBirth", ignore = true)
    @Mapping(target = "email", ignore = true)
    @Mapping(target = "gender", ignore = true)
    @Mapping(target = "role", ignore = true)
    User toUserServiceEntity(UserDto userDto);
}
