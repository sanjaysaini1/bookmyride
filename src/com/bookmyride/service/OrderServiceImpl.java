package com.bookmyride.service;

import org.joda.time.DateTime;

import com.bookmyride.model.CarType;
import com.bookmyride.model.User;
import com.bookmyride.model.UserAddress;

public class OrderServiceImpl implements OrderService {

	@Override
	public boolean createOrder(User user, UserAddress pickUpAddress,
			UserAddress dropAddress, CarType requiredCarType,
			DateTime pickUptime) {
		// TODO Auto-generated method stub
		//create order
		//add order to orderlist
		return false;
	}

}
