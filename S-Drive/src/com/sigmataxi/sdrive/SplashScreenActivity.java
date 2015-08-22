package com.sigmataxi.sdrive;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

@SuppressLint("Wakelock")
public class SplashScreenActivity extends BaseActivity {

	// Splash screen timer
	private static int SPLASH_TIME_OUT = 3000;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/*
		 * PowerManager pm = (PowerManager)
		 * getSystemService(Context.POWER_SERVICE); WakeLock wakeLock =
		 * pm.newWakeLock(PowerManager.FULL_WAKE_LOCK |
		 * PowerManager.ACQUIRE_CAUSES_WAKEUP | PowerManager.ON_AFTER_RELEASE,
		 * "MyWakeLock"); wakeLock.acquire();
		 */
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);

		getWindow().addFlags(LayoutParams.FLAG_SHOW_WHEN_LOCKED);
		getWindow().addFlags(LayoutParams.FLAG_TURN_SCREEN_ON);

		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {  

			@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity
				Intent i = new Intent(SplashScreenActivity.this,
						LoginActivity.class);
				startActivity(i);
				finish();
			}
		}, SPLASH_TIME_OUT);
	}

}