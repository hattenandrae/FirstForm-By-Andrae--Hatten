package com.example.firstform;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.widget.TextView;

public class InputInfo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_input_info);
		Intent intent = getIntent();
		
		//Receive the getextra from the intent string
		String DateOFBirth = intent.getStringExtra("DateOFBirth");
		String FindAddress = intent.getStringExtra("FindAddress");
		String Name = intent.getStringExtra("Name");
		String InternetMail = intent.getStringExtra("InternetMail");
		String Digit = intent.getStringExtra("Digit");
		String HowOld = intent.getStringExtra("HowOld");
		
		//Set text to the label on activity_input_info.xml
		TextView TV = (TextView)findViewById(R.id.UserInput);
		TV.setText(Name);
		
		TextView CA = (TextView)findViewById(R.id.UserAge);
		CA.setText(HowOld);
		
		TextView PN = (TextView)findViewById(R.id.UserPhone);
		PN.setText(Digit);
		
		TextView FA = (TextView)findViewById(R.id.UserAddress);
		FA.setText(FindAddress);
		
		TextView DB = (TextView)findViewById(R.id.UserDOB);
		DB.setText(DateOFBirth);
		
		TextView EM = (TextView)findViewById(R.id.UserEmail);
		EM.setText(InternetMail);
		
		//Setting for the app to saving data/ a form a storage
		SharedPreferences prefs = this.getSharedPreferences("com.example.firstform", Context.MODE_PRIVATE);
		prefs.edit().putString("NameFull", Name).commit();
		
		//SharedPreferences prefs = this.getSharedPreferences("com.example.firstform", Context.MODE_PRIVATE);
		//prefs.edit().putString("AddressFind", FindAddress).commit();
		
//		SharedPreferences prefs = this.getSharedPreferences("com.example.firstform", Context.MODE_PRIVATE);
//		prefs.edit().putString("BDay", Name).commit();
		
//		SharedPreferences prefs = this.getSharedPreferences("com.example.firstform", Context.MODE_PRIVATE);
//		prefs.edit().putString("FindNumber", Name).commit();
		
//		SharedPreferences prefs = this.getSharedPreferences("com.example.firstform", Context.MODE_PRIVATE);
//		prefs.edit().putString("GotMail", Name).commit();
		
//		SharedPreferences prefs = this.getSharedPreferences("com.example.firstform", Context.MODE_PRIVATE);
//		prefs.edit().putString("NameFull", Name).commit();
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.input_info, menu);
		return true;
	}

}
