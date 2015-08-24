package com.sigmataxi.sdrive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new LoginFragment()).commit();
		}
	}

	protected void loginBtnClickManager() {
		// TBD
		Intent i = new Intent(LoginActivity.this, MainActivity.class);
		startActivity(i);
		finish();
	}

	protected void loginBtnClickManagerForPopup() {
		LinearLayout linLayout = new LinearLayout(this);
		// specifying vertical orientation
		linLayout.setOrientation(LinearLayout.VERTICAL);
		// creating LayoutParams
		LayoutParams linLayoutParam = new LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		TextView tv = new TextView(this);
		tv.setText("This is content");
		tv.setLayoutParams(linLayoutParam);
		linLayout.addView(tv);

		LinearLayout footerLayout = new LinearLayout(this);
		// specifying vertical orientation
		footerLayout.setOrientation(LinearLayout.VERTICAL);
		Button footerButton = new Button(this);
		footerLayout.setGravity(Gravity.CENTER);
		footerButton.setText(getString(R.string.ok));
		footerButton.setLayoutParams(linLayoutParam);
		footerLayout.addView(footerButton);
		footerButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Clicked",
						Toast.LENGTH_LONG).show();
			}
		});
		FragmentManager fm = getSupportFragmentManager();
		MessageDialogFragment messageDialogFragment = new MessageDialogFragment(
				getString(R.string.booking_alloted),
				getString(R.string.str_continue), linLayout, footerLayout);
		messageDialogFragment.show(fm, "fragment_edit_name");
	}
}
