package com.example.customer.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.customer.model.Customer;
import com.example.customer.model.CustomerAddress;
import com.example.customer.repository.CustomerRepository;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {
	
	@Mock
	private CustomerRepository customerRepository;
	
	@InjectMocks
	private CustomerService customerService;

	@Test
	void createCustomerSuccessTest() {
		
		CustomerAddress address = new CustomerAddress( null ,"line1","line2","city","state",12345);
				Customer customer = new Customer( null,"qwerty","zxcv","@",address);
		
				Mockito.when(customerRepository.save(customer)).thenReturn(customer);
				
				Customer returnedCustomer=customerService.createCustomer(customer);
				Assertions.assertNotNull(returnedCustomer);
				//Assertions.assertEquals("qwerty",returnedCustomer.getFirst_Name());
	}


	@Test
	
	void getByIdTest() {

		CustomerAddress address = new CustomerAddress( 11l,"line1","line2","city","state",12345);
				Customer customer = new Customer(11l,"qwerty","zxcv","@",address);
				
				Mockito.when(customerRepository.findById(11l)).thenReturn(Optional.of(customer));
			  Optional<Customer> gettingCustomers = customerService.getById(11l);
			  
			  Assertions.assertNotNull("line1", gettingCustomers.get().getCustomerAddress().getLine1());
	}
	@Test
	void testAllmethods() {
		CustomerAddress address1 = new CustomerAddress( 11l,"line1","line2","city","state",12345);
		Customer customer1 = new Customer(11l,"qwerty","zxcv","@",address1);
		CustomerAddress address2 = new CustomerAddress( 12l,"line2","line2","city2","stat2e",12345);
		Customer customer2 = new Customer(12l,"qwerty","zxcv","@",address2);
		
		Mockito.when(customerRepository.findAll()).thenReturn(Arrays.asList(customer1,customer2));
		
       // List<Customer> customers = customerRepository.findAll();
		List<Customer> allcustomer =customerService.getCustomer();
		Assertions.assertEquals(2,allcustomer.size());
	}
}