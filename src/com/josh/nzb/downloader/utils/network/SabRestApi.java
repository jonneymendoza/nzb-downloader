package com.josh.nzb.downloader.utils.network;

import java.util.List;

import org.apache.http.HttpResponse;

import com.josh.nzb.downloader.objects.Sab.SabHistory;
import com.josh.nzb.downloader.objects.Sab.SabQue;
import com.josh.nzb.downloader.utils.logtracking.Error;

/**
 * @author RichardsJ Deals with all REST calls to sabnzb API http://wiki.sabnzbd.org/api
 */
public class SabRestApi extends NetworkRequest {


	public SabRestApi() {

	}

	public String geAuthType() {

		return null;
	}

	public List<SabQue> getQue() {
		return null;
	}


	public List<SabHistory> getHistory() {
		return null;
	}

	public String getSabVersion() {
		return null;
	}

	public List<String> getWarningLogs() {
		return null;
	}

	public List<String> getSabCatagories() {
		return null;
	}

	public void restartSabServer() {

	}

	public void addNzb(String src) {

	}
}
