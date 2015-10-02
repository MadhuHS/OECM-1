package com.jspiders.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

	TextView outputtextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		outputtextview = (TextView) findViewById(R.id.textViewoutput);
		
		Intent intent= getIntent();
		Bundle b1 = intent.getExtras();
		String s1 =b1.getString("Key1");
		outputtextview.setText(s1);
		
	}


}
