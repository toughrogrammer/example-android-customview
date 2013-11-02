package com.example.customviewproject;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFolder extends View {

	TextView _title;
	TextView _count;
	
	String title = "";
	int count = -1;

	public MyFolder(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyFolder(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub

		TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
				R.styleable.MyFolder, 0, 0);

		try {
			title = a.getString(R.styleable.MyFolder_title);
			count = a.getInteger(R.styleable.MyFolder_count, 0);
		} finally {
			a.recycle();
		}
	}

	public MyFolder(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}
	
	private void init() {
		
	}
	
//	@Override
//	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//	   // Try for a width based on our minimum
//	   int minw = getPaddingLeft() + getPaddingRight() + getSuggestedMinimumWidth();
//	   int w = resolveSizeAndState(minw, widthMeasureSpec, 1);
//
//	   // Whatever the width ends up being, ask for a height that would let the pie
//	   // get as big as it can
//	   int minh = MeasureSpec.getSize(w) - (int)mTextWidth + getPaddingBottom() + getPaddingTop();
//	   int h = resolveSizeAndState(MeasureSpec.getSize(w) - (int)mTextWidth, heightMeasureSpec, 0);
//
//	   setMeasuredDimension(w, h);
//	}

}
