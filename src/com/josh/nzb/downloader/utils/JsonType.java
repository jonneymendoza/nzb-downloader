
package com.josh.nzb.downloader.utils;

/**
 * @author RichardsJ
 *
 */
public enum JsonType {
	GETTER, SETTER, OTHER, JSON_KEY;

	public Class<?> cls;

	private JsonType() {
		this.cls = String.class;
	}
}

