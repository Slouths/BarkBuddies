package com.barkbuddiesrescue.BarkBuddies.config.Database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}