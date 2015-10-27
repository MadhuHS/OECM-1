package com.example.demo_service;

import android.app.IntentService;
import android.content.Intent;

public class InSevice extends IntentService {

	public InSevice(String name) {
		super("Worker thread");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onHandleIntent(Intent arg0) 
	{
		// TODO Auto-generated method stub

	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return super.onStartCommand(intent, flags, startId);
	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
