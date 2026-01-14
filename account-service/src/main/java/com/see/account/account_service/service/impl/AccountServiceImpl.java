package com.see.account.account_service.service.impl;

import com.see.account.account_service.dto.AccountRequest;
import com.see.account.account_service.dto.AccountResponse;
import com.see.account.account_service.entity.Account;
import com.see.account.account_service.excetion.AccountNotFoundException;
import com.see.account.account_service.mapper.AccountMapper;
import com.see.account.account_service.repository.AccountRepository;
import com.see.account.account_service.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

	private final AccountRepository accountRepository;
	private final AccountMapper accountMapper;

	@Override
	public AccountResponse createAccount(AccountRequest request) {
		Account account = accountMapper.toEntity(request);
		return accountMapper.toResponse(accountRepository.save(account));
	}

	@Override
	public AccountResponse getAccountById(Long id) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new AccountNotFoundException("Account not found with ID: " + id));
		return accountMapper.toResponse(account);
	}

	@Override
	public AccountResponse getAccountByCustomerId(Long customerId) {
		Account account = accountRepository.findByCustomerId(customerId)
				.orElseThrow(() -> new AccountNotFoundException("Account not found for Customer ID: " + customerId));
		return accountMapper.toResponse(account);
	}

	@Override
	public List<AccountResponse> getAllAccounts() {
		return accountRepository.findAll().stream()
				.map(accountMapper::toResponse)
				.collect(Collectors.toList());
	}

	@Override
	public AccountResponse updateAccount(Long id, AccountRequest request) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new AccountNotFoundException("Account not found with ID: " + id));

		accountMapper.updateEntityFromRequest(request, account);
		return accountMapper.toResponse(accountRepository.save(account));
	}

	@Override
	public void deleteAccount(Long id) {
		if (!accountRepository.existsById(id)) {
			throw new AccountNotFoundException("Account not found with ID: " + id);
		}
		accountRepository.deleteById(id);
	}
}