package com.jspiders.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView statetextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		statetextview = (TextView) findViewById(R.id.textViewstate);
		statetextview.setText("Inside Oncreate()");
		Toast.makeText(MainActivity.this,"Inside Oncreate()",Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		statetextview.setText("Inside OnStart()");
		Toast.makeText(MainActivity.this,"Inside OnStart()",Toast.LENGTH_SHORT).show();
	}
	
@Override
protected void onResume() {
	// TODO Auto-generated method stub
	super.onResume();
	statetextview.setText("Inside onResume()");
	Toast.makeText(MainActivity.this,"Inside OnResume()",Toast.LENGTH_SHORT).show();
}


@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	statetextview.setText("Inside onPause()");
	Toast.makeText(MainActivity.this,"Inside OnPause()",Toast.LENGTH_SHORT).show();
}

@Override
protected void onStop() {
	// TODO Auto-generated method stub
	super.onStop();
	statetextview.setText("Inside onStop()");
	Toast.makeText(MainActivity.this,"Inside OnStop()",Toast.LENGTH_SHORT).show();
}

@Override
protected void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();
	statetextview.setText("Inside onDestroy()");
	Toast.makeText(MainActivity.this,"Inside OnDestroy()",Toast.LENGTH_SHORT).show();
}
}




