
package com.josh.nzb.downloader.screens.main;

import com.josh.nzb.downloader.R;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

/**
 * @author RichardsJ
 *
 */
public class MainScreenActivity extends Activity {


	private ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_content);

		actionBar = getActionBar();

		// TODO: change this to dispplay what view we are in
		actionBar.setTitle("NZB App");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.layout.main_screen_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
}
