package com.rekmob.exampleApp;

import com.rekmob.ads.RekmobView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	static final String REKMOB_ADUNIT_ID = "XXXXXX";
	RekmobView rekmobView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rekmobView = (RekmobView) findViewById(R.id.rekmobAdView);
		rekmobView.setAdUnitId(REKMOB_ADUNIT_ID);
		rekmobView.loadAd();
	}

	@Override
	protected void onDestroy() {
		if (rekmobView != null) {
			rekmobView.destroy();
		}
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
