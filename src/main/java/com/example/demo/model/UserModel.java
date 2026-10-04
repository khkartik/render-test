package com.example.demo.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CurrentTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "users")
public class UserModel {
    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column 
    private String name;
    @Column (unique = true)
    private String email;
    @CurrentTimestamp 
    @Column (updatable = false)
    private LocalDateTime createdAt;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
