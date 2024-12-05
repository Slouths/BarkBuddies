package com.example.dogadoption.controller;

import com.example.dogadoption.entity.AdoptionApplication;
import com.example.dogadoption.repository.AdoptionApplicationRepository;
import com.example.dogadoption.repository.DogRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
public class AdoptionApplicationController {

    private final AdoptionApplicationRepository applicationRepository;
    private final DogRepository dogRepository;

    public AdoptionApplicationController(AdoptionApplicationRepository applicationRepository, DogRepository dogRepository) {
        this.applicationRepository = applicationRepository;
        this.dogRepository = dogRepository;
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitApplication(@RequestBody AdoptionApplication application) {
        // Check if the dog exists
        if (dogRepository.existsById(application.getDog().getId())) {
            applicationRepository.save(application);
            return ResponseEntity.ok("Application submitted successfully!");
        } else {
            return ResponseEntity.badRequest().body("Invalid Dog ID.");
        }
    }
}
