package com.see.account.account_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId; // Primary Key

	@Column(name = "customer_id", nullable = false)
	private Long customerId; // Linked to Customer

	private BigDecimal balance;

	@Column(name = "create_date", nullable = false, updatable = false)
	private LocalDateTime createDate;

	@PrePersist
	protected void onCreate() {
		this.createDate = LocalDateTime.now();
	}
}