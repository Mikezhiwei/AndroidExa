package com.example.firstandroid;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;;

public class TabTest2Activity extends TabActivity {
	
	
	   protected void onCreate(Bundle savedInstanceState)
	   {
		    super.onCreate(savedInstanceState);
		    Resources re=this.getResources();
		    TabHost tabHost=this.getTabHost();
		    LayoutInflater.from(this).inflate(R.layout.tab_demo2, tabHost.getTabContentView(), true);
		    Intent intent=new Intent().setClass(this,ImageViewActivity.class);
		    tabHost.addTab(tabHost.newTabSpec("food").setIndicator("food1", re.getDrawable(R.drawable.tea)).setContent(intent));
		    intent=new Intent().setClass(this,ListDemo1Activity.class);
		    tabHost.addTab(tabHost.newTabSpec("food2").setIndicator("food2",re.getDrawable(R.drawable.spinach)).setContent(intent));
	        intent=new Intent().setClass(this,SimleGirdDemoActivity.class);
		   // tabHost.addTab(tabHost.newTabSpec("food3").setIndicator("food3"),re.getDrawable(R.drawable.tomato));
	        tabHost.addTab(tabHost.newTabSpec("food3").setIndicator("food3", re.getDrawable(R.drawable.tomato)).setContent(intent));
	   } 
	           
}
