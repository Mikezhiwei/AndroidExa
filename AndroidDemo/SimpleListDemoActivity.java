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
		    	 user.put("username", "姓名"+i);
		    	 user.put("age", (20+i)+"");
		    	 users.add(user);
		     }
		     SimpleAdapter simpleadatpter=new SimpleAdapter(this,users,R.layout.useforlist_demo,new String[]{"img","username","age"},new int[]{R.id.img,R.id.name,R.id.age});
		     //对上述的参数分别说明，this代表是当前的Acitivity组件，users是一个java的容器，第三个是是listview的资源文件，第四个是字符串数组，符合Map里面的KEY，第五个是符合资源文件中的ID
	         ((ListView)this.findViewById(R.id.users)).setAdapter(simpleadatpter);*/
	   }

}
