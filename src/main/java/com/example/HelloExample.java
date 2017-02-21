package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloExample {

    @RequestMapping("/hello/")
    String home() {
        return "Hello Spring Boot!";
    }    
    @RequestMapping("/api/")
    String api() {
    	  return "{'friends': ['Michael', 'Tom', 'Daniel', 'John', 'Nick']}";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloExample.class, args);
    }
}