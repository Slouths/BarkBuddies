package com.barkbuddiesrescue.BarkBuddies.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/api/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Implement login logic here
        // For now, just return a success message
        return "Login successful for user: " + loginRequest.getUsername();
    }

    // Public static nested class
    @Setter
    @Getter
    public static class LoginRequest {
        // Getters and setters
        private String username;
        private String password;

    }
}