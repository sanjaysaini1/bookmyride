package com.bookmyride.model;

import java.util.Locale;

public class UserPrimaryAddress extends UserAddress {

	public UserPrimaryAddress(Locale locale) {
		super(locale);
	}

	@Override
	public boolean isPrimaryAddress() {
		return true;
	}

	
}
