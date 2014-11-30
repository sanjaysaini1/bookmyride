package com.bookmyride.model;

import android.location.Address;

public class Car {

	private String carNumber;
	private CarType carType;
	private String driverName;
	private Address lastDroppedAddress;
	
	public Car(String carNumber, CarType carType, String driverName) {
		this.carNumber = carNumber;
		this.carType = carType;
		this.driverName = driverName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Address getLastDroppedAddress() {
		return lastDroppedAddress;
	}

	public void setLastDroppedAddress(Address lastDroppedAddress) {
		this.lastDroppedAddress = lastDroppedAddress;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public CarType getCarType() {
		return carType;
	}
	
	
}
