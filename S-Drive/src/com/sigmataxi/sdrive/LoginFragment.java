package com.sigmataxi.sdrive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginFragment extends Fragment {

	public LoginFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_login, container,
				false);

		init(rootView);

		return rootView;
	}

	private void init(View rootView) {
		rootView.findViewById(R.id.btn_loginButton).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						((LoginActivity) getActivity()).loginBtnClickManager();

					}
				});
	}

}