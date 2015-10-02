package com.jsp.intent1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button sendbuton;
	TextView msgtextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sendbuton = (Button) findViewById(R.id.buttonstart);
		msgtextview = (TextView) findViewById(R.id.textViewmsg);
		
		
		sendbuton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				startActivityForResult(intent,1);
				
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode,
			Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if (resultCode == RESULT_OK)
		{
		Bundle b1 =  data.getExtras();
		String s1 = b1.getString("Key1");
		msgtextview.setText(s1);
		}
		
		else if(resultCode == RESULT_CANCELED)
		{
			msgtextview.setText("ERROR");
		}
		
	}

}









