package com.example.uiP;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;


public class SlideMenu extends RelativeLayout {

	    private SlidingView slidingview;
	    private View MenuView;
	    private View DetailView;
	    //继承父类的所有构造方法才能定义进入XML资源布局文件
	   public SlideMenu(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	   }
	   public SlideMenu(Context context, AttributeSet attrs) {
			super(context, attrs);
		}

		public SlideMenu(Context context, AttributeSet attrs, int defStyle) {
			super(context, attrs, defStyle);
		}
	   public void setLeftView(View lv)
	   {
		 LayoutParams leftparams=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.FILL_PARENT);
		 this.addView(lv, leftparams);
		 this.MenuView=lv;
	   }
	
	   public void setRightView(View rv)
	   {
		  LayoutParams rightparams=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.FILL_PARENT);
		  rightparams.addRule(this.ALIGN_PARENT_RIGHT);
		  this.addView(rv, rightparams);
		  this.DetailView=rv;
	   }
	   public void setCenterView(View v)
	   {
		   LayoutParams aboveparams=new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT);
		   slidingview = new SlidingView(getContext());
		   this.addView(slidingview,aboveparams);
		   this.slidingview.setView(v);
		   slidingview.invalidate();
		   this.slidingview.setMenuView(MenuView);
		   this.slidingview.setDetailView(DetailView);
	   }
	   public void setAllViews(View lv,View rv,View v)
	   {
		     this.setLeftView(lv);
		     this.setRightView(rv);
             this.setCenterView(v);
	   }
	   public void showLeftView()
	   {
		   this.slidingview.showLeftView();
	   }
	   public void showRightView()
	   {
		   this.slidingview.showRightView();
	   }

}
