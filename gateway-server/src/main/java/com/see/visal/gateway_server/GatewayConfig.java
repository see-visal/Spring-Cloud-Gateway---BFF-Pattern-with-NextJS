package com.see.visal.gateway_server; // Make sure this package matches yours

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()

                // 1. Customer Service
                // PUBLIC: http://localhost:8087/api/v1/customers
                // INTERNAL: http://localhost:8081/api/v1/customer
                .route("customer-service", r -> r.path("/api/v1/customers/**")
                        // FIX: Removed the mandatory slash before the group. Added '/?' inside.
                        .filters(f -> f.rewritePath("/api/v1/customers(?<segment>/?.*)", "/api/v1/customer${segment}")
                                .addResponseHeader("X-Powered-By", "Gateway-Service"))
                        .uri("http://localhost:8081"))

                // 2. Account Service
                // PUBLIC: http://localhost:8087/api/v1/accounts
                // INTERNAL: http://localhost:8082/api/v1/account
                .route("account-service", r -> r.path("/api/v1/accounts/**")
                        .filters(f -> f.rewritePath("/api/v1/accounts(?<segment>/?.*)", "/api/v1/account${segment}"))
                        .uri("http://localhost:8082"))

                // 3. Order Service
                // PUBLIC: http://localhost:8070/api/v1/orders
                // INTERNAL: http://localhost:8083/api/v1/order
                .route("order-service", r -> r.path("/api/v1/orders/**")
                        .filters(f -> f.rewritePath("/api/v1/orders(?<segment>/?.*)", "/api/v1/order${segment}"))
                        .uri("http://localhost:8083"))

                .build();
    }
}