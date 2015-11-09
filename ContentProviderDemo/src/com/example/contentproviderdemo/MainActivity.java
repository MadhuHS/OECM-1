package com.example.contentproviderdemo;

import java.net.URI;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView nametextview,numbertextvTextView;
	Button showcontactsbutton,addconbutton;
	ListView lv;
	String name;
	String phoneNumber;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lv= (ListView) findViewById(R.id.listView1);
		
		showcontactsbutton = (Button) findViewById(R.id.buttonreadcontact);
		nametextview = (TextView) findViewById(R.id.textViewdisplaycontactname);
		numbertextvTextView = (TextView) findViewById(R.id.textViewdisplaycontactnumber);
		addconbutton = (Button) findViewById(R.id.buttonpickcontact);
		showcontactsbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
			
				Cursor cursor =  getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null, null, null);
				cursor.moveToFirst();
				do
				{
				
				String[] from = {ContactsContract.Contacts.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER};
				int[] to = {R.id.textViewnames,R.id.textViewcontactnumber};
				SimpleCursorAdapter adapter = new SimpleCursorAdapter(MainActivity.this,R.layout.list,cursor, from,to,0);
			    lv.setAdapter(adapter);
				
				
				}while(cursor.moveToNext());
			
			}
		});
	
	addconbutton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) 
		{
			Intent contactintent = new Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI);
			startActivityForResult(contactintent,1);
		}
	});
	
	
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(resultCode == RESULT_OK)
		{
			Uri contacturi= data.getData();
			
			Cursor cursor =  getContentResolver().query(contacturi, null,null,null,null);
		
			
			
			
			
			/*String name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
		
			nametextview.setText(name);*/
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
