package com.see.visal.gateway_server;

import io.micrometer.tracing.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.http.server.reactive.ServerHttpResponse;
import reactor.core.publisher.Mono;

@EnableDiscoveryClient

@SpringBootApplication
public class GatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}

	// --- ADD THIS BEAN HERE ---
	@Bean
	public GlobalFilter traceIdFilter(@Autowired(required = false) Tracer tracer) {
		return (exchange, chain) -> chain.filter(exchange).then(Mono.fromRunnable(() -> {
			// 1. Get Trace ID safely (Prevent crash if Tracer is missing)
			String traceId = "N/A";
			if (tracer != null && tracer.currentSpan() != null) {
				traceId = tracer.currentSpan().context().traceId();
			}

			// 2. Add to Response Header
			ServerHttpResponse response = exchange.getResponse();
			response.getHeaders().add("X-Trace-Id", traceId);
		}));
	}
}
