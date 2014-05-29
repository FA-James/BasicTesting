package com.example.basicapplock;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	 private EditText password;
	  private Button btnSubmit;
	 
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
	 
		addListenerOnButton();
	 
	  }
	 
	  public void addListenerOnButton() {
	 
		password = (EditText) findViewById(R.id.txtPassword);	
		btnSubmit = (Button) findViewById(R.id.btnSubmit);
	 
		btnSubmit.setOnClickListener(new OnClickListener() {
	 
			public void onClick(View v) {
	 
			  Toast.makeText(MainActivity.this, password.getText(),
				Toast.LENGTH_SHORT).show();
	 
			}
	 
		});
	 
	  }
}
