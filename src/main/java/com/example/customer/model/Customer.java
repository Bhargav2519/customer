package com.example.customer.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name ="id")
	private Long id;
	
	@Column(name ="firstName")
	private String first_Name;
	
	@Column(name ="lastName")
	private String last_Name;
	
	@Column(name ="email")
	private String email_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="address_id")
	private CustomerAddress customerAddress;
	
	
	public Customer() {
	}
	
	
	public Customer(Long id, String first_Name, String last_Name, String email_id, CustomerAddress customerAddress) {
	
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email_id = email_id;
		this.customerAddress = customerAddress;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}
	
}
