package com.eap_backend.eap.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eap_backend.eap.infrastructure.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
