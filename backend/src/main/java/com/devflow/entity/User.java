package com.devflow.entity;

import com.devflow.service.Activatable;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity implements Activatable {

    private String name;
    private String email;
    private boolean active;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    public User() {
        super();
    }

    public User(
            Long id,
            String name,
            String email,
            boolean active,
            UserRole role) {
        super(id);
        this.name = name;
        this.email = email;
        this.active = active;
        this.role = role;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public void activate() {
        this.active = true;
    }

    @Override
    public void deactivate() {
        this.active = false;
    }
}