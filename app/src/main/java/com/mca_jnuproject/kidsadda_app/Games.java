package com.mca_jnuproject.kidsadda_app;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class Games extends AppCompatActivity {

    private View mGameSlamDunk, mGameTicTac, mGameTetroid, mGameRabbitSamurai, mGameWordSearch;
    public static final String link = "CoolMathGames";
    public static final String name = "GamesName";
    private Context context = this;
    private ImageView Games_backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        mGameSlamDunk = (View) findViewById(R.id.game_slamdunk);
        mGameTicTac = (View) findViewById(R.id.game_tictac);
        mGameTetroid = (View) findViewById(R.id.game_tetroid);
        mGameRabbitSamurai = (View) findViewById(R.id.game_rabbitninja);
        mGameWordSearch = (View) findViewById(R.id.game_wordsearch);
        Games_backbtn = (ImageView) findViewById(R.id.games_backBtn);

        mGameSlamDunk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isNetworkAvailable()) {
                    Intent i = new Intent(context, Check_Internet.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(i);
                    Toast.makeText(context, "Internet Connection not found !!", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(context, GamesWebView.class);
                    i.putExtra(link, "https://m.coolmathgames.com/0-slam-dunk-brush/play/");
                    i.putExtra(name, "Slam Dunk");
                    startActivity(i);
                }
            }
        });

        mGameTicTac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isNetworkAvailable()) {
                    Intent i = new Intent(context, Check_Internet.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(i);
                    Toast.makeText(context, "Internet Connection not found !!", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(context, GamesWebView.class);
                    i.putExtra(link, "https://m.coolmathgames.com/0-tic-tac-toe/play/");
                    i.putExtra(name, "Tic Tac Toe");
                    startActivity(i);
                }
            }
        });

        mGameTetroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isNetworkAvailable()) {
                    Intent i = new Intent(context, Check_Internet.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(i);
                    Toast.makeText(context, "Internet Connection not found !!", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(context, GamesWebView.class);
                    i.putExtra(link, "https://m.coolmathgames.com/0-tetroid-3/play/");
                    i.putExtra(name, "Tetroid 3");
                    startActivity(i);
                }
            }
        });

        mGameRabbitSamurai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isNetworkAvailable()) {
                    Intent i = new Intent(context, Check_Internet.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(i);
                    Toast.makeText(context, "Internet Connection not found !!", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(context, GamesWebView.class);
                    i.putExtra(link, "https://m.coolmathgames.com/0-rabbit-samurai/play/");
                    i.putExtra(name, "Rabbit Samurai");
                    startActivity(i);
                }
            }
        });

        mGameWordSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isNetworkAvailable()) {
                    Intent i = new Intent(context, Check_Internet.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(i);
                    Toast.makeText(context, "Internet Connection not found !!", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(context, GamesWebView.class);
                    i.putExtra(link, "https://m.coolmathgames.com/0-word-search/play/");
                    i.putExtra(name, "Word Search");
                    startActivity(i);
                }
            }
        });

        Games_backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                finish();
            }
        });

    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onBackPressed() {
        this.finish();
        super.onBackPressed();
    }
}