package com.sigmataxi.sdrive;

import com.sigmataxi.sdrive.Adapters.MainMenuGridAdapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class MainMenuFragment extends Fragment {

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
		setGridAdapter(rootView);
	}

	private void setGridAdapter(View rootView) {

		GridView	gridView = (GridView) rootView.findViewById(R.id.gridViewCustom);
		// Create the Custom Adapter Object
		MainMenuGridAdapter	grisViewCustomeAdapter = new MainMenuGridAdapter(getActivity());
		// Set the Adapter to GridView
		gridView.setAdapter(grisViewCustomeAdapter);

		// Handling touch/click Event on GridView Item
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long arg3) {
				String selectedItem;
				if (position % 2 == 0)
					selectedItem = "Facebook";
				else
					selectedItem = "Twitter";
				Toast.makeText(getActivity(),
						"Selected Item: " + selectedItem, Toast.LENGTH_SHORT)
						.show();

			}
		});
	}
}
