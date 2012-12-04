package com.josh.nzb.downloader.screens;

import com.josh.nzb.downloader.screens.main.WelcomeScreen;
import com.josh.nzb.downloader.screens.settings.SabNzbdSetupActivity;
import com.josh.nzb.downloader.utils.Storage;
import com.josh.nzb.downloader.utils.StorageType;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * @author RichardsJ
 */
public class LauncherActivity extends Activity {

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		if (!(Boolean)Storage.open(getApplicationContext()).getCasted(StorageType.WELCOME_SCREEN)) {
			launchWelcomeScreen();
		} else if (!(Boolean)Storage.open(getApplicationContext()).getCasted(StorageType.COMPLETED_SAB_TEST_SETUP)) {
			launchSabSetup();
		} else if (!(Boolean)Storage.open(getApplicationContext()).getCasted(StorageType.COMPLETELED_NZBMATRIX_SETUP)) {
			launchNzbSetup();
		} else {
			// launch main content
			launchMainContentScreen();
		}

		finish();
	}

	private void launchWelcomeScreen() {
		startActivity(new Intent(this, WelcomeScreen.class));
	}

	private void launchSabSetup() {
		startActivity(new Intent(this, SabNzbdSetupActivity.class));
	}

	private void launchNzbSetup() {
		// startActivity(new Intent(this, SabNzbdSetupActivity.class));
	}

	private void launchMainContentScreen() {
		// startActivity(new Intent(this, SabNzbdSetupActivity.class));
	}

}
