package com.classicandsacrum;
/*
    Por Dante Castelán Carpinteyro, para Classic and Sacrum;
    Prácticas Profesionales;
    Creada el 23 de octubre del 2022;
*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private WebSettings myWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = findViewById(R.id.classic);
        myWebView.loadUrl("https://classicandsacrum.com/");
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.setWebChromeClient(new WebChromeClient());

        myWebSettings = myWebView.getSettings();

        myWebSettings.setJavaScriptEnabled(true);
        myWebSettings.setDomStorageEnabled(true);
        //myWebSettings.getAllowFileAccess(true);


        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.getSettings().setAllowFileAccess(true);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        myWebView.clearCache(false);

        myWebSettings.getJavaScriptCanOpenWindowsAutomatically();
        myWebSettings.setLoadWithOverviewMode(true);
        myWebSettings.setSupportMultipleWindows(true);
        myWebSettings.getAllowContentAccess();
        myWebSettings.setAllowUniversalAccessFromFileURLs(true);


    }

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}