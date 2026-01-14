package com.see.order.order_service.mapper;

import com.see.order.order_service.dto.OrderRequest;
import com.see.order.order_service.dto.OrderResponse;
import com.see.order.order_service.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toEntity(OrderRequest request);

    @Mapping(target = "totalAmount", expression = "java(order.getPrice().multiply(java.math.BigDecimal.valueOf(order.getQuantity())))")
    OrderResponse toResponse(Order order);

    void updateEntityFromRequest(OrderRequest request, @MappingTarget Order order);
}