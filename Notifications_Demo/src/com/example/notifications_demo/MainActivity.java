package com.example.notifications_demo;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button notifybutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		notifybutton = (Button) findViewById(R.id.button1);
		
		notifybutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				NotificationCompat.Builder builder = new Builder(MainActivity.this);
				builder.setTicker("1 new message");
				builder.setContentTitle("New Message");
				builder.setContentText("This is a new Message");
				builder.setSmallIcon(R.drawable.ic_launcher);
				
				Intent intent = new Intent(MainActivity.this,IntentActivity.class);
				
				TaskStackBuilder taskbuilder = TaskStackBuilder.create(MainActivity.this);
				taskbuilder.addParentStack(IntentActivity.class);
				
				taskbuilder.addNextIntent(intent);
				
				PendingIntent pendingintent = 
				taskbuilder.getPendingIntent(1,PendingIntent.FLAG_UPDATE_CURRENT);
				
				builder.setContentIntent(pendingintent);
				
				Notification notification =  builder.build();
				NotificationManager notifymgr =
				(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
				
				notifymgr.notify(1, notification);		
			}
		});
	}

	
}
