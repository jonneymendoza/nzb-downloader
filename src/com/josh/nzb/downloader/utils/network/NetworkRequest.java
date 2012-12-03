package com.josh.nzb.downloader.utils.network;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpClientConnection;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;

import com.josh.nzb.downloader.utils.logtracking.AppErrorCodes;
import com.josh.nzb.downloader.utils.logtracking.AppLog;
import com.josh.nzb.downloader.utils.logtracking.Error;

import android.util.Log;

/**
 * @author RichardsJ
 */
public abstract class NetworkRequest {

	private static final String UTF_8 = "utf-8";

	private HttpClient httpClient;

	private String url;



	private HttpResponse response;

	public static enum HTTP_METHOD {
		GET, PUT, POST
	};

	/**
	 * Make Network call
	 *
	 * @param nameValuePair any name value pair to pass to the HTTP rest call
	 * @param method
	 * @param url
	 */
	void makeRequest(List<NameValuePair> nameValuePair, HTTP_METHOD method, String url,
			OnRequestCompleteListener onRequestComplete) {

		try {
			httpClient = new DefaultHttpClient();

			HttpRequestBase requestMethod = createHttpMethod(nameValuePair, method, url);

			response = httpClient.execute(requestMethod);

			onRequestComplete.onRequestCompleted(response, null);

		} catch (UnsupportedEncodingException e) {

			AppLog.print("NetworkRequest exception" + e.toString());
			onRequestComplete.onRequestCompleted(null, AppErrorCodes.UNKNOWN_ERROR);

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			AppLog.print("NetworkRequest exception" + e.toString());
			onRequestComplete.onRequestCompleted(null, AppErrorCodes.NETWORK_CONNECTION_ISSUE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			AppLog.print("NetworkRequest exception" + e.toString());
			onRequestComplete.onRequestCompleted(null, AppErrorCodes.NETWORK_CONNECTION_ISSUE);
		}

		// make the request

		// done
	}

	/**
	 * @param method
	 * @param url2
	 * @return
	 */
	private HttpRequestBase createHttpMethod(List<NameValuePair> nameValuePair, HTTP_METHOD method, String url)
			throws UnsupportedEncodingException {

		switch (method) {
		case GET:
			HttpGet httpGet;
			httpGet = new HttpGet(url + URLEncodedUtils.format(nameValuePair, UTF_8));
			if (nameValuePair != null) {

			}
			return httpGet;
		case PUT:
			HttpPut httpPut = new HttpPut(url);
			if (nameValuePair != null) {
				httpPut.setEntity(new UrlEncodedFormEntity(nameValuePair));
			}
			return httpPut;
		case POST:
			HttpPost httpPost = new HttpPost(url);
			if (nameValuePair != null) {
				httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));
			}

			return httpPost;
		default:
			return null;
		}

	}

}
