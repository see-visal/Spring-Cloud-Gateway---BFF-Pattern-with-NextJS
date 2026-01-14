//package com.see.visal.gateway_server;
//
//import io.micrometer.tracing.Tracer;
//import lombok.RequiredArgsConstructor;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.server.reactive.ServerHttpResponse;
//import reactor.core.publisher.Mono;
//
//@Configuration
//@RequiredArgsConstructor
//public class TraceIdFilter {
//
//    private final Tracer tracer;
//
//    @Bean
//    public GlobalFilter postGlobalFilter() {
//        return (exchange, chain) -> chain.filter(exchange).then(Mono.fromRunnable(() -> {
//            // 1. Get the current Trace ID
//            String traceId = tracer.currentSpan() != null ? tracer.currentSpan().context().traceId() : "N/A";
//
//            // 2. Add it to the Response Headers
//            ServerHttpResponse response = exchange.getResponse();
//            response.getHeaders().add("X-Trace-Id", traceId);
//        }));
//    }
//}