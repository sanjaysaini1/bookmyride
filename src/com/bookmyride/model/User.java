package com.bookmyride.model;

import java.util.List;


public class User {

	private String email;
	private String password;
	private List<UserAddress> addresses;
	private String contactNumber;
	private List<Car> carUsed;
	private List<Order> previousOrders;
	
	public User(String email, String password, List<UserAddress> addresses) {
		this.email = email;
		this.password = password;
		this.addresses = addresses;		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<UserAddress> addresses) {
		this.addresses = addresses;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<Car> getCarUsed() {
		return carUsed;
	}

	public void setCarUsed(List<Car> carUsed) {
		this.carUsed = carUsed;
	}

	public List<Order> getPreviousOrders() {
		return previousOrders;
	}

	public void setPreviousOrders(List<Order> previousOrders) {
		this.previousOrders = previousOrders;
	}
	
	
	
}
