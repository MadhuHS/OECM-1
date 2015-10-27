package com.example.threads_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button startbutton,displaybutton;
	TextView msgtextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startbutton = (Button) findViewById(R.id.button1);
		displaybutton = (Button) findViewById(R.id.button2);
		msgtextview = (TextView) findViewById(R.id.textView1);
		
		startbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				longtask();
			}
		});
		
		displaybutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Toast.makeText(MainActivity.this,"This is display",Toast.LENGTH_SHORT).show();
				
			}
		});
			
	}
	
	public void longtask()
	{
		 new Thread(new Runnable() 
		 {
			
			@Override
			public void run() 
			{

				for(int i = 0 ; i< 10000; i++)
				{
					msgtextview.setText(String.valueOf(i));
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
		}
		}).start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
