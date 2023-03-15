package com.example.app.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import com.example.app.enumeration.Role;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(nullable = false, unique = true)
    private String username;
  
    @Column(nullable = false)
    private String password;
  
    @Column(unique = true)
    private String email;
  
    @Column(name = "first_name")
    private String firstName;
  
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "tel")
    private String tel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
  
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
  
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
