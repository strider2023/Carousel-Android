package com.example.uitest;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class  CarouselAdapter  extends BaseAdapter {
	
	private ArrayList<Integer> mData = new ArrayList<Integer>(0);
	private Context mContext;

	public CarouselAdapter(Context context) {
		mContext = context;
	}
	
	public void setData(ArrayList<Integer> data) {
		mData = data;
	}
	
	@Override
	public int getCount() {
		return mData.size();
	}

	@Override
	public Object getItem(int pos) {
		return mData.get(pos);
	}

	@Override
	public long getItemId(int pos) {
		return pos;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		ImageView mImage= new ImageView(mContext);
		mImage.setImageResource(mData.get(arg0));
		mImage.setPadding(5, 5, 5, 5);
		mImage.setBackgroundColor(Color.BLACK);
		return mImage;
	}
    
}
