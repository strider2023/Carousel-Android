package com.example.uitest;

import java.util.ArrayList;

import com.touchmenotapps.carousel.simple.HorizontalCarouselLayout;
import com.touchmenotapps.carousel.simple.HorizontalCarouselLayout.CarouselInterface;
import com.touchmenotapps.carousel.simple.HorizontalCarouselStyle;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {
	
	private HorizontalCarouselStyle mStyle;
	private HorizontalCarouselLayout mCarousel;
	private CarouselAdapter mAdapter;
	private ArrayList<Integer> mData = new ArrayList<Integer>(0);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mData.add(R.drawable.image_1);
		mData.add(R.drawable.image_3);
		mData.add(R.drawable.dishonored);
		mData.add(R.drawable.image_2);
		mAdapter = new CarouselAdapter(this);
		mAdapter.setData(mData);
		mCarousel = (HorizontalCarouselLayout) findViewById(R.id.carousel_layout);
		mStyle = new HorizontalCarouselStyle(this, HorizontalCarouselStyle.STYLE_ZOOMED_OUT);		
		mCarousel.setStyle(mStyle);
		mCarousel.setAdapter(mAdapter);
				
		mCarousel.setOnCarouselViewChangedListener(new CarouselInterface() {
			@Override
			public void onItemChangedListener(View v, int position) {
				Toast.makeText(MainActivity.this, "Position " + String.valueOf(position), Toast.LENGTH_SHORT).show();
			}
		});		
	}
	
	/**
	 * Implementation of the vertical carousel.
	 */
	
	/*private VerticalCarouselStyle mStyle;
	private VerticalCarouselLayout mCarousel;
	private CarouselAdapter mAdapter;
	private ArrayList<Integer> mData = new ArrayList<Integer>(0);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mData.add(R.drawable.image_1);
		mData.add(R.drawable.image_3);
		mData.add(R.drawable.dishonored);
		mData.add(R.drawable.image_2);
		mAdapter = new CarouselAdapter(this);
		mAdapter.setData(mData);
		mCarousel = (VerticalCarouselLayout) findViewById(R.id.carousel_layout);
		mStyle = new VerticalCarouselStyle(this, VerticalCarouselStyle.NO_STYLE);		
		mCarousel.setStyle(mStyle);
		mCarousel.setAdapter(mAdapter);
				
		mCarousel.setOnCarouselViewChangedListener(new CarouselInterface() {
			@Override
			public void onItemChangedListener(View v, int position) {
				Toast.makeText(MainActivity.this, "Position " + String.valueOf(position), Toast.LENGTH_SHORT).show();
			}
		});		
	}*/
}
