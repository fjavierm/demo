package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class Hello {

    @GetMapping
    public String sayHello() {
        return "Hello from Spring Boot + Jenkins * Docker Hub + Anchore";
    }
}
