package com.sigmataxi.sdrive.recievers;

import com.sigmataxi.sdrive.SplashScreenActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class BootReciever extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent myIntent = new Intent(context, SplashScreenActivity.class);
		myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(myIntent);
	}

}