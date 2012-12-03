package com.josh.nzb.downloader.objects.Sab;

import java.util.List;

/**
 * @author RichardsJ Sab History object
 */
public class SabHistory {

	private String totalSize;

	private String monthSize;

	private String weekSize;

	private String cacheLimit;

	private boolean paused;

	private String newRelUrl;

	private boolean restartReq;

	private List<SabHistorySlot> slots;

	public String getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}

	public String getMonthSize() {
		return monthSize;
	}

	public void setMonthSize(String monthSize) {
		this.monthSize = monthSize;
	}

	public String getWeekSize() {
		return weekSize;
	}

	public void setWeekSize(String weekSize) {
		this.weekSize = weekSize;
	}

	public String getCacheLimit() {
		return cacheLimit;
	}

	public void setCacheLimit(String cacheLimit) {
		this.cacheLimit = cacheLimit;
	}

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public String getNewRelUrl() {
		return newRelUrl;
	}

	public void setNewRelUrl(String newRelUrl) {
		this.newRelUrl = newRelUrl;
	}

	public boolean isRestartReq() {
		return restartReq;
	}

	public void setRestartReq(boolean restartReq) {
		this.restartReq = restartReq;
	}

	public List<SabHistorySlot> getSlots() {
		return slots;
	}

	public void setSlots(List<SabHistorySlot> slots) {
		this.slots = slots;
	}

}
