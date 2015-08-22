package com.sigmataxi.sdrive;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;

public abstract  class BaseActivity extends ActionBarActivity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
    }
	
	
	 @Override

	 public boolean onKeyDown(int keyCode, KeyEvent event) {

	 boolean result;
	switch( event.getKeyCode() ) {

	      case KeyEvent.KEYCODE_MENU:
	          result = true;
	         break;

	     case KeyEvent.KEYCODE_VOLUME_UP:
	          result = true;
	         break;
	     case KeyEvent.KEYCODE_VOLUME_DOWN:
	         result = true;
	         break;
	     case KeyEvent.KEYCODE_BACK:
	         result = true;
	         break;
	      default:
	         result= super.dispatchKeyEvent(event);
	         break;
	  }

	  return result;
	 }
}
