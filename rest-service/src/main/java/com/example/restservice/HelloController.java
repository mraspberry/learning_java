package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/api/v1/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Hello(counter.incrementAndGet(), String.format(template, name));
    }
}
