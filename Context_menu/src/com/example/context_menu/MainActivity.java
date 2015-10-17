package com.example.context_menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView contactslistview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String[] contacts = {"AAA","BBB","CCC","DDD","EEE","FFF"}; 
		contactslistview =(ListView) findViewById(R.id.listViewcontacts);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,contacts);
	    contactslistview.setAdapter(adapter);
	    registerForContextMenu(contactslistview);
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.setHeaderTitle("Choose your option");
		getMenuInflater().inflate(R.menu.context_menu, menu);
		
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		if(item.getItemId()==R.id.call)
		{
			Toast.makeText(MainActivity.this, "Calling....",Toast.LENGTH_SHORT).show();
		}
		return super.onContextItemSelected(item);
	}


}
