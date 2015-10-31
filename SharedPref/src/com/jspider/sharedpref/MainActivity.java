package com.jspider.sharedpref;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button loginbutton,loadbutton;
	EditText username,password;
	CheckBox rmbrpwd;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		loginbutton = (Button) findViewById(R.id.buttonlogin);
		loadbutton = (Button) findViewById(R.id.button1);
		
		username = (EditText) findViewById(R.id.editTextusername);
		password = (EditText) findViewById(R.id.editTextpassword);
		rmbrpwd = (CheckBox) findViewById(R.id.checkBoxremember);
		
		loginbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				String eUsername = username.getText().toString();
				String ePassword = password.getText().toString();
				
				SharedPreferences pref = getSharedPreferences("MyCred",Context.MODE_PRIVATE);
				SharedPreferences.Editor editor = pref.edit();
				editor.putString("username", eUsername);
				editor.putString("password", ePassword);
				editor.commit();
				
			}
		});
		
		
		loadbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				SharedPreferences pref = getSharedPreferences("MyCred",Context.MODE_PRIVATE);
				String spUsername =  pref.getString("username","n/a");
				String spPassword =  pref.getString("password","n/a");
				
				username.setText(spUsername);
				password.setText(spPassword);
				
				Toast.makeText(MainActivity.this, "Load completed",Toast.LENGTH_SHORT).show();
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
