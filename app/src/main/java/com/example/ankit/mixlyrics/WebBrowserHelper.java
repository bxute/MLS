package com.example.ankit.mixlyrics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WebBrowserHelper extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser_helper);
        String url = getIntent().getExtras().getString("url");

        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl(url);
    }
}
