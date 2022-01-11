package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	

	public Customer createCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	public List<Customer> getCustomer() {
		
		return customerRepository.findAll();
	}

	public Optional<Customer> getById(Long id) {
		
		return customerRepository.findById(id);
	}

}
