package com.example.healthapp;

import android.os.Bundle;
import android.widget.Button;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

	private Button aboutbtn;
	private Button listbtn;
    private Intent listintent;
    private Intent aboutintent;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    this.setContentView(R.layout.index);
	    this.intial();
	}
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	private void intial()
	{
		    this.aboutbtn=(Button)this.findViewById(R.id.about);
		    this.listbtn=(Button)this.findViewById(R.id.listbutton);
		    aboutbtn.setOnClickListener(about_listener);
		    listbtn.setOnClickListener(listbtn_listener);
	}
	private OnClickListener about_listener =new OnClickListener(){
		      public void onClick(View v){
		    	   if(aboutintent==null){
		    		   aboutintent=new Intent();
		    	   }
		    	   aboutintent.setClass(MainActivity.this,AboutActivity.class);
		    	   aboutbtn.setBackgroundColor(R.color.btn_active);
		    	   startActivity(aboutintent);
		     }
		
	};
	private OnClickListener listbtn_listener=new OnClickListener(){
	          public void onClick(View v)
	          {
	        	   if(listintent==null)
	        	   {
	        		   listintent=new Intent();
	        	   }
	        	   listintent.setClass(MainActivity.this,ListViewActivity.class);
	        	   listbtn.setBackgroundColor(R.color.btn_active);
	        	   startActivity(listintent);
	          }
	};


}
