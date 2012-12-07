
package com.josh.nzb.downloader.utils.json.parser;

import org.json.JSONObject;

/**
 * @author RichardsJ
 *
 */
public interface JsonParser<T> {

	/**
	 * Convert a json object into the java POJO object
	 *
	 * @return
	 */
	public T toObject(JSONObject json);


	/**
	 * construct a json object from a java pojo class
	 *
	 * @param classObject
	 * @return
	 */
	public JSONObject createJsonObject(T classObject);

}
