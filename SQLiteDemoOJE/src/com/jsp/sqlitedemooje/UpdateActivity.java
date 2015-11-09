package com.jsp.sqlitedemooje;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class UpdateActivity extends Activity {

	EditText newusernameET,newpasswordET;
	Button updatebutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update);
		
		newusernameET = (EditText) findViewById(R.id.editTextnewusername);
		newpasswordET = (EditText) findViewById(R.id.editTextnewpassword);
		updatebutton = (Button) findViewById(R.id.buttonupdaterec);
		
		
		updatebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				DBoperations dbo = new DBoperations(UpdateActivity.this);
				dbo.updateprofile(dbo,newusernameET.getText().toString(), 
						          newpasswordET.getText().toString());
				
			}
		});
		
		
		
		
		
		
		
		
		
	}


}
