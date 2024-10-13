package com.barkbuddiesrescue.BarkBuddies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BarkBuddiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarkBuddiesApplication.class, args);
	}

	// Rest Point
	@GetMapping
	public String hello() {
		return "Hello World";
	}
}

