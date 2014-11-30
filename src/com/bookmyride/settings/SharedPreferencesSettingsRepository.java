package com.bookmyride.settings;

import java.util.Map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.bookmyride.controller.AppController;

public class SharedPreferencesSettingsRepository implements SettingsRepository {

	private final SharedPreferences preferences;
	
	public SharedPreferencesSettingsRepository(String preferencesFileName) {
		preferences = AppController.getContext().getSharedPreferences(preferencesFileName,
																		Context.MODE_PRIVATE);
	}

	@Override
	public boolean contains(String key) {
		return preferences.contains(key);
	}	

	
	@SuppressLint("CommitPrefEdits") 
	@Override
	public Editor edit() {
		return new SharedPreferencesSettingsEditor(preferences.edit());
	}

	@Override
	public Map<String, ?> getAll() {
		return preferences.getAll();
	}

	@Override
	public long getLong(String key, long defValue) {
		return preferences.getLong(key, defValue);
	}

	@Override
	public String getString(String key, String defValue) {
		return preferences.getString(key, defValue);
	}

	private final class SharedPreferencesSettingsEditor implements Editor {
		private android.content.SharedPreferences.Editor editor;

		public SharedPreferencesSettingsEditor(android.content.SharedPreferences.Editor editor) {
			this.editor = editor;
		}

		@Override
		public Editor putString(String key, String value) {
			editor.putString(key, value);
			return this;
		}

		@Override
		public Editor putLong(String key, long value) {
			editor.putLong(key, value);
			return this;
		}

		@Override
		public Editor remove(String key) {
			editor.remove(key);
			return this;
		}

		@Override
		public Editor clear() {
			editor.clear();
			return this;
		}

		@Override
		public boolean commit() {
			return editor.commit();
		}

		@SuppressLint("NewApi")
		@Override
		public void apply() {
			editor.apply();
		}

	}
}
