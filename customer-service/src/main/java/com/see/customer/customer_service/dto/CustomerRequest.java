package com.see.customer.customer_service.dto;

import lombok.Data;

@Data
public class CustomerRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber; // New field
    private String address;      // New field
}