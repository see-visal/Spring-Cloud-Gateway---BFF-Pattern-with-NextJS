package com.see.visal.indentity;

// Adjust these imports if your Entity/Repo are in different sub-packages
import com.see.visal.indentity.entity.UserEntity;
import com.see.visal.indentity.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class IndentityApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndentityApplication.class, args);
	}

	// 1. FIX: Define the PasswordEncoder here so Spring can find it
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// 2. INIT: Create a default Admin user so you can log in
	@Bean
	public CommandLineRunner initUser(UserRepository repo, PasswordEncoder encoder) {
		return args -> {
			String email = "visal@gmail.com";

			// Only create if not found
			if (repo.findByEmail(email).isEmpty()) {
				UserEntity admin = new UserEntity();
				admin.setEmail(email);
				admin.setPassword(encoder.encode("password")); // Hash the password
				admin.setRole("ROLE_ADMIN");

				repo.save(admin);
				System.out.println("-------------------------------------");
				System.out.println(" ADMIN USER CREATED: " + email);
				System.out.println(" PASSWORD: password");
				System.out.println("-------------------------------------");
			}
		};
	}
}