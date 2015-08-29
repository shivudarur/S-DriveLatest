package com.sigmataxi.sdrive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ProgressBillFragment extends Fragment {

	public ProgressBillFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_process_bill,
				container, false);
		init(rootView);
		return rootView;
	}

	private void init(View rootView) {
		ImageView imageView = (ImageView) rootView
				.findViewById(R.id.iv_loading);
		Animation rotation = AnimationUtils.loadAnimation(getActivity(),
				R.anim.rotate);
		rotation.setFillAfter(true);
		imageView.startAnimation(rotation);
		// rootView.findViewById(R.id.btn_continue).setOnClickListener(
		// new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// openMainMenuFragment();
		//
		// }
		// });
	}

	private void openMainMenuFragment() {

		getActivity().getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, new MainMenuFragment()).commit();
	}

}