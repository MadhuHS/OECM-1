package com.example.demo_service;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button startservicebutton,stopservicebutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startservicebutton = (Button) findViewById(R.id.button1);
		stopservicebutton = (Button) findViewById(R.id.button2);
		
		
		startservicebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(MainActivity.this,MusicService.class);
				startService(intent);
			}
		});
	
		stopservicebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(MainActivity.this,MusicService.class);
				stopService(intent);
			}
		});
	
	
	
	
	
	
	}

}
