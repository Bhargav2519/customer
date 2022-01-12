package com.example.customer.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.exceptionhandlings.CustomerNotFound;
import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/customersall")
	public List<Customer> getCustomers(){
		return customerService.getCustomer();
	}
	
	@GetMapping("/customers/{id}")
	
	public Customer getById(@PathVariable Long id){
	

		Optional<Customer> customer = customerService.getById(id);
		
		if((customer.isPresent())) {
			throw new CustomerNotFound("tharun "+id+" not found");
		}
		return customer.get();
	} 
}
