package com.bookmyride.service;

public class LoginServiceFactory {
	private static final LoginService service=new LoginServiceImpl();
	public static LoginService getService(){
		return service;
	}
}
