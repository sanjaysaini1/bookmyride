package com.bookmyride.service;

import com.bookmyride.controller.AppController;
import com.bookmyride.model.User;
import com.bookmyride.settings.SettingsRepository.Editor;

public class LoginServiceImpl implements LoginService{

	private static final UserService userService=UserServiceFactory.getService();
	private static final String PREF_USER_ID="pref.user.id";
	@Override
	public Boolean login(String id, String password) {
		User user=userService.getUserById(id);
		if(user!=null){
			if(user.getPassword().equals(password)){
				Editor editor= AppController.getSettingsRepository().edit();
				editor.putString(PREF_USER_ID, user.getEmail());
				return true;
			}
		}
		return false;
	}

}
