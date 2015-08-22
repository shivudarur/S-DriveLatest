package com.sigmataxi.sdrive.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sigmataxi.sdrive.R;

public class MainMenuGridAdapter extends ArrayAdapter {
	Context context;

	public MainMenuGridAdapter(Context context) {
		super(context, 0);
		this.context = context;

	}

	public int getCount() {
		return 24;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;

		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(R.layout.main_menu_grid_item, parent, false);

			TextView textViewTitle = (TextView) row.findViewById(R.id.textView);
			ImageView imageViewIte = (ImageView) row
					.findViewById(R.id.imageView);

			if (position % 2 == 0) {
				textViewTitle.setText("Facebook");
				imageViewIte.setImageResource(R.drawable.myaccount);
			} else {
				textViewTitle.setText("Twitter");
				imageViewIte.setImageResource(R.drawable.myaccount);
			}
		}

		return row;

	}

}
