package com.example.popmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button popupmenubutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		popupmenubutton = (Button) findViewById(R.id.button1);
		
		popupmenubutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				PopupMenu popup = new PopupMenu(MainActivity.this,popupmenubutton);
				getMenuInflater().inflate(R.menu.popup, popup.getMenu());
				popup.setOnMenuItemClickListener(new OnMenuItemClickListener() {
					
					@Override
					public boolean onMenuItemClick(MenuItem arg0) {
						if(arg0.getItemId()==R.id.Reply)
						{
							Toast.makeText(MainActivity.this,"Reply....",Toast.LENGTH_SHORT).show();
						}
						return false;
					}
				});
				
				popup.show();	
				
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
