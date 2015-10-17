package com.example.menus1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText messageedittext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		messageedittext = (EditText) findViewById(R.id.editTextmessage);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		if(item.getItemId()==R.id.Share)
		{
			String inputmsg = messageedittext.getText().toString();
			Intent shareintent = new Intent(Intent.ACTION_SEND);
			shareintent.setType("text/plain");
			shareintent.putExtra(Intent.EXTRA_TEXT, inputmsg);
			startActivity(Intent.createChooser(shareintent, "Share via"));
		}
		return super.onOptionsItemSelected(item);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
