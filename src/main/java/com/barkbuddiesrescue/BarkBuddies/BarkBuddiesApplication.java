package com.barkbuddiesrescue.BarkBuddies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class BarkBuddiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarkBuddiesApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/adoptionpage")
	public String adoptionpage() {
		return "adoptionpage";
	}
}
