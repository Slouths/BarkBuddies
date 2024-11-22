package com.barkbuddiesrescue.BarkBuddies.config.Database;

//import com.barkbuddiesrescue.BarkBuddies.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
    // Basic CRUD operations are automatically provided by JpaRepository
}