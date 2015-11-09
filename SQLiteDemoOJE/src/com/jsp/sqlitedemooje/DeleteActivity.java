package com.jsp.sqlitedemooje;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DeleteActivity extends Activity {

	EditText usernameET;
	Button deletebutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_delete);
		
		
		usernameET = (EditText) findViewById(R.id.editTextdeleteaprofile);
		deletebutton = (Button) findViewById(R.id.buttondeleterec);
		
		deletebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
			    String entusername = usernameET.getText().toString();
				DBoperations dbo = new DBoperations(DeleteActivity.this);
			    dbo.deleteprofile(dbo, entusername);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



}
