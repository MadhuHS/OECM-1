package com.example.weatherupdates;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button refreshbutton;
	TextView cityvaluetextview,tempraturevaluetexview;
	String[] updateurl = {"http://api.openweathermap.org/data/2.5/weather?q=Bangalore,India&appid=bd82977b86bf27fb59a04b61b657fb6f"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		refreshbutton  = (Button) findViewById(R.id.buttonrefrsh);
		cityvaluetextview = (TextView) findViewById(R.id.textViewcityvalue);
		tempraturevaluetexview = (TextView) findViewById(R.id.textViewtempvalue);
		
		refreshbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				GetLatestUpdates updates = new GetLatestUpdates(cityvaluetextview,tempraturevaluetexview);
				updates.execute(updateurl);
			}
		});
		
		
	}

	

}
