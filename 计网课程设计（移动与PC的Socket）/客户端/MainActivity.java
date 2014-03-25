package com.example.myclienttest;

import android.os.Bundle;

import android.os.StrictMode;

import java.net.Socket;
import java.net.UnknownHostException;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MainActivity extends Activity {

    public  Button btn;
    public Button btn2;
    public Button btn3;
    public Button btn4;
	public  TextView mytext;
	public EditText edit;
	private BufferedReader theinput;
	private PrintStream theoutput;
    private String getServer="Ok";
    private String sendServer="Hi";
    private boolean isConnection=false;
    private MyTestThread connection;
    private Socket clientsocket;
    private String thehost="192.168.2.19";
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.client);
		this.mytext=(TextView)this.findViewById(R.id.serverview);
	    this.edit=(EditText)this.findViewById(R.id.myedittext);
		this.btn2=(Button)this.findViewById(R.id.getview);
	    this.btn=(Button)this.findViewById(R.id.mybutton);
	    this.btn3=(Button)this.findViewById(R.id.connectionbtn);
	    this.btn4=(Button)this.findViewById(R.id.closebtn);
		this.btn.setOnClickListener(new OnClickListener()
		{      
			    public void onClick(View v)
			    {    
			    	 sendServer=edit.getText().toString();
			    	 if(isConnection){
			         connection.sentMessage(sendServer);
			    	 }
			    }
		});
		this.btn2.setOnClickListener(new OnClickListener(){
			   public void onClick(View v)
			   {
				    mytext.setText(getServer);
			   }
		});
		this.btn3.setOnClickListener(new OnClickListener(){
			    public void onClick(View v)
			    {
			    	if(isConnection==false)
			    	{
			    	  connection=new MyTestThread();
			    	  connection.start();
			    	  isConnection=!isConnection;
			    	}
			    }
	    });
		this.btn4.setOnClickListener(new OnClickListener(){
			     public void onClick(View v)
			     {
			          try {
					     isConnection=false;
						 connection.cloestoServer();
			             connection=null;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			     }
		});
    }
    private class MyTestThread extends Thread{
		private BufferedReader theinput=null;
		private PrintStream theoutput =null;
		public void run()
		 { 
			  try {
					clientsocket=new Socket("192.168.2.19",7070);//建立和服务器的连接
					isConnection=true;
					theinput=new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));//建立输入输出流
				    theoutput=new PrintStream(clientsocket.getOutputStream());
				    while(true)
				    {
				    	  getServer=theinput.readLine();
				    }
				  } catch (IOException e) {
					  try {
						clientsocket.close();
						theoutput.flush();
						theoutput.close();
						theinput.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					  
				}
		  }
		  public void sentMessage(String mes)
		  {
			     this.theoutput.println(mes);
		  }
		  public void cloestoServer()
		  {
			      try {
			    	 theoutput.flush();
			    	 theoutput.close();
			    	 theinput.close();
					 clientsocket.close();
					MainActivity.this.isConnection=false;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  }
	}
	

}
