package com.example.SpringBoot_Java_Docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJavaDockerApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to my new project"
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJavaDockerApplication.class, args);
	}

}
