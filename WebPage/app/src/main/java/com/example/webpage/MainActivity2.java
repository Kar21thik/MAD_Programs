package com.example.webpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity2 extends AppCompatActivity {
WebView we;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
we=findViewById(R.id.we);
we.setWebViewClient(new WebViewClient());
Intent i = getIntent();
String extra=i.getStringExtra("load");
    if( extra.equals("default12"))
    {
        we.loadUrl("https://www.google.com");
    }
    we.loadUrl(extra);
    }}