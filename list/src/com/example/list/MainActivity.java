package com.example.list;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView phoneslistview;
	GridView phonesgridview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid);
		
		final String[] phones = {"HTC","SONY","SAMSUNG","REDMI","LAVA","MOTO","NEXUS","LENOVO","ASUS"};
		
		phoneslistview = (ListView) findViewById(R.id.listView1);
		phonesgridview = (GridView) findViewById(R.id.gridView1);
		
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,phones);
		/*//phoneslistview.setAdapter(adapter);
		
		//phoneslistview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				
				Toast.makeText(MainActivity.this,"You selected "+phones[position],Toast.LENGTH_SHORT).show();
				
			}
		});*/
	
		phonesgridview.setAdapter(adapter);
	
	
	}


	
	
	
	
	
	
	

}
