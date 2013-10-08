package de.repat.simplemrbsapp;

import de.repat.simplemrbsapp.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebView;

public class MainActivity extends Activity {

	private WebView myWebView;
	// TODO --- CHANGE ME ---
	private final String SIMPLE_MRBS_OUTPUT_URL = "http://URL/simple-mrbs-output.php";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Landscape Mode
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

		// Screensaver deactivated
		getWindow().addFlags(LayoutParams.FLAG_KEEP_SCREEN_ON);

		// No title
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		// Fullscreen
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// Start view
		setContentView(R.layout.activity_main);

		// Put website in "frame"
		myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.loadUrl(SIMPLE_MRBS_OUTPUT_URL);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return true;
	}
}
