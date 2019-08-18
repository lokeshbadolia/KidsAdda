package com.mca_jnuproject.kidsadda_app;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;


import im.delight.android.webview.AdvancedWebView;


public class GamesWebView extends AppCompatActivity implements AdvancedWebView.Listener{

    private String fetchedLink, fetchedName;
    private TextView mGameName;
    private ImageView GameWebView_backBtn;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_web_view);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        mGameName = (TextView) findViewById(R.id.game_name);

        Intent i = getIntent();
        fetchedLink = i.getStringExtra(Games.link);
        fetchedName = i.getStringExtra(Games.name);

        mGameName.setText(fetchedName);

        AdvancedWebView webView = (AdvancedWebView) findViewById(R.id.webView);
        webView.setListener(this, this);

        WebSettings webSettings = webView.getSettings();
        // webSettings.setJavaScriptEnabled(true);

        webView.loadUrl(fetchedLink);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });

        GameWebView_backBtn = (ImageView) findViewById(R.id.gameWebView_backBtn);
        GameWebView_backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                finish();
            }
        });
    }

    @Override
    public void onPageStarted(String url, Bitmap favicon) {

    }

    @Override
    public void onPageFinished(String url) {

    }

    @Override
    public void onPageError(int errorCode, String description, String failingUrl) {

    }

    @Override
    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) {

    }

    @Override
    public void onExternalPageRequest(String url) {

    }

    @Override
    public void onBackPressed() {
        this.finish();
        super.onBackPressed();
    }
}