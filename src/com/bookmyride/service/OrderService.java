package com.bookmyride.service;

import org.joda.time.DateTime;

import com.bookmyride.model.CarType;
import com.bookmyride.model.User;
import com.bookmyride.model.UserAddress;

public interface OrderService {

	boolean createOrder(User user,UserAddress pickUpAddress, UserAddress dropAddress,
			CarType requiredCarType, DateTime pickUptime);
}
