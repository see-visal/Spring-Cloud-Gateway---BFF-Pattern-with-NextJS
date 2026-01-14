package com.see.order.order_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId; // Changed from 'id' to match pattern

    private String productName;
    private BigDecimal price;
    private Integer quantity;

    @Column(name = "customer_id", nullable = false)
    private Long customerId; // Changed from 'userId'

    private String status; // PENDING, COMPLETED, FAILED

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @PrePersist
    protected void onCreate() {
        this.createDate = LocalDateTime.now();
    }
}