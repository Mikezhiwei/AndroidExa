package com.example.drawui;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class CenterListFragment extends ListFragment {
	  
	 private ArrayList<HashMap<String,Object>> myList=null;
	 private ImageButton left_btn;
	 private ImageButton rigth_btn;
	 private SimpleAdapter myAdapter=null;
	 private LinearLayout mLayout=null;
	 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)///
	 {
		    View centerlistview =inflater.inflate(R.layout.centerlist,null);
		    this.left_btn=(ImageButton)centerlistview.findViewById(R.id.left_btn);
		    this.rigth_btn=(ImageButton)centerlistview.findViewById(R.id.right_btn);
		    return(centerlistview);
     }
	 public void onActivityCreated(Bundle savedInstanceState)
	 {  
		   super.onActivityCreated(savedInstanceState);
		   this.intial();
     }
	 private void intial()
	 {
		       this.setListAdapter(getmyAdapter());//注意，是使用setListA
		       this.left_btn.setOnClickListener(new OnClickListener(){
		    	    public void onClick(View v){
		    	    	 ((MainActivity)CenterListFragment.this.getActivity()).showLeft();
		    	    }
		       });
		       this.rigth_btn.setOnClickListener(new OnClickListener(){
		    	   public void onClick(View v){
		    		   ((MainActivity)CenterListFragment.this.getActivity()).showRight();
		    	   }
		       });
		       
	 }
	 private ArrayList<HashMap<String,Object>> getmyList()
	 {
		 HashMap<String,Object> newsitem=new HashMap<String,Object>();
		 if(this.myList==null)
		 {
			   myList=new ArrayList<HashMap<String,Object>>();
			   this.mLayout=new LinearLayout(this.getActivity());
			   newsitem.put("title", this.getString(R.string.title));
			   newsitem.put("image", R.drawable.p1);
			   newsitem.put("news",this.getString(R.string.news));
			   myList.add(newsitem);
			   newsitem=new HashMap<String,Object>();
			   newsitem.put("title", this.getString(R.string.title));
			   newsitem.put("image", R.drawable.p2);
			   newsitem.put("news",this.getString(R.string.news));
			   myList.add(newsitem);
			  newsitem=new HashMap<String,Object>();
			   newsitem.put("title", this.getString(R.string.title));
			   newsitem.put("image", R.drawable.p3);
			   newsitem.put("news",this.getString(R.string.news));
			   myList.add(newsitem);
			   newsitem=new HashMap<String,Object>();
			   newsitem.put("title", this.getString(R.string.title));
			   newsitem.put("image", R.drawable.p4);
			   newsitem.put("news",this.getString(R.string.news));
			   myList.add(newsitem);
			   newsitem=new HashMap<String,Object>();
			   newsitem.put("title", this.getString(R.string.title));
			   newsitem.put("image", R.drawable.p5);
			   newsitem.put("news",this.getString(R.string.news));
			   myList.add(newsitem);
			   newsitem=new HashMap<String,Object>();
			   newsitem.put("title", this.getString(R.string.title));
			   newsitem.put("image", R.drawable.p6);
			   newsitem.put("news",this.getString(R.string.news));
			   myList.add(newsitem);
			   newsitem=new HashMap<String,Object>();
			   newsitem.put("title", this.getString(R.string.title));
			   newsitem.put("image", R.drawable.p7);
			   newsitem.put("news",this.getString(R.string.news));
			   myList.add(newsitem);
			   newsitem=new HashMap<String,Object>();
			   newsitem.put("title", this.getString(R.string.title));
			   newsitem.put("image", R.drawable.p7);
			   newsitem.put("news",this.getString(R.string.news));
			   myList.add(newsitem);
		 }
		 return(this.myList);
	 }
	 private SimpleAdapter getmyAdapter()
	 {
		 if(this.myAdapter==null)
		 {
			 myAdapter=new SimpleAdapter(this.getActivity(),this.getmyList(),R.layout.list_article,new String[]{"title","image","news"},new int[]{R.id.title,R.id.newsimage,R.id.news});
		 //第一个参数是必须写入Context的子类，所以调用getActivity;
			 ////
		 }
		 return(this.myAdapter);
	 }
	 public void onListItemClick(ListView l, View v, int position, long id)
	 {
		    super.onListItemClick(l, v, position, id);
		    if(position==0)
		    {
		    	  Intent intent1=new Intent().setClass(getActivity(), Test1.class);
		    	  CenterListFragment.this.startActivity(intent1);
		    }
		    else if(position==1)
		    {
		    	 Intent intent2=new Intent().setClass(getActivity(), Test2.class);
		    	 CenterListFragment.this.startActivity(intent2);
		    }
	 }
} 
