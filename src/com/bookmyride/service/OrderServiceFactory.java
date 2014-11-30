package com.bookmyride.service;

public class OrderServiceFactory {

	private static final OrderService service=new OrderServiceImpl();
	public static OrderService getService(){
		return service;
	}
}
