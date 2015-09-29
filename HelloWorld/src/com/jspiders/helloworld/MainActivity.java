package com.jspiders.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    Button loginbutton,cancelbutton,signupbutton;
    EditText usernameedittext,passwordedittext;
    
   String stUsername = "user1";
   String stPassword = "1234";
   String entUsername;
   String entpassword;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        loginbutton = (Button)findViewById(R.id.loginbutton);
        cancelbutton = (Button) findViewById(R.id.buttoncancel);
        signupbutton = (Button) findViewById(R.id.signupbutton);
        usernameedittext = (EditText)findViewById(R.id.usernameeditText);
        passwordedittext = (EditText) findViewById(R.id.passwordeditText);
        
        cancelbutton.setOnClickListener(this);
        
        
        signupbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				
				Log.d("[DEBUG]","clicked on sign up button");
				
			}
		});
        
    }

	public void login(View v1)
	{
		entUsername = usernameedittext.getText().toString();
		entpassword = passwordedittext.getText().toString();
		
		if(stUsername.equalsIgnoreCase(entUsername)&& stPassword.equals(entpassword))
		{
			Toast.makeText(this,"Login successfull",Toast.LENGTH_SHORT).show();
			Log.d("[DEBUG]","Login successfull");
		}
		
		else
		{
			Toast.makeText(this,"Login failed",Toast.LENGTH_SHORT).show();

			Log.d("[DEBUG]","Login failed");

		}
	}

	@Override
	public void onClick(View arg0) 
	{
		usernameedittext.setText("6788999");
		passwordedittext.setText("");
		Log.d("[DEBUG]","Clicked on cancel button");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

   
    
}
