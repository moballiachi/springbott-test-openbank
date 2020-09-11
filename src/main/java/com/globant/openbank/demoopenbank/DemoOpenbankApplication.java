package com.globant.openbank.demoopenbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(scanBasePackages = {"com.globant.openbank"})
public class DemoOpenbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenbankApplication.class, args);
	}

}