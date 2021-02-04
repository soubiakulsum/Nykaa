package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.nykaa.R;

public class Shipping_Activity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping_);

        webView=findViewById(R.id.ShippingWeb);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.nykaafashion.com/shipping-and-return-policy.html?root=footer");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    }
