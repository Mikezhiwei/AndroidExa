package com.example.firstandroid;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.HashMap;
public class ListDemo1Activity extends Activity {
	   
	   private ListView listView;
	   private SimpleAdapter mySimleadapter;
	   private ArrayList<HashMap<String,Object>> item;
	   protected void onCreate(Bundle savedInstanceState)
	   {
		   super.onCreate(savedInstanceState);
		   this.setContentView(R.layout.list_demo);
		   listView=(ListView)this.findViewById(R.id.food);
		   listView.setAdapter(getAdapter());
		   listView.setOnItemClickListener(item_clicklistener);
		   
	   }
	   private SimpleAdapter getAdapter()
	   {
		     if(this.mySimleadapter==null)
		     {
		    	  this.mySimleadapter=new SimpleAdapter(this,this.getArrayList(),R.layout.listimage_demo,new String[]{"img","title","info"},new int[]{R.id.img,R.id.title,R.id.info});
		     }
		     return(mySimleadapter);
	   }
	   private ArrayList<HashMap<String,Object>> getArrayList()
	   {
		   if(this.item==null)
		   {
			   this.item=new ArrayList<HashMap<String,Object>>();
			   HashMap<String,Object> maps=new HashMap<String,Object>();
			   maps.put("img", R.drawable.bamboo);
			   maps.put("title", "Bamboo");
			   maps.put("info", "nice");
			   item.add(maps);
			   maps=new HashMap<String,Object>();
			   maps.put("img", R.drawable.beef);
			   maps.put("title", "Beef");
			   maps.put("info", "delicious");
			   item.add(maps);
			   maps=new HashMap<String,Object>();
			   maps.put("img",R.drawable.beanmilk);
			   maps.put("title", "Beanmilk");
			   maps.put("info", "cool");
			   item.add(maps);
			   maps=new HashMap<String,Object>();
			   maps.put("img", R.drawable.beer);
			   maps.put("title", "Beer");
			   maps.put("info", "wonderful");
			   item.add(maps);
		   }
		   return(item);
	   }
       private OnItemClickListener item_clicklistener=new OnItemClickListener(){

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			ArrayList<HashMap<String,Object>> ar=getArrayList();
			String foodname=(String)ar.get(arg2).get("title");
			Toast.makeText(getApplicationContext(), "你查看了第"+arg2+"个食品,该食品的名称是"+foodname,Toast.LENGTH_LONG).show();
		   }
    };
}
