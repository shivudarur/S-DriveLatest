package com.sigmataxi.sdrive.Adapters;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sigmataxi.sdrive.R;
import com.sigmataxi.sdrive.model.MenuIcon;

public class MainMenuGridAdapter extends ArrayAdapter {
	Context context;
	ArrayList<MenuIcon> menuIconArray;

	public MainMenuGridAdapter(Context context,
			ArrayList<MenuIcon> menuIconArray) {
		super(context, 0);
		this.context = context;
		this.menuIconArray = menuIconArray;

	}

	public int getCount() {
		return menuIconArray.size();
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

			textViewTitle.setText(menuIconArray.get(position).getIconName());
			imageViewIte.setImageResource(menuIconArray.get(position)
					.getIconResource());

		}

		return row;

	}

}
