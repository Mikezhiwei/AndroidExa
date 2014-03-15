package com.example.healthapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
public class FoodInfo extends Activity {
	   
	  private TextView foodtext;
	  private ImageView foodimage;
	  private Bundle  foodbundle;
	  private Button backbutton;
	  protected void onCreate(Bundle savedInstanceState) 
	  {
		  super.onCreate(savedInstanceState);
		  this.setContentView(R.layout.food_info);
		  intial();
	  }
	  private void intial()
	  {
		   foodbundle=this.getIntent().getExtras();
		   this.foodimage=(ImageView)this.findViewById(R.id.foodinfoimage);
		   this.foodtext=(TextView)this.findViewById(R.id.foodinfotextview);
		   this.backbutton=(Button)this.findViewById(R.id.backlistbtn);
		   this.foodimage.setBackgroundResource(foodbundle.getInt("foodimage"));
		   this.foodtext.setText(foodbundle.getString("foodinfo"));
		   this.backbutton.setOnClickListener(backbtn_listener);
	  }
	  private OnClickListener backbtn_listener=new OnClickListener(){
		     public void  onClick(View v)
		     {
		    	    backbutton.setBackgroundResource(R.drawable.btn_back_active);
		    	    Intent backintent=new Intent();
		    	    backintent.setClass(getApplicationContext(), ListViewActivity.class);
		    	    startActivity(backintent);
		     }
	  };

}
