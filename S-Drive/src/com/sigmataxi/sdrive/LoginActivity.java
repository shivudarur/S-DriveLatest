package com.sigmataxi.sdrive;

import java.io.IOException;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class LoginActivity extends BaseActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new LoginFragment()).commit();
		}
	}

	public static class LoginFragment extends Fragment {

		public LoginFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_login,
					container, false);
			rootView.findViewById(R.id.btn_loginButton).setOnClickListener(
					new OnClickListener() {

						@Override
						public void onClick(View v) {
							((LoginActivity) getActivity())
									.loginBtnClickManager();
						}
					});
			return rootView;
		}
		
	
	}
	

	protected void loginBtnClickManager() {
		// TBD
		Intent i = new Intent(LoginActivity.this,
				MainActivity.class);
		startActivity(i);
		finish();
	}
}
