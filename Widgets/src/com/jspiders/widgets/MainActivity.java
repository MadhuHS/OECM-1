package com.jspiders.widgets;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener  {

    RadioButton radiobuttonoption1;
    RadioGroup radiogroupselections;
    CheckBox checkboxselection1,checkboxselection2;
    ToggleButton togglebutton;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        radiobuttonoption1 = (RadioButton) findViewById(R.id.radioButtonoption1);
        radiogroupselections = (RadioGroup) findViewById(R.id.radioGroup1);
        checkboxselection1 = (CheckBox) findViewById(R.id.checkBoxselection1);
        checkboxselection2 = (CheckBox) findViewById(R.id.checkBoxselection2);
        togglebutton = (ToggleButton) findViewById(R.id.toggleButton);
        
        
        togglebutton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {
				// TODO Auto-generated method stub
				
				if(state)
				{
					Toast.makeText(MainActivity.this,"Toggle button is ON",Toast.LENGTH_SHORT).show();
				}
				
				else if (!state)
				{
					Toast.makeText(MainActivity.this,"Toggle button is OFF",Toast.LENGTH_SHORT).show();

				}
				
			}
		});
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        radiogroupselections.setOnCheckedChangeListener(MainActivity.this);
        
     
        checkboxselection1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) 
			{
				if(state)
				{
					Toast.makeText(MainActivity.this," Check box 1 is checked", Toast.LENGTH_SHORT).show();
				}
				
				else if (state==false)
				{
					Toast.makeText(MainActivity.this," Check box 1 is unchecked", Toast.LENGTH_SHORT).show();

				}
				
			}
		});
        
        //this is for radio button
        radiobuttonoption1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) 
			{
				if(state)
				{
					Toast.makeText(MainActivity.this,"You selected option 1",Toast.LENGTH_SHORT).show();                       
				}
			}
		});
	
	}

	//this is for radio group
	@Override
	public void onCheckedChanged(RadioGroup arg0, int id) 
	{
		switch (id) {
		
		case R.id.radioselection1:
			
			Toast.makeText(MainActivity.this,"Your selection selection 1",Toast.LENGTH_SHORT).show();
			
			break;
			
         case R.id.radioselection2:
			
			Toast.makeText(MainActivity.this,"Your selection selection 2",Toast.LENGTH_SHORT).show();
			
			break;

         case R.id.radioselection3:
 			
 			Toast.makeText(MainActivity.this,"Your selection selection 3",Toast.LENGTH_SHORT).show();
 			
 			break;
         case R.id.radioselection4:
 			
 			Toast.makeText(MainActivity.this,"Your selection selection 4",Toast.LENGTH_SHORT).show();
 			
 			break;
		default:
			break;
		}
		
	}
	
	
    
}
