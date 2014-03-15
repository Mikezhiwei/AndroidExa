package com.example.coolbuton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;

public class CoolActivity extends Activity {

	public CoolActivity() {
		// TODO Auto-generated constructor stub
	
	}
	private Button deletebtn;
	
	private Button sleeptbn;
	private Button placebtn;
	private Button musicbtn;
	private Button withbtn;
	private Button thoghtbtn;
	private Button camerabtn;
	
	private Animation rotateanimation;
	private Animation scaleanimation;
	private Animation transanimation;
	
	public  LayoutParams params=new LayoutParams(0,0);
	protected  boolean isClick=true;
	
	private static int height;
	private static int width;
	protected void onCreate(Bundle savedInstanceState)
	{
		  super.onCreate(savedInstanceState);
		  this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		  this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		  this.setContentView(R.layout.path_button);
		  this.inital();
	}
	private void inital()
	{
		    Display display = getWindowManager().getDefaultDisplay(); ////////////
		    height = display.getHeight();  
		    width = display.getWidth();
		  
		    params.height = 50;////////
		    params.width = 50;//设置组件的自身显示的大小
		   //设置边距  (int left, int top, int right, int bottom)
		   params.setMargins(10, height - 100, 0, 0);
		  
		   this.camerabtn=(Button)this.findViewById(R.id.camera_btn);
		   this.camerabtn.setLayoutParams(params);
		   
		   this.deletebtn=(Button)this.findViewById(R.id.friend_btn);
		   this.deletebtn.setLayoutParams(params);
		   
		   this.musicbtn=(Button)this.findViewById(R.id.music_btn);
		   this.musicbtn.setLayoutParams(params);
		   
		   this.placebtn=(Button)this.findViewById(R.id.place_btn);
		   this.placebtn.setLayoutParams(params);
		   
		   this.withbtn=(Button)this.findViewById(R.id.with_btn);
		   this.withbtn.setLayoutParams(params);
		   
		   this.sleeptbn=(Button)this.findViewById(R.id.sleep_btn);
		   this.sleeptbn.setLayoutParams(params);
		   
		   this.thoghtbtn=(Button)this.findViewById(R.id.thought_btn);
		   this.thoghtbtn.setLayoutParams(params);
		   
		   this.deletebtn.setOnClickListener(new OnClickListener(){
			       public void onClick(View v)
			       {
			    	    if(isClick)
			    	    {
			    	       isClick=false;
			    	       deletebtn.startAnimation(getRotateanimation(-45.0f,0.5f,0.45f));
			    	       camerabtn.startAnimation(getTransanimation(0.0f,-180.0f,10,height-280,camerabtn,1000));
			    	       withbtn.startAnimation(getTransanimation(50.0f,-160.0f,60,height-260,withbtn,1000));
			    	       placebtn.startAnimation(getTransanimation(90.0f,-120.0f,100,height-220,placebtn,1000));
			    	       musicbtn.startAnimation(getTransanimation(130.0f,-70.0f,140,height-170,musicbtn,1000));
			    	       thoghtbtn.startAnimation(getTransanimation(170.0f,-20.0f,180,height-120,thoghtbtn,1000));
			    	       sleeptbn.startAnimation(getTransanimation(200.f,+20.0f,210,height-80,sleeptbn,1000));
			    	       /*整个手机的屏幕是以左上角为坐标原点,动画的设置是距离初始的组件的距离,负号表示从这个组件的Y值向上移动,＋表示向下移动
			    	        * 以上两个参数是动画显示的效果哈(PS:手机屏幕竖直的那面为Y,水平那面为X,对X而言,向右为正,向左为负,对Y而言,向上为负,向下位正
			    	        * 之后是在动画完成后,组件的在屏幕中显示的尺寸大小和位置*/
			    	    }else{
			    	    	isClick=true;
			    	    	deletebtn.startAnimation(getRotateanimation(90.0f,0.5f,0.45f));
			    	        camerabtn.startAnimation(getTransanimation(0.0f,180.0f,10,height-100,camerabtn,1000));
			    	        withbtn.startAnimation(getTransanimation(-50.0f,160.0f,10,height-100,withbtn,1000));
			    	        placebtn.startAnimation(getTransanimation(-90.0f,120.0f,10,height-100,placebtn,1000));
			    	        musicbtn.startAnimation(getTransanimation(-130.0f,70.0f,10,height-100,musicbtn,1000));
			    	        thoghtbtn.startAnimation(getTransanimation(-170.0f,20.0f,10,height-100,thoghtbtn,1000));
			    	        sleeptbn.startAnimation(getTransanimation(-200.0f,-20.0f,10,height-100,sleeptbn,1000));
			    	    }
			       }
			   });
		   this.camerabtn.setOnClickListener(new OnClickListener(){
			      public void onClick(View v)
			      {
			    	    camerabtn.startAnimation(getScaleTrananimation(3.0f,3.0f));
			    	    withbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	    placebtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	    musicbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	    thoghtbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	    sleeptbn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			      }
		   });
		   this.withbtn.setOnClickListener(new OnClickListener(){
			   public void onClick(View v)
			   {
				   withbtn.startAnimation(getScaleTrananimation(3.0f,3.0f));
				   musicbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
		    	   thoghtbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
		    	   sleeptbn.startAnimation(getScaleTrananimation(0.5f,0.5f));
		    	   placebtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
		    	   camerabtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			   }
		   });
		   this.placebtn.setOnClickListener(new OnClickListener(){
			   public void onClick(View v)
			   {
				   placebtn.startAnimation(getScaleTrananimation(3.0f,3.0f));
				   musicbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
		    	   thoghtbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
		    	   sleeptbn.startAnimation(getScaleTrananimation(0.5f,0.5f));
		    	   camerabtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
		    	   withbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			   }
		   });
		   this.musicbtn.setOnClickListener(new OnClickListener(){
			    public void onClick(View v)
			    {     
			    	  musicbtn.startAnimation(getScaleTrananimation(3.0f,3.0f));
			    	  thoghtbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  sleeptbn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  camerabtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  withbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  placebtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    }
		   });
		   this.thoghtbtn.setOnClickListener(new OnClickListener(){
			    public void onClick(View v)
			    {
			    	  thoghtbtn.startAnimation(getScaleTrananimation(3.0f,3.0f));
			    	  sleeptbn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  camerabtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  withbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  placebtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  musicbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    }
		   });
		   this.sleeptbn.setOnClickListener(new OnClickListener(){
			    public void onClick(View v)
			    {
			    	sleeptbn.startAnimation(getScaleTrananimation(3.0f,3.0f));
			    	 thoghtbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	 camerabtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  withbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  placebtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    	  musicbtn.startAnimation(getScaleTrananimation(0.5f,0.5f));
			    }
			    
		   });
		   
	}
     
