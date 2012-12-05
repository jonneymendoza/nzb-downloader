package com.josh.nzb.downloader.utils;

import java.util.EnumMap;


import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * Storage class use to save data into the sahred preference
 *
 * @author RichardsJ
 */
public class Storage {

	private static Storage storage;

	private EnumMap<StorageType, Object> map;

	private SharedPreferences pref;

	private Editor editor;

	public static Storage open(Context context) {
		if (storage == null) {
			storage = new Storage(context);
		}
		return storage;
	}

	private Storage(Context context) {
		pref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
		editor = pref.edit();

		map = new EnumMap<StorageType, Object>(StorageType.class);
		for (StorageType s : StorageType.values()) {
			map.put(s, pref.getString(s.getKey(), null));
		}

	}

	/**
	 * Get String value of storage type
	 *
	 * @param s
	 * @return
	 */
	public String getString(StorageType s) {
		if (map.get(s) != null) {
			return map.get(s).toString();
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T getCasted(StorageType s) {
		Object object = map.get(s);
		if (object == null)
			return null;
		if (s.cls.isAssignableFrom(object.getClass())) {
			return (T)object;
		} else {
			return (T)object.toString();
		}
	}

	/**
	 * remove a particular storage type
	 *
	 * @param s
	 */
	public void clearStorageType(StorageType s) {
		map.remove(s.getKey());
		editor.remove(s.getKey());
	}

	/**
	 * Save to local storage.
	 * 
	 * @param s the storage type
	 * @param value the value
	 */
	public void save(StorageType s, String value) {
		editor = pref.edit();
		editor.putString(s.getKey(), value);
		editor.commit();
		map.put(s, value);
	}

	/**
	 * Save boolean to local storage.
	 * 
	 * @param s the storage type
	 * @param value the value
	 */
	public void saveBoolean(StorageType s, boolean value) {
		if (s.cls.isAssignableFrom(Boolean.class)) {
			editor = pref.edit();
			editor.putBoolean(s.getKey(), value);
			editor.commit();
			map.put(s, value);
		}

	}

}
