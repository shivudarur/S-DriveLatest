package com.sigmataxi.sdrive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

	public HomeFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_login, container,
				false);
		rootView.findViewById(R.id.btn_loginButton).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						// ((HomeActivity) getActivity())
						// .loginBtnClickManagerForPopup();
					}
				});
		return rootView;
	}

}