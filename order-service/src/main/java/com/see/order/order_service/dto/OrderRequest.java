package com.see.order.order_service.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderRequest {
    private String productName;
    private BigDecimal price;
    private Integer quantity;
    private Long customerId;
}