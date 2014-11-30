package com.bookmyride.view.activity;

import java.util.ArrayList;
import java.util.List;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;

import com.bookmyride.view.listeners.ActivityVisiblityListener;


public class BaseActivity extends ActionBarActivity {

	private boolean visible = false;
	
	private List<ActivityVisiblityListener> visibilityListeners = new ArrayList<ActivityVisiblityListener>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onResume() {
		super.onResume();
		visible = true;
		for(ActivityVisiblityListener listener : visibilityListeners)
			listener.onShow(this);
	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		return super.onKeyDown(keyCode, event);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	protected void onStart() {
		super.onStart();
		
	}

	@Override
	protected void onStop() {
		super.onStop();
		
	}

	@Override
	public void onPause() {
		super.onPause();
		visible = false;
		for(ActivityVisiblityListener listener : visibilityListeners)
			listener.onHide(this);
	}

	public boolean isVisible() {
		return visible;
	}
	
	public void addActivityVisiblityListener(ActivityVisiblityListener listener) {
		visibilityListeners.add(listener);
	}
	
	public void removeActivityVisiblityListener(ActivityVisiblityListener listener) {
		visibilityListeners.remove(listener);
	}

	// ======================= INTENT MANAGER =======================

	/**
	 * Go to activity
	 * 
	 * @param context
	 *            current context
	 * @param cla
	 *            Name of activity. Ex: SencondActivity.class
	 */
	public void gotoActivity(Context context, Class<?> cla) {
		Intent intent = new Intent(context, cla);
		startActivity(intent);
		overridePendingTransition(android.R.anim.slide_in_left, R.anim.slide_out_right);
	}

	/**
	 * Go to activity with bundle
	 * 
	 * @param context
	 * @param cla
	 * @param bundle
	 */
	public void gotoActivity(Context context, Class<?> cla, Bundle bundle) {
		Intent intent = new Intent(context, cla);
		intent.putExtras(bundle);
		startActivity(intent);
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	}

	/**
	 * Goto activity with bundle
	 * 
	 * @param context
	 * @param cla
	 * @param bundle
	 * @param requestCode
	 */
	public void gotoActivityForResult(Context context, Class<?> cla,
			Bundle bundle, int requestCode) {
		Intent intent = new Intent(context, cla);
		intent.putExtras(bundle);
		startActivityForResult(intent, requestCode);
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	}

	public void setResultIntent() {
		setResult(RESULT_OK);
		finish();
	}

	@Override
	public void finish() {
		super.finish();
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	}

}
