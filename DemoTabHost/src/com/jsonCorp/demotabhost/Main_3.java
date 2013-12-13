package com.jsonCorp.demotabhost;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main_3 extends Activity {

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.main_view_3);
	}

	public void showTabhostWithFragment(View v) {
		startActivity(new Intent(Main_3.this, Main_1.class));
	}

	public void showTabhostWithActivity(View v) {
		startActivity(new Intent(Main_3.this, Main_2.class));
	}
}
