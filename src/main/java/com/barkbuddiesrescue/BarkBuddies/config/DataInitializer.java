package com.barkbuddiesrescue.BarkBuddies.config;

import com.barkbuddiesrescue.BarkBuddies.config.Database.User;
import com.barkbuddiesrescue.BarkBuddies.config.Database.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Test user 1
            if (userRepository.findByUsername("test@test.com") == null) {
                User testUser = new User();
                testUser.setUsername("test@test.com");
                testUser.setPassword(passwordEncoder.encode("test123"));
                testUser.setEmail("test@test.com");
                userRepository.save(testUser);
                System.out.println("Test user created");
            }

            // Admin user
            if (userRepository.findByUsername("admin@barkbuddies.com") == null) {
                User adminUser = new User();
                adminUser.setUsername("admin@barkbuddies.com");
                adminUser.setPassword(passwordEncoder.encode("admin123"));
                adminUser.setEmail("admin@barkbuddies.com");
                userRepository.save(adminUser);
                System.out.println("Admin user created");
            }

            // Regular user
            if (userRepository.findByUsername("user@example.com") == null) {
                User regularUser = new User();
                regularUser.setUsername("user@example.com");
                regularUser.setPassword(passwordEncoder.encode("user123"));
                regularUser.setEmail("user@example.com");
                userRepository.save(regularUser);
                System.out.println("Regular user created");
            }
        };
    }
}