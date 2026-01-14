package com.see.account.account_service.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class AccountResponse {
    private Long accountId;
    private Long customerId;
    private BigDecimal balance;
}