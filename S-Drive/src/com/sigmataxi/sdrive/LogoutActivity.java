package com.sigmataxi.sdrive;

import android.os.Bundle;

public class LogoutActivity extends BaseActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logout);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new LogoutFragment()).commit();
		}
	}
}
