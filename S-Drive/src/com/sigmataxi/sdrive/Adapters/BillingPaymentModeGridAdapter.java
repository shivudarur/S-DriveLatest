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

public class BillingPaymentModeGridAdapter extends ArrayAdapter {
	Context context;
	ArrayList<MenuIcon> menuIconArray;

	String gridMode;

	public BillingPaymentModeGridAdapter(Context context,
			ArrayList<MenuIcon> menuIconArray, String gridMode) {
		super(context, 0);
		this.context = context;
		this.menuIconArray = menuIconArray;

		this.gridMode = gridMode;

	}

	public int getCount() {
		return menuIconArray.size();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;

		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();

			if (gridMode.equalsIgnoreCase("selectemode"))
				row = inflater
						.inflate(R.layout.payment_mode_selected_grid_item,
								parent, false);
			else
				row = inflater.inflate(R.layout.payment_mode_menu_grid_item,
						parent, false);

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
