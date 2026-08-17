package com.devflow;

import com.devflow.entity.Project;
import com.devflow.entity.User;
import com.devflow.entity.UserRole;
import com.devflow.service.ActivationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoreJavaTest {

    @Test
    void shouldCreateUser() {

        User user = new User(
                1L,
                "Piyush",
                "piyush@example.com",
                true,
                UserRole.USER
        );

        assertEquals("Piyush", user.getName());
        assertEquals("piyush@example.com", user.getEmail());
        assertEquals(UserRole.USER, user.getRole());
        assertTrue(user.isActive());
    }

    @Test
    void shouldDeactivateUser() {

        User user = new User(
                1L,
                "Piyush",
                "piyush@example.com",
                true,
                UserRole.USER
        );

        user.deactivate();

        assertFalse(user.isActive());
    }

    @Test
    void shouldActivateProjectUsingPolymorphism() {

        Project project = new Project(
                1L,
                "DevFlow",
                "Project management platform",
                false
        );

        ActivationService activationService = new ActivationService();

        activationService.activate(project);

        assertTrue(project.isActive());
    }
}