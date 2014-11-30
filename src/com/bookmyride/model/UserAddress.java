package com.bookmyride.model;

import java.util.Locale;

import android.location.Address;

public class UserAddress extends Address {

	public UserAddress(Locale locale) {
		super(locale);
		
	}
	public boolean isPrimaryAddress(){
		return false;
	}
}
