package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemoApplication {
	@RequestMapping("/api2/")
    String api2() {
    	  return "{"
    	  		+ "'api':'RESTful',"
    	  		+ "'rules':['r1','r2']}";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
