package com.example.firstandroid;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class SimleGirdDemoActivity extends Activity {
	 
	  private GridView gridView;
	  private ArrayList<HashMap<String,Object>> item;
	  private SimpleAdapter myAdapter;
 	  protected void onCreate(Bundle savedInstanceState)
	  {
		   super.onCreate(savedInstanceState);
		   this.setContentView(R.layout.gridviewdemo);
		   gridView=(GridView)this.findViewById(R.id.gridview);
		   gridView.setAdapter(getAdapter());
		   gridView.setOnItemClickListener(griditem_listener);
		   
	  }
	  private ArrayList<HashMap<String,Object>> getItem()
	  {
		      if(this.item==null)
		      {
		    	 item=new ArrayList<HashMap<String,Object>>();
		    	 for(int i=0;i<10;i++)
		    	 {
		    		 HashMap<String,Object> map=new HashMap<String,Object>();
		    		 map.put("img", R.drawable.ic_launcher);
		    		 map.put("ItemText", "APP"+i);
		    		 item.add(map);
		    	 }
		      }
		      return(item);
	  }
	  private SimpleAdapter getAdapter()
	  {
		       if(this.myAdapter==null)
		       {
		    	   this.myAdapter=new SimpleAdapter(this,this.getItem(),R.layout.simplegriditem,new String[]{"img","ItemText"},new int []{R.id.ItemImage,R.id.ItemText});
		       }
		       return(myAdapter);
	  }
	  private OnItemClickListener griditem_listener=new OnItemClickListener(){

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,//arg0指适配器中的泛型,arg2指的泛型是在容器中的位置
				long arg3) {
			// TODO Auto-generated method stub
			  //HashMap<String,Object> item=(HashMap<String,Object>)(arg0.getItemAtPosition(arg2));
               ArrayList<HashMap<String,Object>> ar=getItem();
               String appname=(String)ar.get(arg2).get("ItemText");
               Toast.makeText(getApplicationContext(), "你选中了"+appname, Toast.LENGTH_LONG).show();
		       
		}
	};

}
