package com.see.account.account_service.mapper;


import com.see.account.account_service.dto.AccountRequest;
import com.see.account.account_service.dto.AccountResponse;
import com.see.account.account_service.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AccountMapper {

	// Auto-maps fields with same names (customerId -> customerId, balance -> balance)
	Account toEntity(AccountRequest request);

	// Auto-maps fields (accountId -> accountId, customerId -> customerId)
	AccountResponse toResponse(Account account);

	void updateEntityFromRequest(AccountRequest request, @MappingTarget Account account);
}