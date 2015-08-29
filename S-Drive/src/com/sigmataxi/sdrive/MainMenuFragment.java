package com.sigmataxi.sdrive;

import java.util.ArrayList;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;

import com.sigmataxi.sdrive.Adapters.MainMenuGridAdapter;
import com.sigmataxi.sdrive.model.MenuIcon;
import com.sigmataxi.sdrive.views.BadgeView;

public class MainMenuFragment extends Fragment {

	ArrayList<MenuIcon> menuIconArray;

	Button comments_img, alert_img;

	public MainMenuFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);

		init(rootView);
		return rootView;
	}

	private void init(View rootView) {
		// TODO Auto-generated method stub

		setMenuListData();
		setGridAdapter(rootView);

		comments_img = (Button) rootView.findViewById(R.id.comments_img);

		alert_img = (Button) rootView.findViewById(R.id.alert_img);
		setBadge(comments_img);
		// setBadge(alert_img);
	}

	private void setMenuListData() {
		menuIconArray = new ArrayList<MenuIcon>();

		menuIconArray.add(new MenuIcon(R.string.my_trips, R.drawable.mytrip));
		menuIconArray.add(new MenuIcon(R.string.my_account,
				R.drawable.myaccount));
		menuIconArray.add(new MenuIcon(R.string.my_vehicle,
				R.drawable.myvehicle));
		menuIconArray.add(new MenuIcon(R.string.feedback, R.drawable.feedback));
		menuIconArray.add(new MenuIcon(R.string.view_offers,
				R.drawable.view_offer));
		menuIconArray.add(new MenuIcon(R.string.payments, R.drawable.payment));
		menuIconArray.add(new MenuIcon(R.string.driver_guide,
				R.drawable.driver_guide));
		menuIconArray.add(new MenuIcon(R.string.guarage_support,
				R.drawable.garage_support));
		menuIconArray.add(new MenuIcon(R.string.request, R.drawable.request));

	}

	private void setBadge(View target) {
		BadgeView badge4 = new BadgeView(getActivity(), target);
		badge4.setText("123");
		badge4.setBadgePosition(BadgeView.POSITION_TOP_LEFT);
		badge4.setBadgeMargin(15, 10);
		badge4.setBadgeBackgroundColor(Color.parseColor("#A4C639"));
	}

	private void setGridAdapter(View rootView) {

		GridView gridView = (GridView) rootView
				.findViewById(R.id.gridViewCustom);

		// Create the Custom Adapter Object
		MainMenuGridAdapter grisViewCustomeAdapter = new MainMenuGridAdapter(
				getActivity(), menuIconArray);
		// Set the Adapter to GridView
		gridView.setAdapter(grisViewCustomeAdapter);

		// Handling touch/click Event on GridView Item
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long arg3) {

				openBillingDetailsPaymentModeMenuFragment();

			}
		});
	}

	private void openBillingDetailsPaymentModeMenuFragment() {

		getActivity()
				.getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.container,
						new BillingDetailsPaymentModeMenuFragment()).commit();
	}
}
