package com.example.firstandroid;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerButtonActivity extends Activity {
	    
	  private Spinner spinner_1;
	  private ArrayList<String> list;
	  private ArrayAdapter<String> myAdapter;
	  protected void onCreate(Bundle savedInstanceState)
	  {
		     super.onCreate(savedInstanceState);
		     this.setContentView(R.layout.spinner_demo);
		     spinner_1=(Spinner)this.findViewById(R.id.spinner_1);
	         spinner_1.setAdapter(getAdapter());
	         spinner_1.setOnItemSelectedListener(m_SpinnerListener);
	  }
	  private ArrayAdapter<String> getAdapter()
	  {
		    if(this.myAdapter==null)
		    {
		        this.myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,getData());
		        myAdapter.setDropDownViewResource(android.R.layout.simple_selectable_list_item);//ѡ��spinner��������������
		    }
		    return(myAdapter);
	  }
	  private ArrayList<String> getData()
	  {
		      if(this.list==null)
		      {
		    	  list=new ArrayList<String>();
		    	  list.add("O��");
		    	  list.add("A��");
		    	  list.add("B��");
		    	  list.add("AB��");
		    	  list.add("����");
		     }
		      return(list);
	  }
      private OnItemSelectedListener m_SpinnerListener=new OnItemSelectedListener(){

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			ArrayList<String> ar=getData();
			Toast.makeText(getApplicationContext(), "���Ѫ����"+ar.get(arg2), Toast.LENGTH_LONG).show();
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
    	     
      };
}
