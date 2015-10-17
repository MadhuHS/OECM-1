package com.example.menus;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText message;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		message = (EditText) findViewById(R.id.editText1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		if(item.getItemId()==R.id.Share)
		{
			String recvmsg = message.getText().toString();
			//Toast.makeText(MainActivity.this,"You clicked on share",Toast.LENGTH_SHORT).show();
			Intent intent  = new Intent(android.content.Intent.ACTION_SEND);
			intent.setType("text/plain");
			//intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "This is share subject");
			intent.putExtra(android.content.Intent.EXTRA_TEXT,recvmsg);
			startActivity(Intent.createChooser(intent,"Share via"));
		}
		
		
		return super.onOptionsItemSelected(item);
	}

}
