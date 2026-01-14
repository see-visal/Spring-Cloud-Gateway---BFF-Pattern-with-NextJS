package com.see.account.account_service.repository;

import com.see.account.account_service.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
	// OLD (Error): Optional<Account> findByUserId(Long userId);

	// NEW (Correct):
	Optional<Account> findByCustomerId(Long customerId);
}