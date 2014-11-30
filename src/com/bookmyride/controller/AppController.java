package com.bookmyride.controller;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.bookmyride.settings.SettingsRepository;
import com.bookmyride.settings.SharedPreferencesSettingsRepository;

public class AppController extends Application {
	static final String TAG = AppController.class.getName();
	private static final String PREFERENCES_FILE_NAME = "bookmyride.pref";
	static Context sContext;
	private static SettingsRepository settingsRepository;
	@Override
	public void onCreate() {
		super.onCreate();
		sContext = getApplicationContext();
		settingsRepository = new SharedPreferencesSettingsRepository(PREFERENCES_FILE_NAME);
		
	}
	
	public static Context getContext() {
		return sContext;
	}



	public static void reportException(String tag, Throwable e) {
		// Log error
		Log.e(tag, e.getMessage(), e);

		
	}

	public static SettingsRepository getSettingsRepository() {
		return settingsRepository;
	}
}
