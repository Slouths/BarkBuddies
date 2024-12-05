package com.example.dogadoption.repository;

import com.example.dogadoption.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DogRepository extends JpaRepository<Dog, Long> {
    List<Dog> findByBreed(String breed);
}
