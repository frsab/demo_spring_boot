package com.example;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloExample {

    @RequestMapping("/hello")
    String home() {
        return "Hello Spring Boot!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloExample.class, args);
    }

}