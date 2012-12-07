package com.josh.nzb.downloader.objects.Sab;

import java.util.List;

import com.josh.nzb.downloader.utils.JsonElement;
import com.josh.nzb.downloader.utils.JsonPojo;
import com.josh.nzb.downloader.utils.JsonType;

/**
 * @author RichardsJ Sab History object
 */
public class SabHistory extends JsonPojo {

	private String totalSize;

	private String monthSize;

	private String weekSize;

	private String cacheLimit;

	private boolean paused;

	private String newRelUrl;

	private boolean restartReq;

	private List<SabHistorySlot> slots;

	@JsonElement(type = JsonType.JSON_KEY)
	public static final String totalSizeKeyKey = "total_size";

	@JsonElement(type = JsonType.JSON_KEY)
	public static final String monthSizeKey = "month_size";

	@JsonElement(type = JsonType.JSON_KEY)
	public static final String weekSizeKey = "week_size";

	@JsonElement(type = JsonType.JSON_KEY)
	public static final String cacheLimitKey = "cache_limit";

	@JsonElement(type = JsonType.JSON_KEY)
	public static final String pausedKey = "paused";

	@JsonElement(type = JsonType.JSON_KEY)
	public static final String newRelUrlKey = "new_rel_url";

	@JsonElement(type = JsonType.JSON_KEY)
	public static final String restartReqKey = "restart_req";

	@JsonElement(type = JsonType.JSON_KEY)
	public static final String slotsKey = "slots";

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
