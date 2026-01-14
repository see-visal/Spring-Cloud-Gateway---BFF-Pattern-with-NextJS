package com.see.customer.customer_service.mapper;


import com.see.customer.customer_service.dto.CustomerRequest;
import com.see.customer.customer_service.dto.CustomerResponse;
import com.see.customer.customer_service.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toEntity(CustomerRequest request);


    CustomerResponse toResponse(Customer customer);

    void updateEntityFromRequest(CustomerRequest request, @MappingTarget Customer customer);
}