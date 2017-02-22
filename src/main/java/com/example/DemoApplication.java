package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Customer;
import com.example.models.CustomerRepository;
@RestController
@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private CustomerRepository repository;
	
	@RequestMapping("/api2/")
    String api2() {
    	  return "{"
    	  		+ "'api':'RESTful',"
    	  		+ "'rules':['r1','r2']}";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(" je suis dans la methode run "
				+ "(DemoApplication implements CommandLineRunner)");
		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
		
	}
}
