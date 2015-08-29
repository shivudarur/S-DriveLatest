package com.sigmataxi.sdrive;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;

import com.sigmataxi.sdrive.Adapters.BillingPaymentModeGridAdapter;
import com.sigmataxi.sdrive.model.MenuIcon;

public class BillingCashPaymentFragment extends Fragment {

	ArrayList<MenuIcon> menuIconArray;

	Button comments_img, alert_img;

	public BillingCashPaymentFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_cash_payment_mode,
				container, false);

		init(rootView);
		return rootView;
	}

	private void init(View rootView) {
		// TODO Auto-generated method stub

		setMenuListData();
		setGridAdapter(rootView);

		// setBadge(alert_img);
	}

	private void setMenuListData() {
		menuIconArray = new ArrayList<MenuIcon>();

		// menuIconArray.add(new MenuIcon(R.string.cash_pay,
		// R.drawable.cashpay));
		menuIconArray.add(new MenuIcon(R.string.card_swiping,
				R.drawable.cardswiping));
		menuIconArray.add(new MenuIcon(R.string.wallet, R.drawable.wallet));
		menuIconArray.add(new MenuIcon(R.string.travel_card,
				R.drawable.travelcard));

	}

	private void setGridAdapter(View rootView) {

		GridView gridView = (GridView) rootView
				.findViewById(R.id.gridViewCustom);

		// Create the Custom Adapter Object
		BillingPaymentModeGridAdapter grisViewCustomeAdapter = new BillingPaymentModeGridAdapter(
				getActivity(), menuIconArray, "selectemode");
		// Set the Adapter to GridView
		gridView.setAdapter(grisViewCustomeAdapter);

		// Handling touch/click Event on GridView Item
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long arg3) {

				openNextBookingFragment();

			}
		});
	}

	private void openNextBookingFragment() {

		getActivity().getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, new NextBookingFragment()).commit();
		;
	}
}
