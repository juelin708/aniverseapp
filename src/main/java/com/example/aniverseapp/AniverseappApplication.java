package com.example.aniverseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.aniverseapp"})
public class AniverseappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AniverseappApplication.class, args);
	}

}
