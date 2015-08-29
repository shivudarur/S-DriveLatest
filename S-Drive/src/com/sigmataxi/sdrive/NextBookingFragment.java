package com.sigmataxi.sdrive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

public class NextBookingFragment extends Fragment {

	public NextBookingFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_next_booking,
				container, false);
		init(rootView);
		return rootView;
	}

	private void init(View rootView) {
		rootView.findViewById(R.id.btn_logout).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						openLogoutFragment();

					}
				});
	}

	private void openLogoutFragment() {

		getActivity().getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, new LogoutFragment()).commit();
		;
	}

}