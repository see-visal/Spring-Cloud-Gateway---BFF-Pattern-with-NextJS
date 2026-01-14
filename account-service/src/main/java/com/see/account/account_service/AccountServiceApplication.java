package com.see.account.account_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication

public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

// Commented out - requires secret properties from config server
//	@Bean
//	public CommandLineRunner commandLineRunner(
//			@Value("${secret.weak-password}") String password_weak,
//			@Value("${secret.strong-password}") String password_strong
//
//			) {
//		return args -> {
//			System.out.println("Weak Password: " + password_weak);
//			System.out.println("Strong Password: " + password_strong);
//
//
//		};
//	}
}
