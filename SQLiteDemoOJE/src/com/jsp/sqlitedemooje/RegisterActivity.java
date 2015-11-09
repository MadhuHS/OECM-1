package com.jsp.sqlitedemooje;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity {

	EditText usernameET,passwordET;
	Button registerbutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		registerbutton = (Button) findViewById(R.id.buttonregister);
		usernameET = (EditText) findViewById(R.id.editTextloginpageusn);
		passwordET = (EditText) findViewById(R.id.editTextloginpagepwd);
		
		
		registerbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				DBoperations dbop = new DBoperations(RegisterActivity.this);
				dbop.insertusnpwd(dbop,usernameET.getText().toString(),passwordET.getText().toString());
				
			}
		});
		
	}


}
