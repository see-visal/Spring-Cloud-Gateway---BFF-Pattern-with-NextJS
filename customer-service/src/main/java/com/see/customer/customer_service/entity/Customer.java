package com.see.customer.customer_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "customers")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String firstName;
    private String lastName;
    private String name;

    @Column(unique = true)
    private String email;

    private String mobileNumber;
    private String address;
    private Boolean communicationAlreadySent;

    // --- ADD THIS SECTION ---
    @Column(name = "create_date", nullable = false, updatable = false)
    private LocalDateTime createDate;

    @PrePersist // This runs automatically before saving to DB
    protected void onCreate() {
        this.createDate = LocalDateTime.now();
    }




}