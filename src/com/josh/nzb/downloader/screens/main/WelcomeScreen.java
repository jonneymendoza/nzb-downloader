package com.josh.nzb.downloader.screens.main;

import com.josh.nzb.downloader.R;
import com.josh.nzb.downloader.screens.sabnzbd.SabSettings;
import com.josh.nzb.downloader.utils.Storage;
import com.josh.nzb.downloader.utils.StorageType;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author RichardsJ
 */
public class WelcomeScreen extends Activity {

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome_screen);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
	}

	public void onSetupClicked(View v) {
		// set shared pref value for welcome screen as true.
		Storage.open(getApplicationContext()).saveBoolean(StorageType.WELCOME_SCREEN, true);
		// display main setup screen
		startActivity(new Intent(this, SabSettings.class));
	}

}
