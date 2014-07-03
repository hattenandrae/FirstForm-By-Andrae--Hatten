package com.example.firstform;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// On the main view we set EditText to be find by view id...
	public void DoIt(View DaView) {
		Intent myintent = new Intent(this, InputInfo.class);
		EditText fullName = (EditText)findViewById(R.id.fname);
		EditText DOB = (EditText)findViewById(R.id.Birth);
		EditText locate = (EditText)findViewById(R.id.Address);
		EditText number = (EditText)findViewById(R.id.Phone);
		EditText emailAddress = (EditText)findViewById(R.id.Email);
		EditText currentAge = (EditText)findViewById(R.id.Age);
		
		
		
		
		
		//Get text from the EditText
		myintent.putExtra("Name", fullName.getText().toString());
		myintent.putExtra("DateOFBirth", DOB.getText().toString());
		myintent.putExtra("FindAddress", locate.getText().toString());
		myintent.putExtra("InternetMail", emailAddress.getText().toString());
		myintent.putExtra("Digit", number.getText().toString());
		myintent.putExtra("HowOld", currentAge.getText().toString());
		
		startActivity(myintent);
		
	}
}
