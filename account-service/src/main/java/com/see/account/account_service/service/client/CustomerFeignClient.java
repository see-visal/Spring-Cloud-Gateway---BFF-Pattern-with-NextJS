package com.see.account.account_service.service.client;//package com.see_visal.Account.Service.service.client;
//
//import com.see_visal.Account.Service.dto.CustomerDTO;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//
//import java.util.List;
//
///**
// * Feign Client for Customer Service
// *
// * This client communicates with the Customer Service to fetch customer data.
// * Account Service does NOT store customer data - it only stores customerId references.
// */
//@FeignClient(name = "customer", fallback = CustomerFeignClientFallback.class)
//public interface CustomerFeignClient {
//
//    /**
//     * Get customer by ID from Customer Service
//     */
//    @GetMapping("/api/v1/customers/{customerId}")
//    ResponseEntity<CustomerDTO> getCustomerById(@PathVariable("customerId") Long customerId);
//
//    /**
//     * Get all customers from Customer Service
//     */
//    @GetMapping("/api/v1/customers")
//    ResponseEntity<List<CustomerDTO>> getAllCustomers();
//
//    /**
//     * Get customer by email from Customer Service
//     */
//    @GetMapping("/api/v1/customers/email/{email}")
//    ResponseEntity<CustomerDTO> getCustomerByEmail(@PathVariable("email") String email);
//
//    /**
//     * Update customer communication flag
//     * Called when account is created for a customer
//     */
//    @PutMapping("/api/v1/customers/{customerId}/communication")
//    ResponseEntity<Void> updateCustomerCommunication(@PathVariable("customerId") Long customerId);
//}
//
