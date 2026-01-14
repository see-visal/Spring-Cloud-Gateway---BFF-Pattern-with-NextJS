package com.see.account.account_service.config;//package com.see_visal.Account.Service.config;
//
//
//import com.see_visal.Account.Service.entity.Account;
//import com.see_visal.Account.Service.repository.AccountRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//
///**
// * Setup Account Runner
// *
// * Creates sample accounts on startup for testing.
// * Note: Customers should be created in Customer Service first.
// */
//@Component
//@Slf4j
//@RequiredArgsConstructor
//public class 	SetupAccountRunner implements CommandLineRunner {
//
//	private final AccountRepository accountRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		// Check if accounts already exist
//		if (accountRepository.count() > 0) {
//			log.info("Accounts already exist. Skipping setup.");
//			return;
//		}
//
//		log.info("Creating sample accounts...");
//
//		// Create accounts for existing customers (assumed customerId 1 exists in Customer Service)
//		Account account1 = new Account();
//		account1.setAccountType("SAVINGS");
//		account1.setBranchAddress("Phnom Penh Main Branch");
//		account1.setCreateDate(LocalDate.now());
//		account1.setCustomerId(1L); // References customer from Customer Service
//		accountRepository.save(account1);
//		log.info("Created SAVINGS account for customer 1");
//
//		Account account2 = new Account();
//		account2.setAccountType("CHECKING");
//		account2.setBranchAddress("Siem Reap Branch");
//		account2.setCreateDate(LocalDate.now());
//		account2.setCustomerId(1L); // References customer from Customer Service
//		accountRepository.save(account2);
//		log.info("Created CHECKING account for customer 1");
//
//		log.info("Sample accounts created successfully!");
//	}
//
//}
