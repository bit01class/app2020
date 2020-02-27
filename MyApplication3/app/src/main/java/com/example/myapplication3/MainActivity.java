package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editUrl=findViewById(R.id.editUrl);
        Button goUrl=findViewById(R.id.goUrl);
        final ProgressBar bar=findViewById(R.id.bar01);
//        bar.setProgress(50);
//        bar.setVisibility(View.VISIBLE);
        webView=findViewById(R.id.wview01);
        WebSettings setting = webView.getSettings();
        setting.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                Log.d("bit","newProgress:"+newProgress);
                bar.setProgress(newProgress);
                if(newProgress==100){
                    bar.setVisibility(View.INVISIBLE);
                    checkForwordBack();
                }else{
                    bar.setVisibility(View.VISIBLE);
                }
            }
        });

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


        backUrl=findViewById(R.id.backUrl);
        backUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(webView.canGoBack())webView.goBack();
            }
        });

        forwordUrl=findViewById(R.id.forwordUrl);
        forwordUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(webView.canGoForward())webView.goForward();
            }
        });

    }
    Button forwordUrl;
    Button backUrl;
    public void checkForwordBack(){
        if(webView.canGoForward())forwordUrl.setEnabled(true);
        else forwordUrl.setEnabled(false);
        if(webView.canGoBack())backUrl.setEnabled(true);
        else backUrl.setEnabled(false);
    }
}
