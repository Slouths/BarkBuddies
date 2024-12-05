package com.example.dogadoption.controller;

import com.example.dogadoption.entity.Dog;
import com.example.dogadoption.repository.DogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    private final DogRepository dogRepository;

    public DogController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @GetMapping("/api/dogs/filter")
    public List<Dog> filterDogsByBreed(@RequestParam String breed) {
        return dogRepository.findByBreed(breed);
    }
}
