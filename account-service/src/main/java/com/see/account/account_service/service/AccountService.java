package com.see.account.account_service.service;



import com.see.account.account_service.dto.AccountRequest;
import com.see.account.account_service.dto.AccountResponse;

import java.util.List;

public interface AccountService {
	AccountResponse createAccount(AccountRequest request);
	AccountResponse getAccountById(Long id);
	AccountResponse getAccountByCustomerId(Long customerId);
	List<AccountResponse> getAllAccounts();
	AccountResponse updateAccount(Long id, AccountRequest request);
	void deleteAccount(Long id);
}