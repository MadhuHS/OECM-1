package com.jsp.external;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button readbtn,saveBTN;
	TextView displayTV;
	EditText inputET;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		readbtn = (Button) findViewById(R.id.buttonread);
		saveBTN = (Button) findViewById(R.id.buttonsave);
		inputET = (EditText) findViewById(R.id.editText1);
		displayTV = (TextView) findViewById(R.id.textView1);
		
		
		saveBTN.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				String state =  Environment.getExternalStorageState();
				
				if(state.equalsIgnoreCase(Environment.MEDIA_MOUNTED))
				{
					File root = Environment.getExternalStorageDirectory();
					
					File dir = new File(root,"MyAppDir");
					
					if(!dir.exists())
					{
					  dir.mkdir();
					}
					
					File file =  new File(dir,"Mydemo3");
					
					try 
					{
					    String inputmsg = inputET.getText().toString();
						FileOutputStream fos = new FileOutputStream(file);
						fos.write(inputmsg.getBytes());
						fos.close();
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				else
				{
					
				}
				
			}
		});
		
		
		readbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				
               String state =  Environment.getExternalStorageState();
				
				if(state.equalsIgnoreCase(Environment.MEDIA_MOUNTED))
				{
					File root = Environment.getExternalStorageDirectory();
					
					File dir = new File(root,"MyAppDir");
					
					File file = new File(dir, "Mydemo3");
					
					try 
					{
						FileInputStream fis = new FileInputStream(file);
						InputStreamReader inputStreamReader = new InputStreamReader(fis);
						BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
						
						StringBuffer buffer = new StringBuffer();
						String line = "";
						
						
						while((line = bufferedReader.readLine())!=null)
						{
							buffer.append(line+"\r\n");
						}
						
						displayTV.setText(buffer.toString());

						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
				
				else
				{
					
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
