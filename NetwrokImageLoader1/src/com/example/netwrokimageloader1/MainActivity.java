package com.example.netwrokimageloader1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView defaultimage;
	String[] imageurl = {"http://hdwidescreenwallpapers.com/wp-content/uploads/2013/10/wallpapers-for-mobile.jpg"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		defaultimage = (ImageView) findViewById(R.id.imageView1);
		NetworkImageLoader loader =  new NetworkImageLoader(defaultimage);
		loader.execute(imageurl);
	}

}
