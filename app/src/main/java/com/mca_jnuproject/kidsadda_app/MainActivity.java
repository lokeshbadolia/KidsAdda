package com.mca_jnuproject.kidsadda_app;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import net.cachapa.expandablelayout.ExpandableLayout;

public class MainActivity extends AppCompatActivity {

    private boolean doubleBackToExitPressedOnce = false;

    private View mMusicBtn, mMathsBtn, mGamesBtn, mQuizBtn;
    private View mPrayerBtn, mRhymesBtn, mTableBtn, mFunMathsBtn;
    private Context context = this;

    private View mMusicMainView;
    private ExpandableLayout mHideMusic;

    private View mMathsMainView;
    private ExpandableLayout mHideMaths;
    public boolean isMusicDown;
    public boolean isMathsDown;

    public ImageView mMainBSBtn;

    private NavigationView navigation;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        mMusicBtn = (View) findViewById(R.id.musicBtn);
        mMathsBtn = (View) findViewById(R.id.mathsBtn);
        mGamesBtn = (View) findViewById(R.id.gamesBtn);
        mQuizBtn = (View) findViewById(R.id.quizBtn);

        mPrayerBtn = (View) findViewById(R.id.prayerBtn);
        mRhymesBtn = (View) findViewById(R.id.rhymesBtn);
        mTableBtn = (View) findViewById(R.id.tableBtn);
        mFunMathsBtn = (View) findViewById(R.id.funMathsBtn);

        mMusicMainView = (View) findViewById(R.id.musicMainView);
        mHideMusic = (ExpandableLayout) findViewById(R.id.hideMusic);

        mMathsMainView = (View) findViewById(R.id.mathsMainView);
        mHideMaths = (ExpandableLayout) findViewById(R.id.hideMaths);

        mMainBSBtn = (ImageView) findViewById(R.id.mainBSBtn);

        isMusicDown = false;
        isMathsDown = false;

        mDrawerLayout = (DrawerLayout) findViewById(R.id.mainDrawer);
        mToggle = new ActionBarDrawerToggle(MainActivity.this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        mMainBSBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                if (mDrawerLayout.isDrawerVisible(GravityCompat.START)) {
                    mDrawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    mDrawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

        navigation = (NavigationView) findViewById(R.id.navDrawer);
        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.nav_contact:
                        Intent EmailIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "scss@jnujaipur.ac.in"));
                        EmailIntent.putExtra(Intent.EXTRA_SUBJECT, "");
                        EmailIntent.putExtra(Intent.EXTRA_TEXT, "");
                        startActivity(EmailIntent);
                        break;
                    case R.id.nav_contributors:
                        Intent profilePageIntent = new Intent(MainActivity.this, Games.class);
                        profilePageIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(profilePageIntent);
                        break;
                }
                mDrawerLayout.closeDrawer(GravityCompat.START);//Close Drawer after item select
                return true;
            }
        });


        mMusicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                MusicBtnFun();
                if (isMathsDown) {
                    MathsBtnFun();
                }
            }
        });

        mPrayerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Prayer.class);
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                startActivity(i);
            }
        });

        mRhymesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Rhymes.class);
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                startActivity(i);
            }
        });

        mMathsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                MathsBtnFun();
                if (isMusicDown) {
                    MusicBtnFun();
                }
            }
        });

        mTableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Table.class);
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                startActivity(i);
            }
        });

        mFunMathsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, FunMaths.class);
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                startActivity(i);
            }
        });

        mGamesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Games.class);
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                startActivity(i);
            }
        });

        mQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, GeneralQuestion.class);
                view.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate));
                startActivity(i);
            }
        });

    }

    public void MusicBtnFun() {
        if (!isMusicDown) {
            mHideMusic.expand();
            isMusicDown = true;
        } else {
            mHideMusic.collapse();
            isMusicDown = false;
        }
    }

    public void MathsBtnFun() {
        if (!isMathsDown) {
            mHideMaths.expand();
            isMathsDown = true;
        } else {
            mHideMaths.collapse();
            isMathsDown = false;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (!isNetworkAvailable()) {
            Intent i = new Intent(MainActivity.this, Check_Internet.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(i);
            Toast.makeText(MainActivity.this, "Internet Connection not found !!", Toast.LENGTH_LONG).show();
        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            //super.onBackPressed();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//***Change Here***
            startActivity(intent);
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Click again to Exit.", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }


}