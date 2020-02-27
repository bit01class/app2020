package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView=findViewById(R.id.webView);
        WebSettings setting = webView.getSettings();
        setting.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
//        webView.loadUrl("https://demos.jquerymobile.com/1.4.5/");
//        webView.loadData("<h1>test</h1>","text/html; charset=utf-8",null);
        webView.loadUrl("file:///android_asset/html/main.html");
    }
}
