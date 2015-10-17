package com.jsp.dialoges;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button alertbutton,loginbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		alertbutton = (Button) findViewById(R.id.button1);
		loginbutton = (Button) findViewById(R.id.buttonlogin);
	}


	public void alertdlg(View v)
	{
		String[] colors = {"Red","Green","Blue"};
	   AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
	   
	   builder.setTitle("Choose your color");
	   
	   builder.setMultiChoiceItems(colors,null, new OnMultiChoiceClickListener() {
		
		@Override
		public void onClick(DialogInterface arg0, int id, boolean arg2) 
		{
			ArrayList list  = new ArrayList();
			
			if(arg2==true)
			{
				list.add(id);
			}
			
			else if(list.contains(id))
			{
				list.remove(id);
			}
			
		}
	});
	   
	   AlertDialog dialog = builder.create();
	   dialog.show();
 
	}
	
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		if(keyCode == KeyEvent.KEYCODE_BACK)
		{
			AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
			   
			   builder.setTitle("This is Alert!!!");
			   builder.setMessage("Do you want to exit?");
			   builder.setPositiveButton("Yes",new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) 
				{
					finish();
					
				}
			});
			   
			   builder.setNegativeButton("No",new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) 
				{
					arg0.dismiss();
					
				}
			});
			   AlertDialog dialog = builder.create();
			   dialog.show();
		}
		
		return true;
	}
	
	public void login(View v)
	{
		View v1;
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
	    builder.setTitle("Login To App");
	    
	    LayoutInflater inflater = getLayoutInflater();
	    
	    v1 = inflater.inflate(R.layout.dialog,null);
	    builder.setView(v1);
	    
	    builder.setPositiveButton("Login", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
				
			}
		});
	    
	    builder.setNegativeButton("Cancel", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
		});
	    
	    AlertDialog dialog = builder.create();
		dialog.show();
	   
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
