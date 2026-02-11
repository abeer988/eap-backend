package com.eap_backend.eap.service;

import org.springframework.stereotype.Service;

import com.eap_backend.eap.infrastructure.repository.UserRepository;
import com.eap_backend.eap.mapper.UserEntityMapper;
import com.eap_backend.eap.infrastructure.model.UserEntity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository repository;

    public User addUser(User user)
    {
        UserEntity entity =UserEntityMapper.toEntity(user);
        UserEntity new_user = repository.save(entity);
        return  UserEntityMapper.toService(new_user);
    }

}
