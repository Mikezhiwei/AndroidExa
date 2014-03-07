package com.example.firstandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MenuDemoActivity extends Activity {
	   
	   
	   private static final int BULE_ID=Menu.FIRST;
	   private static final int CYAN_ID=Menu.FIRST+1;
	   private static final int RED_ID=Menu.FIRST+2;
	   private static final int YELLOW_ID=Menu.FIRST+3;
	   private static final int GREEN_ID=Menu.FIRST+4;
	   private static final int DKGRAY_ID=Menu.FIRST+5;
	   
	   protected void onCreate(Bundle savedInstanceState)
	   {
                super.onCreate(savedInstanceState);
                
	   }
	   public boolean onCreateOptionsMenu(Menu menu)
	   {
		   this.bulidMenu(menu);
		  
		   return(super.onCreateOptionsMenu(menu));     
	   }
	   private void  bulidMenu(Menu menu)
	   {
		     menu.add(Menu.NONE, this.RED_ID, Menu.NONE, "红色").setIcon(R.drawable.item);
		     menu.add(Menu.NONE,this.BULE_ID,Menu.NONE,"蓝色").setIcon(R.drawable.item);
		     menu.add(Menu.NONE, this.YELLOW_ID,Menu.NONE, "黄色").setIcon(R.drawable.item);
		     menu.add(Menu.NONE, this.CYAN_ID, Menu.NONE, "青色").setIcon(R.drawable.item);
		     menu.add(Menu.NONE, this.GREEN_ID, Menu.NONE, "绿色").setIcon(R.drawable.item);
		     menu.add(Menu.NONE,this.DKGRAY_ID,Menu.NONE,"深灰").setIcon(R.drawable.item);
		     
	   }
	   public boolean onOptionsItemSelected(MenuItem item)
	   {
		     return( this.applytheChoice(item));
	   }
	   private boolean applytheChoice(MenuItem item)
	   {
		   if(item.getItemId()==this.GREEN_ID)
		   {
			       
		   }
		   return(false);
	   }
}
