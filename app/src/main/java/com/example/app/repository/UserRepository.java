package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}