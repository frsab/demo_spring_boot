package com.example.models;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//MongoRepository est une sorte de PagingAndSortingRepository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findBySquare(String lastName);
    
}