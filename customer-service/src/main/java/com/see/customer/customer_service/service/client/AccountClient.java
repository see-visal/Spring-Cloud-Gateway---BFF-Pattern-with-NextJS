package com.see.customer.customer_service.service.client;//package com.see_visal.Customer.Service.service.client;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.math.BigDecimal;
//
//@FeignClient(name = "account-service", url = "http://localhost:8082/api/v1/accounts")
//public interface AccountClient {
//    @PutMapping("/debit")
//    void debit(@RequestParam("customerId") Long customerId, @RequestParam("amount") BigDecimal amount);
//}