package com.example.firstandroid;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListDemo2Activity extends Activity {
	    
	   private ListView listview;
	   private ArrayAdapter<String> myAdapter;
	   private ArrayList<String> data;
	   protected void onCreate(Bundle savedInstanceState)
	   {
		     super.onCreate(savedInstanceState);
		     this.setContentView(R.layout.list_demo2);
		     listview=(ListView)this.findViewById(R.id.listview_demo2);
		     listview.setAdapter(getAdapter());
		     listview.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		     listview.setOnItemClickListener(item_click_listener);
	   }
	   private ArrayAdapter<String> getAdapter()
	   {
		      if(this.myAdapter==null)
		      {
		    	   this.myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,this.getData());
		      }
		      return(this.myAdapter);
	   }
	   private ArrayList<String> getData()
	   {
		     if(this.data==null)
		     {
		    	   this.data=new ArrayList<String>();
		    	   data.add("��Ŀ1");
		    	   data.add("��Ŀ2");
		    	   data.add("��Ŀ3");
		    	   data.add("��Ŀ4");
		     }
		     return(this.data);
	   }
       private OnItemClickListener item_click_listener=new OnItemClickListener(){
             public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			  ArrayList<String>ar=(ArrayList<String>)getData();
              Toast.makeText(getApplicationContext(), "��ѡ���˵�"+arg2+"��Item,Item��ֵ��"+ar.get(arg2),Toast.LENGTH_LONG).show(); 
              }
    	       
       };
}
