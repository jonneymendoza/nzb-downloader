
package com.josh.nzb.downloader.utils.logtracking;

/**
 * @author RichardsJ Error object
 */
public class Error {

	private String message;
	private int errorCode;

	/**
	 * @param message
	 * @param errorCode
	 */
	public Error(String message, int errorCode) {
		super();
		this.message = message;
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
