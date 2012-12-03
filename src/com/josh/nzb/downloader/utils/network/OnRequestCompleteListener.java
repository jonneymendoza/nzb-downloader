
package com.josh.nzb.downloader.utils.network;

import org.apache.http.HttpResponse;

import com.josh.nzb.downloader.utils.logtracking.Error;

/**
 * @author RichardsJ
 *
 */
public interface OnRequestCompleteListener {

	void onRequestCompleted(HttpResponse httpResponse, Error error);
}
