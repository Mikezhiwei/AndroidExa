package com.example.firstandroid;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;

public class TabTestActivity extends TabActivity {
	           
	   protected void onCreate(Bundle savedInstanceState) { 
	        super.onCreate(savedInstanceState); 
	        TabHost tabHost = getTabHost(); 
	        LayoutInflater.from(this).inflate(R.layout.tab_demo2, tabHost.getTabContentView(), true);
	        Intent intent=new Intent();
	        intent.setClass(this, ImageViewActivity.class);
	        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("tab1").setContent(intent));
	        intent=new Intent().setClass(this, ListDemo1Activity.class);
	        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Tab2").setContent(intent));
	        intent=new Intent().setClass(this,SimleGirdDemoActivity.class);
	        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("tab3").setContent(intent));
	        tabHost.setCurrentTab(0);
	    } 
} 

