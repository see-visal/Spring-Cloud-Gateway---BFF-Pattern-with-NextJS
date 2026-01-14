package com.see.order.order_service.service.impl;


import com.see.order.order_service.dto.OrderRequest;
import com.see.order.order_service.dto.OrderResponse;
import com.see.order.order_service.entity.Order;
import com.see.order.order_service.mapper.OrderMapper;
import com.see.order.order_service.repository.OrderRepository;
import com.see.order.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    @Transactional
    public OrderResponse createOrder(OrderRequest request) {
        // Calculate Amount (just for logging or future logic)
        BigDecimal totalAmount = request.getPrice().multiply(BigDecimal.valueOf(request.getQuantity()));

        System.out.println("Creating Order for Customer ID: " + request.getCustomerId());
        System.out.println("Total Amount: " + totalAmount);

        // Map DTO to Entity
        Order order = orderMapper.toEntity(request);

        // Set default status
        order.setStatus("COMPLETED");

        // Save
        return orderMapper.toResponse(orderRepository.save(order));
    }

    @Override
    public OrderResponse getOrderById(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with ID: " + id));
        return orderMapper.toResponse(order);
    }

    @Override
    public List<OrderResponse> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public OrderResponse updateOrder(Long id, OrderRequest request) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with ID: " + id));

        orderMapper.updateEntityFromRequest(request, order);
        return orderMapper.toResponse(orderRepository.save(order));
    }

    @Override
    public void deleteOrder(Long id) {
        if (!orderRepository.existsById(id)) {
            throw new RuntimeException("Order not found with ID: " + id);
        }
        orderRepository.deleteById(id);
    }
}