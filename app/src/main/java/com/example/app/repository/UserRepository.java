package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}