package com.example.demospringbootwebproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.example.demospringbootwebproject"})
public class DemospringBootWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringBootWebProjectApplication.class, args);
	}

}
