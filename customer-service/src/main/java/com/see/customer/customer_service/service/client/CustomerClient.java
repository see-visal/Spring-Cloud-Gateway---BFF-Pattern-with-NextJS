//package com.see.customer.customer_service.service.client;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@FeignClient(name = "customer-service", url = "http://localhost:8081/api/v1/customers")
//public interface CustomerClient {
//    @GetMapping("/{customerId}")
//    Object getCustomerById(@PathVariable("customerId") Long customerId);
//}