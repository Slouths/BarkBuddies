package com.barkbuddiesrescue.BarkBuddies.config.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DogController {

    @Autowired
    private DogRepository dogRepository;

    @GetMapping("/dogForm")
    public String showDogForm(Model model) {
        // Add an empty Dog object to the model
        model.addAttribute("dog", new Dog());
        return "dogForm";
    }

    @PostMapping("/dogForm")
    public String submitDogForm(@ModelAttribute("dog") Dog dog) {
        // Save the dog to the database
        dogRepository.save(dog);
        // Redirect to prevent form resubmission
        return "redirect:/adoptionpage";
    }
}