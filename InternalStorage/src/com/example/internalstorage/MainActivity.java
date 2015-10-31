package com.example.internalstorage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button savebutton,readbutton;
	EditText messageedittext;
	TextView contenttextview;
	private FileOutputStream fileOutputStream;
	private FileInputStream fileInputStream;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		savebutton = (Button) findViewById(R.id.buttonsave);
		readbutton = (Button) findViewById(R.id.buttonread);
		messageedittext = (EditText) findViewById(R.id.editTextmessage);
		contenttextview = (TextView) findViewById(R.id.textViewcontent);
		
		savebutton.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View arg0) 
			{
				 String message =  messageedittext.getText().toString();
				 
		 try 
		 {
			fileOutputStream = openFileOutput("Demo1",Context.MODE_PRIVATE);
			fileOutputStream.write(message.getBytes());
			Toast.makeText(MainActivity.this,"File saved...",Toast.LENGTH_SHORT).show();
		} 
		 
		 catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 finally
		 {
			 try 
			 {
				fileOutputStream.close();
			} catch (IOException e) 
			{
				Toast.makeText(MainActivity.this,"Failed to save",Toast.LENGTH_SHORT).show();
				e.printStackTrace();
			}
		 }
				
			}
		});
		
		readbutton.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				try 
				{
					fileInputStream =  openFileInput("Demo1");
					InputStreamReader reader = new InputStreamReader(fileInputStream);
					BufferedReader bufferedReader = new BufferedReader(reader);
					StringBuffer buffer = new StringBuffer();
					String line = "";
					
					
					while((line = bufferedReader.readLine())!=null)
						{
						
							buffer.append(line+"\r\n");
						}
					
					contenttextview.setText(buffer.toString());
					
				} 
				
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				finally
				{
					try {
						fileInputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
