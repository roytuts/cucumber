package com.roytuts.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CucumberApp {

	public static void main(String[] args) {
		SpringApplication.run(CucumberApp.class, args);
	}

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

}
