package com.sigmataxi.sdrive;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class MessageDialogFragment extends DialogFragment {
	String header;
	String message = "something...";
	ViewGroup mFooterView;
	ViewGroup mContentView;
	private Builder builder;

	public MessageDialogFragment(String header, String message,
			ViewGroup mContentView, ViewGroup mFooterView) {
		super();
		this.header = header;
		this.message = message;
		this.mFooterView = mFooterView;
		this.mContentView = mContentView;
		// builder = new AlertDialog.Builder(getActivity()).setTitle(header);
	}

	@SuppressLint("NewApi")
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		Activity mActivity = getActivity();
		builder = new AlertDialog.Builder(mActivity);
		View view = getActivity().getLayoutInflater().inflate(
				R.layout.fragment_message_dialog, null);
		builder.setView(view);
		TextView mHeaderView = (TextView) view.findViewById(R.id.tv_header);
		mHeaderView.setText(header);
		if (message != null && !message.isEmpty()) {
			ViewGroup mContentContainer = (ViewGroup) view
					.findViewById(R.id.ll_content);
			mContentContainer.addView(mContentView);
		}
		ViewGroup mFooterContainer = (ViewGroup) view
				.findViewById(R.id.ll_footer);
		mFooterContainer.addView(mFooterView);

		View mCloseButton = view.findViewById(R.id.ib_close);
		mCloseButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				dismiss();
			}
		});
		return builder.create();
	}
}