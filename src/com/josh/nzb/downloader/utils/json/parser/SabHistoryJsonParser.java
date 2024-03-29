
/**
 * @author RichardsJ
 *
 */
package com.josh.nzb.downloader.utils.json.parser;

import org.json.JSONException;
import org.json.JSONObject;

import com.josh.nzb.downloader.objects.Sab.SabHistory;
import com.josh.nzb.downloader.utils.logtracking.AppLog;

/**
 * Util class that parses a Sab History object.
 *
 * Example of a Json History :
 *
 *
 * {
    "total_size": 40.30 GB,       **Since 0.5.2
    "month_size": 20.23 GB,      **Since 0.5.2
    "week_size": 5.12 GB,         **Since 0.5.2
    "cache_limit":"-1",
    "paused":true,
    "new_rel_url":"",
    "restart_req":false,
    "slots":[
    {
        "action_line":"",
        "show_details":"True",
        "script_log":"",
        "meta":null,
        "fail_message":"",
        "loaded":false,
        "id":605,
        "size":"778.1 MB",
        "category":"Apps",
        "pp":"D",
        "completeness":0,
        "script":"",
        "nzb_name":"Ubuntu.nzb",
        "download_time":567,
        "storage":"X:\\Apps\\Ubuntu",
        "status":"Completed",
        "script_line":"",
        "completed":1236646078,
        "nzo_id":"SABnzbd_nzo_ipet0h",
        "downloaded":815878352,
        "report":"000000",
        "path":"Ubuntu",
        "postproc_time":368,
        "name":"Ubuntu",
        "url":"https://nzbmatrix.com/blabla/",
        "bytes":815878352,
        "url_info":"http://google.com",
        "stage_log":[
            {"name":"download","actions":["Downloaded in 9 minutes 27 seconds at an average of 1404kB/s"]},
            {"name":"repair","actions":["[ubuntu] Repaired in 4 minutes 24 seconds","[ubuntu.sample] Quick Check OK"]},
            {"name":"unpack","actions":["[ubuntu] Unpacked 1 file/folder in 36 seconds"]}
        ]
    }],
    "helpuri":"http://wiki.sabnzbd.org/",
    "uptime":"12m",
    "version":"trunk",
    "diskspacetotal2":"503.32",
    "color_scheme":"",
    "darwin":false,
    "nt":true,
    "status":"Paused",
    "last_warning":"",
    "have_warnings":"0",
    "cache_art":"0",
    "finishaction":null,
    "noofslots":516,
    "cache_size":"0",
    "new_release":"",
    "pause_int":"0",
    "mbleft":"785.89",
    "diskspace2":"25.08",
    "diskspace1":"25.08",
    "diskspacetotal1":"503.32",
    "timeleft":"0:00:00",
    "mb":"785.89",
    "eta":"unknown",
    "nzb_quota":"",
    "loadavg":"",
    "kbpersec":"0.00",
    "speedlimit":"0",
    "webdir":"path\\to\\templates"
}

 *
 */
public class SabHistoryJsonParser implements JsonParser<SabHistory> {

	@Override
	public SabHistory toObject(JSONObject json) {
		SabHistory history = new SabHistory();
		// parse json to a History Object

		try {
			history.setTotalSize(json.getString(SabHistory.totalSizeKeyKey));
			history.setTotalSize(json.getString(SabHistory.totalSizeKeyKey));
			history.setTotalSize(json.getString(SabHistory.totalSizeKeyKey));
			history.setTotalSize(json.getString(SabHistory.totalSizeKeyKey));
			history.setTotalSize(json.getString(SabHistory.totalSizeKeyKey));
			history.setTotalSize(json.getString(SabHistory.totalSizeKeyKey));
			history.setTotalSize(json.getString(SabHistory.totalSizeKeyKey));
		} catch (JSONException e) {

			AppLog.print("SabHistoryJsonParser exception" + e.toString());
		}

		return history;
	}

	/*
	 * (non-Javadoc)
	 * @see com.josh.nzb.downloader.utils.json.parser.JsonParser#createJsonObject(java.lang.Object)
	 */
	@Override
	public JSONObject createJsonObject(SabHistory classObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
