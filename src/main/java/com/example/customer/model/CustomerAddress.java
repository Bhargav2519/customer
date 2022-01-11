package com.example.customer.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_address")
public class CustomerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="address_id")
	private Long id;
	
	@Column(name ="line1")
	private String line1;

	@Column(name ="line2")
	private String line2;
	
	@Column(name ="city")
	private String cityName;
	
	@Column(name ="state")
	private String stateName;
	
	@Column(name ="pincode")
	private int pincode;
	
	
	public CustomerAddress() {
	}
	
	
	public CustomerAddress(Long id, String line1, String line2, String cityName, String stateName, int pincode) {
		this.id = id;
		this.line1 = line1;
		this.line2 = line2;
		this.cityName = cityName;
		this.stateName = stateName;
		this.pincode = pincode;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
