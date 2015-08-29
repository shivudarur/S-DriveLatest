package com.sigmataxi.sdrive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.sigmataxi.sdrive.views.BadgeView;

public class HomeFragment extends Fragment {

	public HomeFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_home, container,
				false);
		init(rootView);
		return rootView;
	}

	private void init(View rootView) {
		View target = rootView.findViewById(R.id.comments_badge);
		BadgeView badge = new BadgeView(getActivity(), target);
		badge.setText("1");
		badge.show();
		target = rootView.findViewById(R.id.alert_badge);
		badge = new BadgeView(getActivity(), target);
		badge.setText("1");
		badge.show();
		rootView.findViewById(R.id.btn_continue).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						openMainMenuFragment();

					}
				});
	}

	private void openMainMenuFragment() {

		getActivity().getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, new MainMenuFragment()).commit();
		;
	}

}