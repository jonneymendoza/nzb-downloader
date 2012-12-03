package com.josh.nzb.downloader.screens.sabnzbd;

import com.josh.nzb.downloader.R;
import com.josh.nzb.downloader.utils.logtracking.AppLog;

import android.app.ActionBar;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

/**
 * @author RichardsJ
 */
public class SabSettings extends Activity {

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sab_settings_screen);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
	}

	/**
	 * On click listener for save button
	 *
	 * @param v
	 */
	public void onSaveClicked(View v) {

		AppLog.print("Hello, logs working");
	}

	/**
	 * on click listener for test button
	 *
	 * @param v
	 */
	public void onTestClicked(View v) {

		// exectue test task

		new TestSabSettings().execute();
	}

	/**
	 * save sab settings in shared preference
	 */
	private void saveSabSettings() {

	}

	private class TestSabSettings extends AsyncTask<Void, Void, Void> {

		@Override
		protected void onPreExecute() {

			super.onPreExecute();

			// get values from input edit text
		}

		@Override
		protected void onPostExecute(Void result) {

			super.onPostExecute(result);
		}

		@Override
		protected Void doInBackground(Void... params) {

			return null;
		}



		// make api call to get sab version

	}

}
