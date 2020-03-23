package com.example.demo.customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByFirstName(String firstname);
    
}