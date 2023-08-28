package com.coderscampus.springsecuritypractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.springsecuritypractice.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    User findByUsername(String username);
}