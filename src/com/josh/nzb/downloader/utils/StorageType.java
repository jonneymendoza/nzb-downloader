/**
 * Copyright Monitise
 */
package com.josh.nzb.downloader.utils;

/**
 * Storage types used for storing objects in sharedpref
 *
 * @author RichardsJ
 */
public enum StorageType {

	HISTORY, WELCOME_SCREEN(Boolean.class), COMPLETED_SAB_TEST_SETUP(Boolean.class), COMPLETELED_NZBMATRIX_SETUP(
			Boolean.class), SAB_API_KEY, SAB_USERNAME, SAB_PASSWORD, SAB_IP_ADDRESS, NZBMATRIX_API_KEY, NZBMATRIX_USERNAME, NZBMATRIX_PASSWORD, NZBMATRIX_IP_ADDRESS, NZBMATRIX_PORT, SAB_PORT;

	public Class<?> cls;

	private StorageType(Class<?> cls) {
		this.cls = cls;
	}

	private StorageType() {
		this.cls = String.class;
	}

	public String getKey() {
		return "KEY_" + toString().toUpperCase();
	}

}
