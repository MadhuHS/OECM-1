package com.jsp.sqlitedemooje;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button Signupbutton,loginbutton,updateinfobutton,deleteprofile;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Signupbutton = (Button) findViewById(R.id.buttonsignup);
		loginbutton = (Button) findViewById(R.id.buttonlogin);
		updateinfobutton = (Button) findViewById(R.id.buttoupdateinfo);
		deleteprofile = (Button) findViewById(R.id.buttondeleteprof);
	}
	
	
	public void registerpageactivity(View v)
	{
		Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
		startActivity(intent);
	}
	
	
	public void loginpageactivity(View v)
	{
		Intent intent = new Intent(MainActivity.this,LoginActivity.class);
		startActivity(intent);
	}
	
	
	public void updateactivity(View v)
	{
		Intent intent = new Intent(MainActivity.this,UpdateActivity.class);
		startActivity(intent);
	}
	
	public void deleteprofile(View v)
	{
		Intent intent = new Intent(MainActivity.this,DeleteActivity.class);
		startActivity(intent);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
