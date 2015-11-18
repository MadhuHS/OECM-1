package com.jsp.dynamic_fragments_demo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button startbutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startbutton = (Button) findViewById(R.id.button1);
		
		startbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				FragmentManager manager = getFragmentManager();
				FragmentTransaction transaction = manager.beginTransaction();
				
				DynamicFragment fragment = new DynamicFragment();
				transaction.add(R.id.main_activity, fragment);
				transaction.addToBackStack("f1");
				transaction.commit();
				
				

				
				
				
				
				
			}
		});
	}


}
