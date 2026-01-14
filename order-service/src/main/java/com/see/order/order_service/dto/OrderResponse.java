package com.see.order.order_service.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderResponse {
    private Long orderId;    // Matches Entity
    private Long customerId; // Matches Entity
    private String productName;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String status;
    private LocalDateTime createDate;
}