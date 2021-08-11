package com.example.restservice;

import javax.servlet.http.HttpServletResponse;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadyController {

    private static final String serviceState = "OK";

    @GetMapping("/ready")
    @ResponseBody
    public String ready(HttpServletResponse response) {
        response.setContentType(TEXT_PLAIN_VALUE);
        return new Ready(this.serviceState).getState();
    }
}
