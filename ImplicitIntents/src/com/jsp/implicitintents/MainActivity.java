package com.jsp.implicitintents;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button callbutton,startbutton,camerabutton;
	ImageView capturedimage;
	private static final int CAMERA = 1313;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		callbutton = (Button) findViewById(R.id.buttoncall);
		startbutton = (Button) findViewById(R.id.buttonbrowse);
		camerabutton = (Button) findViewById(R.id.buttoncamera);
		capturedimage = (ImageView) findViewById(R.id.imageViewcaptured);
		
		callbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(Intent.ACTION_DIAL);
				//Intent intent = new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"986598568"));
				startActivity(intent);
			}
		});
		
	
		startbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.google.com"));
				startActivity(intent);
				
			}
		});		
		
		
		camerabutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				//startActivity(intent);
				startActivityForResult(intent,CAMERA);
			}
		});	
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, 
			Intent data) {
	
		super.onActivityResult(requestCode, resultCode, data);
		
		if(requestCode == CAMERA)
		{
			if(resultCode==RESULT_OK)
			{
				Bitmap bm = (Bitmap) data.getExtras().get("data");
				capturedimage.setImageBitmap(bm);
			}
		
			else if(resultCode==RESULT_CANCELED)
			{
				Toast.makeText(MainActivity.this,"ERROR WITH CAMERA",Toast.LENGTH_SHORT).show();
			}
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
