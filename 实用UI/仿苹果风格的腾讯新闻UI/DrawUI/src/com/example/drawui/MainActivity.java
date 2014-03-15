package com.example.drawui;

import com.example.uiP.SlideMenu;
import app.main.url.*;

import android.os.Bundle;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends FragmentActivity {

	
	private CenterListFragment center=null;
	private LeftFragment left=null;
	private RightFragment right=null;
	private FragmentTransaction  getrealFragment;
    private  SlideMenu    mSlidemenu;
 
	protected void onCreate(Bundle savedInstanceState) {////
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//this.setContentView(R.layout.main);
		this.setContentView(R.layout.main_page);//注意,这个XML自定义的
		
		//把三个马甲布局文件先添加进来,之后再来代替
		mSlidemenu=(SlideMenu)this.findViewById(R.id.mSlideMenu);
		mSlidemenu.setLeftView(this.getLayoutInflater().inflate(R.layout.left_replace, null));
		mSlidemenu.setRightView(this.getLayoutInflater().inflate(R.layout.rigth_replace, null));
		mSlidemenu.setCenterView(this.getLayoutInflater().inflate(R.layout.center_replace,null));
		this.getrealFragment=this.getSupportFragmentManager().beginTransaction();
		this.left=new LeftFragment();
		this.right=new RightFragment();
		this.center=new CenterListFragment();
		getrealFragment.replace(R.id.left_replace, left);//注意，替换的是马甲布局文件的ID值，不是布局文件本身
		getrealFragment.replace(R.id.right_replace, right);
		getrealFragment.replace(R.id.center_replace,center);
		getrealFragment.commit();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void showLeft()
	{
		this.mSlidemenu.showLeftView();
	}
	public void showRight()
	{
		this.mSlidemenu.showRightView();
	}

}