	public  Animation getRotateanimation(float todegree,float PiontX,float PiontY)
	{
		        this.rotateanimation=new RotateAnimation(0,todegree,Animation.RELATIVE_TO_SELF,PiontX,Animation.RELATIVE_TO_SELF,PiontY);
		    	this.rotateanimation.setDuration(1000);
		    	this.rotateanimation.setAnimationListener(new AnimationListener(){
                   public void onAnimationEnd(Animation arg0) {
						// TODO Auto-generated method stub
						rotateanimation.setFillAfter(true);
					}
                   public void onAnimationRepeat(Animation arg0) {
						// TODO Auto-generated method stub
						
					}
                   public void onAnimationStart(Animation arg0) {
						// TODO Auto-generated method stub
					      	rotateanimation.setFillAfter(true);
					}
		    		
		    	});
		    
		    return(this.rotateanimation);
	}
	public  Animation getTransanimation(float toX,float toY,final int lastX,final int lastY, final Button btn,long duration)
	{
		       transanimation=new TranslateAnimation(0,toX,0,toY);
		       transanimation.setDuration(duration);
			   transanimation.setAnimationListener(new AnimationListener(){
                   public void onAnimationEnd(Animation arg0) {
					// TODO Auto-generated method stub
					 params=new LayoutParams(0,0);
					 params.width=50;
					 params.height=50;
					 params.setMargins(lastX, lastY, 0, 0);
					 btn.setLayoutParams(params);
					 btn.clearAnimation();
			    }

				@Override
				public void onAnimationRepeat(Animation arg0) {
					// TODO Auto-generated method stub
					 
				}

				@Override
				public void onAnimationStart(Animation arg0) {
					// TODO Auto-generated method stub
					
				}
				   
			   });
		      return(this.transanimation);
	}
	private Animation getScaleTrananimation(float toX,float toY)
	{
		this.scaleanimation=new ScaleAnimation(1.0f,toX,1.0f,toY,Animation.RELATIVE_TO_SELF,0.45f,Animation.RELATIVE_TO_SELF,0.45f);
		this.scaleanimation.setDuration(500);
		this.scaleanimation.setFillAfter(true);
		return(this.scaleanimation);
	}

}
