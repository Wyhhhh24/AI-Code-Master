package com.air.aicodemaster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WyH524
 * @since 2025/11/11 18:54
 */
@RestController
@RequestMapping("/health")
public class HelloController {

    @GetMapping("/")
    public String healthCheck() {
        return "ok";
    }
}
