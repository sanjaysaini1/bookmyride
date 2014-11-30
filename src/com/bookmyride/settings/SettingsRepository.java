package com.bookmyride.settings;

import java.util.Map;

public interface SettingsRepository {
	public interface Editor {

		public Editor putString(String key, String value);

		public Editor putLong(String key, long value);

		public Editor remove(String key);

		public Editor clear();

		public boolean commit();

		public void apply();
	}

	public boolean contains(String key);

	public Editor edit();

	public Map<String, ?> getAll();

	public long getLong(String key, long defValue);

	public String getString(String key, String defValue);
}
