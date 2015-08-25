package com.sigmataxi.sdrive;

import android.os.Bundle;

public class NextBookingActivity extends BaseActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new NextBookingFragment()).commit();
		}
	}

}
