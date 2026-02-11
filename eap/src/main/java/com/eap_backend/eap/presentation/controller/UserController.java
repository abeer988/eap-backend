package com.eap_backend.eap.presentation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eap_backend.eap.mapper.UserDtoMapper;
import com.eap_backend.eap.presentation.DTO.UserDTO;
import com.eap_backend.eap.presentation.DTO.UserDTO.UserResponseDTO;
import com.eap_backend.eap.service.User;
import com.eap_backend.eap.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserDTO.UserResponseDTO addUser(@RequestBody UserDTO.UserRequestDTO request)
    {
        User userRequest = UserDtoMapper.toService(request);
        return UserDtoMapper.toResponse(service.addUser(userRequest));
    }

     @GetMapping
    public UserDTO.UserResponseDTO getUser()
    {
       return new UserResponseDTO(1,"abeer");
    }

}
