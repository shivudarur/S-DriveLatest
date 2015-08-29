package com.sigmataxi.sdrive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class GenerateBillFragment extends Fragment {

	public GenerateBillFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_generate_bill,
				container, false);
		init(rootView);
		return rootView;
	}

	private void init(View rootView) {
//		rootView.findViewById(R.id.btn_continue).setOnClickListener(
//				new OnClickListener() {
//
//					@Override
//					public void onClick(View v) {
//						openMainMenuFragment();
//
//					}
//				});
	}

	private void openMainMenuFragment() {

		getActivity().getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, new MainMenuFragment()).commit();
	}

}