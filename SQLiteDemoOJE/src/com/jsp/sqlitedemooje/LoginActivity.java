package com.jsp.sqlitedemooje;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

	EditText LAusername,LApassword;
	Button LAloginbutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		LAusername = (EditText) findViewById(R.id.editTextloginpageusn);
		LApassword = (EditText) findViewById(R.id.editTextloginpagepwd);
		LAloginbutton = (Button) findViewById(R.id.buttonloginpagelogin);
		
		LAloginbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				DBoperations dbo = new DBoperations(LoginActivity.this);
				Cursor cursor =  dbo.retriveinfo(dbo);
				
				
				cursor.moveToFirst();
				
				do
				{
					String dbUsername =  cursor.getString(0);
					String dbPassword = cursor.getString(1);
					
					if()
					
				}while( cursor.moveToNext());
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		
	}

	

}
