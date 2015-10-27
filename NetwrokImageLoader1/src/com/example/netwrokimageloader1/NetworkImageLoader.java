package com.example.netwrokimageloader1;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

public class NetworkImageLoader extends AsyncTask<String, Void, Void> {

	ImageView defaultImageView;
	InputStream ins ;
	URL networkurl;
	Bitmap networkimagebitmap;
	
	NetworkImageLoader(ImageView defaultImageView)
	{
		 this.defaultImageView = defaultImageView;
	}
	
	@Override
	protected Void doInBackground(String... imageurl) 
	{
		try 
		{
			networkurl = new URL("http://cdn.mysitemyway.com/etc-mysitemyway/icons/legacy-previews/icons/matte-blue-and-white-square-icons-business/117072-matte-blue-and-white-square-icon-business-tool-hammer.png");
			HttpURLConnection connection = (HttpURLConnection) networkurl.openConnection();
			ins =  connection.getInputStream();
			networkimagebitmap = BitmapFactory.decodeStream(ins);
		} 
		
		
		 catch (Exception e) 
		 
	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	protected void onPostExecute(Void result) 
	{
		super.onPostExecute(result);
		defaultImageView.setImageBitmap(networkimagebitmap);
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
