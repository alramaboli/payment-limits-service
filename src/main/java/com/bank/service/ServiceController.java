package com.bank.service;

import java.time.Instant;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceController {

    @GetMapping("/status")
    public Map<String, Object> status() {
        return Map.of(
            "service", "payment-limits-service",
            "status", "UP",
            "timestamp", Instant.now()
        );
    }
}