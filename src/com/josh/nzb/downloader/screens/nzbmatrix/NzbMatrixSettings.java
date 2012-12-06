package com.josh.nzb.downloader.screens.nzbmatrix;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.josh.nzb.downloader.R;
import com.josh.nzb.downloader.screens.main.MainScreenActivity;

/**
 * @author RichardsJ
 *
 */
public class NzbMatrixSettings extends Activity {

	private EditText mApiKeyField;

	private EditText mUsernameField;

	private EditText mPasswordField;

	// private EditText mIpAddressField;

	// private EditText mPortField;

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nzb_settings_screen);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		initialiseViews();
	}

	/**
	 * initialize views
	 */
	private void initialiseViews() {

	}

	public void onSaveClicked(View view) {
		startActivity(new Intent(this, MainScreenActivity.class));
	}

}
