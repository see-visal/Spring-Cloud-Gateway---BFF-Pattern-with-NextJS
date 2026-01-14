package com.see.order.order_service.service;


import com.see.order.order_service.dto.OrderRequest;
import com.see.order.order_service.dto.OrderResponse;

import java.util.List;

public interface OrderService {
    OrderResponse createOrder(OrderRequest request);
    OrderResponse getOrderById(Long id);
    List<OrderResponse> getAllOrders();
    OrderResponse updateOrder(Long id, OrderRequest request);
    void deleteOrder(Long id);
}