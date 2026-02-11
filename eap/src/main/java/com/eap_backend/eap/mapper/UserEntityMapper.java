package com.eap_backend.eap.mapper;

import com.eap_backend.eap.infrastructure.model.UserEntity;
import com.eap_backend.eap.service.User;

public class UserEntityMapper {
     private UserEntityMapper() {
        // prevent instantiation
    }

    // Request DTO → Service Model
    public static UserEntity toEntity(User user) {
        if (user == null) return null;

        return UserEntity.builder().name(user.getName()).build();
    }

    // Service Model → Response DTO
    public static User toService(UserEntity entity) {
        if (entity == null) return null;

        return User.builder()
        .id(entity.getId()).name(entity.getName()).build();
    }
}
