package com.example.firstandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class ImageButtonActivity extends Activity {
    
	 private  String data;
	 private ImageButton button;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.imgaebutdemo);
		Bundle extras=this.getIntent().getExtras();
		if(extras!=null){
			   data=extras.getString("activityMain");
		}
		button=(ImageButton)this.findViewById(R.id.imagebutton);
		button.setOnClickListener(new OnClickListener(){
			  public void onClick(View v){
				  Bundle bundle=new Bundle();
				  bundle.putString("store", "À´×ÔImageActivity");
				  Intent mintent=new Intent();
				  mintent.putExtras(bundle);
				  setResult(RESULT_CANCELED,mintent);
				  finish();
			  }
		});
		this.setTitle(data);
	  
	}
} 
