package com.jspiders.intents;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button startbutton;
	EditText inputedittext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startbutton = (Button) findViewById(R.id.buttonstart);
		inputedittext = (EditText) findViewById(R.id.editTextinput);
		startbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				String i1 = inputedittext.getText().toString();
				
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("Key1",i1);
				startActivity(intent);
				
			}
		});
	}

}







