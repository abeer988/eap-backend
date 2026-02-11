package com.eap_backend.eap.mapper;

import com.eap_backend.eap.presentation.DTO.UserDTO;
import com.eap_backend.eap.service.User;

public class UserDtoMapper {

     private UserDtoMapper() {
       
    }

    // Request DTO → Service Model
    public static User toService(UserDTO.UserRequestDTO dto) {
        if (dto == null) return null;

        return User.builder()
                .name(dto.getName())
                .build();
    }

    // Service Model → Response DTO
    public static UserDTO.UserResponseDTO toResponse(User user) {
        if (user == null) return null;

        return new UserDTO.UserResponseDTO(
                user.getId(),
                user.getName()
        );
    }
    
}
