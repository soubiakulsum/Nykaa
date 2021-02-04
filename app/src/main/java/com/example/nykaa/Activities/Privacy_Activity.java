package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.nykaa.R;

public class Privacy_Activity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_);

        webView=findViewById(R.id.PrivacyWeb);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.nykaafashion.com/lp/privacy-policy-india");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

}
