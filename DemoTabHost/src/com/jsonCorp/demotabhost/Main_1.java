package com.jsonCorp.demotabhost;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class Main_1 extends FragmentActivity {

	/**
	 * TabHost voi moi tab la 1 Fragment
	 * 
	 * @author Chau Minh Nhut
	 * @date 12/12/2013
	 * @version 1.0
	 */
	private FragmentTabHost mTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);

		mTabHost.setup(this, getSupportFragmentManager(), R.id.tabcontent1);

		mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Tab1"),
				Tab1Fragment.class, null);

		mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Tab2"),
				Tab2Fragment.class, null);

		mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("Tab3"),
				Tab3Fragment.class, null);

	}

}
