package com.jsp.asynctask_demo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button downloadbutton;
	TextView msgtextview;
	Context context = MainActivity.this;
	NotificationCompat.Builder builder;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		downloadbutton  = (Button) findViewById(R.id.button1);
		msgtextview = (TextView) findViewById(R.id.textView1);
		downloadbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				
				NetworkOperations nwop = new NetworkOperations(downloadbutton,msgtextview,context);
				downloadbutton.setEnabled(false);
				nwop.execute();
				
			}
		});
		
	}


}
