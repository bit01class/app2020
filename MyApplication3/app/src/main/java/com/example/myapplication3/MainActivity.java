package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editUrl=findViewById(R.id.editUrl);
        Button goUrl=findViewById(R.id.goUrl);

        final WebView webView=findViewById(R.id.wview01);
        WebSettings setting = webView.getSettings();
        setting.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        goUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=editUrl.getText().toString();
                if(!url.startsWith("http")){
                    url="https://"+url;
                }
                webView.loadUrl(url);
            }
        });


//        webView.loadData("<h1>test page</h1>","text/html;charset=utf-8",null);
    }
}
