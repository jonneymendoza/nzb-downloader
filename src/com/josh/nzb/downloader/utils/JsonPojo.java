package com.josh.nzb.downloader.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.json.JSONException;
import org.json.JSONObject;

import com.josh.nzb.downloader.utils.json.parser.JsonParser;
import com.josh.nzb.downloader.utils.logtracking.AppLog;

/**
 * @author RichardsJ
 */
public abstract class JsonPojo {

	private static final String GET_CHAR_SEQUENCE = "get";

	private static final String SET_CHAR_SEQUENCE = "set";

	/**
	 * Here we will do some magic. We will use our Annotations and check each method if its tagged appropriatly and will
	 * build the Pojo object based on the json string we have
	 */

	private JsonPojo toObject(JSONObject json) {

		Method methods[] = this.getClass().getDeclaredMethods();

		try {
			// find seter methods
			for (int i = 0; i < methods.length; i++) {
				String key = methods[i].getName();
				System.out.println(key);
				if (methods[i].isAnnotationPresent(JsonElement.class) && key.startsWith(SET_CHAR_SEQUENCE)) {
					JsonElement jsonElem = methods[i].getAnnotation(JsonElement.class);
					if (jsonElem.type().equals(JsonType.SETTER)) {
						key = key.replaceFirst(SET_CHAR_SEQUENCE, "");
						methods[i].invoke(this.getClass(), json.getString(""));

					}

				}

			}

		} catch (JSONException e) {

			AppLog.print("SabHistoryJsonParser exception" + e.toString());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			AppLog.print("JsonPojo exception" + e);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			AppLog.print("JsonPojo exception" + e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			AppLog.print("JsonPojo exception" + e);
		}

		return null;
	}

	/**
	 * convert a regular pojo class into a json object
	 */
	private JSONObject createJsonObject() {
		Method methods[] = this.getClass().getDeclaredMethods();
		JSONObject jsonObject = new JSONObject();
		try {
			for (int i = 0; i < methods.length; i++) {
				String key = methods[i].getName();
				System.out.println(key);
				if (methods[i].isAnnotationPresent(JsonElement.class) && key.startsWith(GET_CHAR_SEQUENCE)) {
					JsonElement jsonElem = methods[i].getAnnotation(JsonElement.class);
					if (jsonElem.type().equals(JsonType.GETTER)) {
						key = key.replaceFirst(GET_CHAR_SEQUENCE, "");
						jsonObject.put(key, methods[i].invoke(this.getClass()));
					}

				}

			}
			return jsonObject;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public JSONObject getJsonObject() {
		return createJsonObject();
	}

	public JsonPojo getInstanceFromJson(JSONObject json) {
		JsonPojo pojo = toObject(json);
		return pojo;
	}

}
