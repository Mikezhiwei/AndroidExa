package com.example.healthapp;

import java.util.ArrayList;
import android.content.Intent;
import java.util.HashMap;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class ListViewActivity extends Activity {
	   
	   private Button searbtn=null;
	   private Button clearbtn=null;
	   private EditText input=null;
	   private ListView foodlists=null;
	   private SimpleAdapter foodAdapter=null;
	   private ArrayList<HashMap<String,Object>> food=null;
	   private HashMap<String,Object> menu=null;
	   protected void onCreate(Bundle savedInstanceState) 
	   {
		   super.onCreate(savedInstanceState);
		   this.setTitle("½¡¿µÒûÊ³ÁÐ±í");
		   this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
           this.setContentView(R.layout.food_index);
           this.intial();
	   }
	   private void intial()
	   {
		    this.searbtn=(Button)this.findViewById(R.id.searchbutton);
		    this.clearbtn=(Button)this.findViewById(R.id.cleearbutton);
		    this.input=(EditText)this.findViewById(R.id.foodinput);
		    this.foodlists=(ListView)this.findViewById(R.id.foodlist);
		    foodlists.setAdapter(getMyAdapter());
		    foodlists.setOnItemClickListener(this.food_list_listener);
	  }
       private SimpleAdapter getMyAdapter()
       {
    	    if(this.foodAdapter==null)
    	    {  
    	    	this.foodAdapter=new SimpleAdapter(this,this.getArrayList(),R.layout.food_items,new String[]{"foodImage","name","info"},new int[]{R.id.foodimage,R.id.foodname,R.id.foodinfo});
    	    }
    	    return(this.foodAdapter);
       }
       private ArrayList<HashMap<String,Object>> getArrayList()
       {
    	    if(this.food==null)
    	    {
    	         this.food=new ArrayList<HashMap<String,Object>>();
    	         for(int i=0;i<SaveFoodStirngs.FOODS.length;i++)
    	         {
    	        	 this.menu=new HashMap<String,Object>();
    	        	 menu.put("foodImage", SaveFoodStirngs.IMAGEID[i]);
    	        	 menu.put("name", SaveFoodStirngs.FOODS[i]);
    	        	 menu.put("info", SaveFoodStirngs.FOODS2[i]);
    	        	 food.add(menu);
    	         }
    	    }
    	    return(this.food);
       }
       private OnItemClickListener food_list_listener=new OnItemClickListener(){
    	       public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
    	    	   Intent foodintent=new Intent();
			       foodintent.setClass(ListViewActivity.this,FoodInfo.class);
			       foodintent.putExtra("foodname",SaveFoodStirngs.FOODS[arg2]);
			       foodintent.putExtra("foodimage", SaveFoodStirngs.IMAGEID[arg2]);
			       foodintent.putExtra("food2", SaveFoodStirngs.FOODS2[arg2]);
			       foodintent.putExtra("foodinfo", SaveFoodStirngs.INFOS[arg2]);
			       startActivity(foodintent);
			}
         };
}
