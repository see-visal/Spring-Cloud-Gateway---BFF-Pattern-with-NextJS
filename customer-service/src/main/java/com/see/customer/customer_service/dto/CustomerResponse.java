package com.see.customer.customer_service.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CustomerResponse {
    private Long customerId; // Changed from 'id' to match Entity
    private String name;     // Full name
    private String email;
    private String mobileNumber;
    private String address;
    private LocalDateTime createDate; // New field
}