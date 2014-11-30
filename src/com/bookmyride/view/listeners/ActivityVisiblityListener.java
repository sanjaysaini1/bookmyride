package com.bookmyride.view.listeners;


import android.app.Activity;

public interface ActivityVisiblityListener {
	/**
	 * Called when the activity is fully visible
	 * 
	 * @param a
	 */
	public void onShow(Activity a);
	
	/**
	 * Called when the activity becomes invisible
	 * 
	 * @param a
	 */
	public void onHide(Activity a);
}
