package com.bookmyride.service;

public class UserServiceFactory {
	private static final UserService service=new UserServiceImpl();
	public static UserService getService(){
		return service;
	}
}
