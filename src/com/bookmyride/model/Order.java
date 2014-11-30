package com.bookmyride.model;

import org.joda.time.DateTime;

public class Order {
	private User user;
	private UserAddress pickUpAddress,dropAddress;
	private CarType requiredCarType;
	private Car car;
	private DateTime pickUptime;
	
	
	public Order(User user, UserAddress pickUpAddress, UserAddress dropAddress,
			CarType requiredCarType, DateTime pickUptime) {
		this.user = user;
		this.pickUpAddress = pickUpAddress;
		this.dropAddress = dropAddress;
		this.requiredCarType = requiredCarType;
		this.pickUptime = pickUptime;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserAddress getPickUpAddress() {
		return pickUpAddress;
	}
	public void setPickUpAddress(UserAddress pickUpAddress) {
		this.pickUpAddress = pickUpAddress;
	}
	public UserAddress getDropAddress() {
		return dropAddress;
	}
	public void setDropAddress(UserAddress dropAddress) {
		this.dropAddress = dropAddress;
	}
	public CarType getRequiredCarType() {
		return requiredCarType;
	}
	public void setRequiredCarType(CarType requiredCarType) {
		this.requiredCarType = requiredCarType;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public DateTime getPickUptime() {
		return pickUptime;
	}
	public void setPickUptime(DateTime pickUptime) {
		this.pickUptime = pickUptime;
	}
	
	
}
