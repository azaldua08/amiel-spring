package com.magenic.amielspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class AmielSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmielSpringApplication.class, args);
	}

}
