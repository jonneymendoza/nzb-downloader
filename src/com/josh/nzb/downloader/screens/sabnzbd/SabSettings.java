package com.josh.nzb.downloader.screens.sabnzbd;

import com.josh.nzb.downloader.R;
import com.josh.nzb.downloader.screens.nzbmatrix.NzbMatrixSettings;
import com.josh.nzb.downloader.utils.Storage;
import com.josh.nzb.downloader.utils.StorageType;
import com.josh.nzb.downloader.utils.logtracking.AppLog;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * @author RichardsJ
 */
public class SabSettings extends Activity {

	private EditText mApiKeyField;

	private EditText mUsernameField;

	private EditText mPasswordField;

	private EditText mIpAddressField;

	private EditText mPortField;

	private Storage storage;

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
		storage = Storage.open(getApplicationContext());
		initialiseViews();
	}

	/**
	 * initialise the views
	 */
	private void initialiseViews() {
		mApiKeyField = (EditText)findViewById(R.id.sab_api_key_text);
		mUsernameField = (EditText)findViewById(R.id.sab_username_text);
		mPasswordField = (EditText)findViewById(R.id.sab_password_text);
		mIpAddressField = (EditText)findViewById(R.id.sab_ip_address_text);
		mPortField = (EditText)findViewById(R.id.sab_api_key_text);

		// load previous saved data
		mApiKeyField.setText(storage.getString(StorageType.SAB_API_KEY));
		mUsernameField.setText(storage.getString(StorageType.SAB_USERNAME));
		mPasswordField.setText(storage.getString(StorageType.SAB_PASSWORD));
		mIpAddressField.setText(storage.getString(StorageType.SAB_IP_ADDRESS));
		mPortField.setText(storage.getString(StorageType.SAB_PORT));

	}

	/**
	 * On click listener for save button
	 *
	 * @param v
	 */
	public void onSaveClicked(View v) {

		AppLog.print("Hello, logs working");

		saveSabSettings();

		// Launch nzbd settings
		startActivity(new Intent(this, NzbMatrixSettings.class));
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

		storage.save(StorageType.SAB_API_KEY, mApiKeyField.getText().toString());
		storage.save(StorageType.SAB_USERNAME, mUsernameField.getText().toString());

		storage.save(StorageType.SAB_PASSWORD, mPasswordField.getText().toString());

		storage.save(StorageType.SAB_IP_ADDRESS, mIpAddressField.getText().toString());

		storage.save(StorageType.SAB_PORT, mPortField.getText().toString());

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
