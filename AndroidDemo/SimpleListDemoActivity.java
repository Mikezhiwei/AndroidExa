package com.example.firstandroid;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.ListView;

public class SimpleListDemoActivity extends Activity {
	   
	   protected void onCreate(Bundle savedInstanceState)
	   {
		     /*super.onCreate(savedInstanceState);
		     this.setContentView(R.layout.list_demo);
		     ArrayList<HashMap<String,Object>> users=new ArrayList<HashMap<String,Object>>();
		     for(int i=0;i<10;i++)
		     {
		    	 HashMap<String,Object>user=new HashMap<String,Object>();
		    	 user.put("img", R.drawable.item);
		    	 user.put("username", "����"+i);
		    	 user.put("age", (20+i)+"");
		    	 users.add(user);
		     }
		     SimpleAdapter simpleadatpter=new SimpleAdapter(this,users,R.layout.useforlist_demo,new String[]{"img","username","age"},new int[]{R.id.img,R.id.name,R.id.age});
		     //�������Ĳ����ֱ�˵����this�����ǵ�ǰ��Acitivity�����users��һ��java������������������listview����Դ�ļ������ĸ����ַ������飬����Map�����KEY��������Ƿ�����Դ�ļ��е�ID
	         ((ListView)this.findViewById(R.id.users)).setAdapter(simpleadatpter);*/
	   }

}
