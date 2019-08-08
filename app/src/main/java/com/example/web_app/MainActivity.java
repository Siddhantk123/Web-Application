package com.example.web_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webview;

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {

            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setting();



    }
    public void setting(){
        webview = (WebView) findViewById(R.id.webview);

        WebSettings webSettings=webview.getSettings();

        webSettings.setJavaScriptEnabled(true);


        webview.setWebViewClient(new WebViewClient());

        webview.loadUrl("http://www.harshpreneur.com/");
    }
}
