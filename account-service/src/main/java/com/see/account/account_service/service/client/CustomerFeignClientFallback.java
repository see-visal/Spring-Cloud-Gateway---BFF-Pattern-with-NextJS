package com.see.account.account_service.service.client;//package com.see_visal.Account.Service.service.client;
//
//import com.see_visal.Account.Service.dto.CustomerDTO;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Fallback implementation for CustomerFeignClient
// *
// * This provides fallback responses when Customer Service is unavailable
// */
//@Component
//@Slf4j
//public class CustomerFeignClientFallback implements CustomerFeignClient {
//
//    @Override
//    public ResponseEntity<CustomerDTO> getCustomerById(Long customerId) {
//        log.warn("Customer Service is unavailable. Returning fallback response for customer ID: {}", customerId);
//        CustomerDTO fallbackCustomer = new CustomerDTO();
//        fallbackCustomer.setCustomerId(customerId);
//        fallbackCustomer.setName("Customer Service Unavailable");
//        fallbackCustomer.setEmail("unavailable@service.com");
//        return ResponseEntity.ok(fallbackCustomer);
//    }
//
//    @Override
//    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
//        log.warn("Customer Service is unavailable. Returning empty list.");
//        return ResponseEntity.ok(new ArrayList<>());
//    }
//
//    @Override
//    public ResponseEntity<CustomerDTO> getCustomerByEmail(String email) {
//        log.warn("Customer Service is unavailable. Returning fallback response for email: {}", email);
//        CustomerDTO fallbackCustomer = new CustomerDTO();
//        fallbackCustomer.setEmail(email);
//        fallbackCustomer.setName("Customer Service Unavailable");
//        return ResponseEntity.ok(fallbackCustomer);
//    }
//
//    @Override
//    public ResponseEntity<Void> updateCustomerCommunication(Long customerId) {
//        log.warn("Customer Service is unavailable. Cannot update communication flag for customer ID: {}", customerId);
//        // Return 503 Service Unavailable instead of null to indicate the service is down
//        return ResponseEntity.status(503).build();
//    }
//}
//
