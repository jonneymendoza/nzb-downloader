package com.josh.nzb.downloader.objects.Sab;

import java.util.List;

/**
 * This is the history item slot used to display a list of history items from the Sab server.
 *
 * @author RichardsJ
 */
public class SabHistorySlot {

	private String actionLine;

	private String showDetails;

	private String scriptLog;

	private String meta;

	private String failMessage;

	private boolean loaded;

	private String id;

	private String size;

	private String pp;

	private String completeness;

	private String script;

	private String nzbName;

	private long downloadTime;

	private String storage;

	private String status;

	private String scriptLine;

	private long completed;

	private String nzoId;

	private String downloaded;

	private String path;

	private long postprocTime;

	private String name;

	private String url;

	private long bytes;

	private List<StageLog> stageLogs;

	public String getActionLine() {
		return actionLine;
	}

	public void setActionLine(String actionLine) {
		this.actionLine = actionLine;
	}

	public String getShowDetails() {
		return showDetails;
	}

	public void setShowDetails(String showDetails) {
		this.showDetails = showDetails;
	}

	public String getScriptLog() {
		return scriptLog;
	}

	public void setScriptLog(String scriptLog) {
		this.scriptLog = scriptLog;
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getFailMessage() {
		return failMessage;
	}

	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}

	public boolean isLoaded() {
		return loaded;
	}

	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPp() {
		return pp;
	}

	public void setPp(String pp) {
		this.pp = pp;
	}

	public String getCompleteness() {
		return completeness;
	}

	public void setCompleteness(String completeness) {
		this.completeness = completeness;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public String getNzbName() {
		return nzbName;
	}

	public void setNzbName(String nzbName) {
		this.nzbName = nzbName;
	}

	public long getDownloadTime() {
		return downloadTime;
	}

	public void setDownloadTime(long downloadTime) {
		this.downloadTime = downloadTime;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getScriptLine() {
		return scriptLine;
	}

	public void setScriptLine(String scriptLine) {
		this.scriptLine = scriptLine;
	}

	public long getCompleted() {
		return completed;
	}

	public void setCompleted(long completed) {
		this.completed = completed;
	}

	public String getNzoId() {
		return nzoId;
	}

	public void setNzoId(String nzoId) {
		this.nzoId = nzoId;
	}

	public String getDownloaded() {
		return downloaded;
	}

	public void setDownloaded(String downloaded) {
		this.downloaded = downloaded;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public long getPostprocTime() {
		return postprocTime;
	}

	public void setPostprocTime(long postprocTime) {
		this.postprocTime = postprocTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getBytes() {
		return bytes;
	}

	public void setBytes(long bytes) {
		this.bytes = bytes;
	}

	public List<StageLog> getStageLogs() {
		return stageLogs;
	}

	public void setStageLogs(List<StageLog> stageLogs) {
		this.stageLogs = stageLogs;
	}

}
