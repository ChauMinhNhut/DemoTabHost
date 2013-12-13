package com.jsonCorp.demotabhost;

import android.app.Activity;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class Main_2 extends Activity {

	/**
	 * Tuy theo minh extends tu dau: Activity, TabActivity, ActivityGroup ma phai truyen tham so cho ham setup cho phu hop
	 * 
	 * Neu moi tab con mo 1 activity, neu muon mo 1 fragment thi nen ke thua tu FragmentActivity
	 * 
	 * @author Chau Minh Nhut
	 * @date 12/12/2013
	 * @version 1.0
	 * 
	 */
	private TabHost mTabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_view_2);

		mTabHost = (TabHost) findViewById(android.R.id.tabhost);

		LocalActivityManager localManager = new LocalActivityManager(this,
				false);
		localManager.dispatchCreate(savedInstanceState);
		mTabHost.setup(localManager);

		mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Tab1")
				.setContent(new Intent().setClass(this, ClassTab1.class)));

		mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Tab2")
				.setContent(new Intent(this, ClassTab2.class)));

		mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("Tab3")
				.setContent(new Intent(this, ClassTab3.class)));

	}
}
