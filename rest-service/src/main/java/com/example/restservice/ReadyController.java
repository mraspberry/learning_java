package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadyController {

    private static final String serviceState = "OK";

    @GetMapping("/ready")
    public Ready ready() {
        return new Ready(this.serviceState);
    }
}
