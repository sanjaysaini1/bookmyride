package com.bookmyride.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.bookmyride.R;

public class OrderLocationFragment extends Fragment {

	View rootView;
	EditText pickUpAddressText,dropInAddressText;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_order_location, container, false);
		initUI();
		return rootView;
	}

	private void initUI() {
	
		pickUpAddressText=(EditText)rootView.findViewById(R.id.orderPickUpAddress);
		dropInAddressText=(EditText)rootView.findViewById(R.id.orderDropInAddress);
		
		
	}

	public EditText getPickUpAddressText() {
		return pickUpAddressText;
	}

	public void setPickUpAddressText(EditText pickUpAddressText) {
		this.pickUpAddressText = pickUpAddressText;
	}

	public EditText getDropInAddressText() {
		return dropInAddressText;
	}

	public void setDropInAddressText(EditText dropInAddressText) {
		this.dropInAddressText = dropInAddressText;
	}

	
}
