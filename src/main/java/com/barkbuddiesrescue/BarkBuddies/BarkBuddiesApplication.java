package com.barkbuddiesrescue.BarkBuddies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class BarkBuddiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarkBuddiesApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/adoptionpage")
	public String adoptionpage() {
		return "adoptionpage";
	}
}
