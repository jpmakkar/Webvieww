package com.example.hp2.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Webview extends AppCompatActivity {



    WebView wb;
    ProgressBar progressBar;

    public void w1() {
        wb = (WebView) findViewById(R.id.web);
        progressBar=(ProgressBar)findViewById(R.id.p1);
        WebViewClient cl = new WebViewClient();
        wb.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                progressBar.setProgress(progress);
                if (progress == 100) {
                    progressBar.setVisibility(View.GONE);
                    getSupportActionBar().hide();

                } else {
                    progressBar.setVisibility(View.VISIBLE);

                }
            }
        });
        wb.setWebViewClient(cl);
        wb.getSettings().setJavaScriptEnabled(true);
        String u = getIntent().getStringExtra("URL");
        wb.loadUrl(u);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_webview);
        w1();
    }}