package com.barkbuddiesrescue.BarkBuddies.config.Database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "dogs")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Integer age;

    @Column(nullable = false)
    private String breed;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Double weight;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String medicalHistory;

    @Column(columnDefinition = "TEXT")
    private String behavioralNotes;

    @Enumerated(EnumType.STRING)
    private AdoptionStatus adoptionStatus;

    // You might want to store image URLs or paths
    private String photoUrl;

    // Enums can be defined as inner classes or separate files
    public enum Gender {
        MALE, FEMALE
    }

    public enum AdoptionStatus {
        AVAILABLE, PENDING, ADOPTED
    }
}
