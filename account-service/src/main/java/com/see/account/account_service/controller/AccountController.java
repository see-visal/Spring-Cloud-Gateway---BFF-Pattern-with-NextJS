

package com.see.account.account_service.controller;

import com.see.account.account_service.dto.AccountRequest;
import com.see.account.account_service.dto.AccountResponse;
import com.see.account.account_service.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor
public class AccountController {

	private final AccountService accountService;

	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<AccountResponse> create(@RequestBody AccountRequest request) {
		return new ResponseEntity<>(accountService.createAccount(request), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	@PreAuthorize("hasAuthority('ROLE_USER')") // User can see their own account (simplified)
	public ResponseEntity<AccountResponse> getById(@PathVariable Long id) {
		return ResponseEntity.ok(accountService.getAccountById(id));
	}

	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_ADMIN')") // Only Admin sees ALL accounts
	public ResponseEntity<List<AccountResponse>> getAll() {
		return ResponseEntity.ok(accountService.getAllAccounts());
	}
	@PutMapping("/{id}")
	public ResponseEntity<AccountResponse> update(@PathVariable Long id, @RequestBody AccountRequest request) {
		return ResponseEntity.ok(accountService.updateAccount(id, request));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		accountService.deleteAccount(id);
		return ResponseEntity.noContent().build();
	}

}