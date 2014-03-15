package com.example.drawui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RightFragment extends Fragment {
	
	 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	 {
		    View rightview=inflater.inflate(R.layout.rigth_real, null);
		    return(rightview);
	 }
	 public void onActivityCreated(Bundle savedInstanceState)
	 {
		 super.onActivityCreated(savedInstanceState);
	 }
}
