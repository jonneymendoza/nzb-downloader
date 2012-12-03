/**
 * Copyright Monitise
 */
package com.josh.nzb.downloader.utils.logtracking;

/**
 * @author RichardsJ
 *
 */
public interface AppErrorCodes {

	public static final Error NETWORK_CONNECTION_ISSUE = new Error("unknown network error has occured", 1000);

	public static final Error UNKNOWN_ERROR = new Error("unkwon error has occured", 1001);
}
