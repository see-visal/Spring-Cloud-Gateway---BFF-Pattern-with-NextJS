package com.see.order.order_service.repository;

import com.see.order.order_service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Optional: Find all orders for a specific customer
    List<Order> findByCustomerId(Long customerId);
}