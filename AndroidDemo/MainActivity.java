package com.example.firstandroid;

import android.os.Bundle;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
      
	  private static final String A_ID="love your own life";
	  private static final int RESULT_CODE=RESULT_OK;
      private Button sbutton;
      private Button s2button;
      private Button s3button;
    
	protected void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);
		 this.setContentView(R.layout.line2);
		 this.intial();
	}
	@Override
	
	protected void onDestroy()
	{
		    super.onDestroy();
		    Log.i(this.A_ID, "On destory has been called");
	}
	protected void onPause()
	{
		   super.onPause();
		   Log.i(this.A_ID, "On pause has benn called");
	}
	protected void onResume()
	{
		  super.onResume();
		  Log.i(this.A_ID, "On resunme has been called");
	}
	protected void onStart()
	{
		 super.onStart();
		 Log.i(this.A_ID, "On start has been called");
	}
	protected void onStop()
	{
		super.onStop();
		Log.i(this.A_ID, "On stop has benn called");
	}
	public void onSaveInstanceState(Bundle State)
	{
		    super.onSaveInstanceState(State);
		    State.putString("name", "null");
	}
	private void intial()
	{
		this.sbutton=(Button)this.findViewById(R.id.ac1button);
		this.sbutton.setOnClickListener(blistener);
		this.s2button=(Button)this.findViewById(R.id.ac2button);
		this.s2button.setOnClickListener(aclistener);
		this.s3button=(Button)this.findViewById(R.id.ac3button);
		this.s3button.setOnClickListener(aclistener2);
	}
	private OnClickListener blistener=new OnClickListener(){
		    public void onClick(View v)
		    {
		    	  Intent intent=new Intent();
		    	  intent.setClass(MainActivity.this,TabTest2Activity.class);
		    	  intent.putExtra("activityMain", "À´×ÔMainActivity");
		    	  startActivityForResult(intent,RESULT_CODE);
		    }
	};
	private OnClickListener aclistener=new OnClickListener(){
		    public void onClick(View v)
		    {    
		    	   Intent intent2=new Intent();
		    	   intent2.setClass(MainActivity.this,ListDemo1Activity.class);
		    	   startActivity(intent2);
		     }
	};
	private OnClickListener aclistener2=new OnClickListener(){
		   public void onClick(View v)
		   {
			        Intent intent3=new Intent();
			        intent3.setClass(MainActivity.this, SpinnerButtonActivity.class);
			        startActivity(intent3);
		   }
	};
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
	        if(requestCode==this.RESULT_CODE)
	        {
	        	    if(resultCode==this.RESULT_CANCELED)
	        	    {
	        	    	this.setTitle("cancel");
	        	    }else if(resultCode==this.RESULT_CODE)
	        	    {
	        	        String temp=null;
	        	        Bundle extra=data.getExtras();
	        	         if(extra!=null){
	        	        	 temp=extra.getString("store");
	        	         }
	        	         this.setTitle(temp);
	        	    }
	        }
	}
    
}
