package com.mca_jnuproject.kidsadda_app;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class Prayer extends AppCompatActivity {

    private Context context = this;
    private CardView mPrayerFirst, mPrayerSecond, mPrayerThird, mPrayerFourth, mPrayerFifth, mPrayerSixth;
    private ImageView mPrayerBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        mPrayerFirst = (CardView) findViewById(R.id.prayerFirst);
        mPrayerSecond = (CardView) findViewById(R.id.prayerSecond);
        mPrayerThird = (CardView) findViewById(R.id.prayerThird);
        mPrayerFourth = (CardView) findViewById(R.id.prayerFourth);
        mPrayerFifth = (CardView) findViewById(R.id.prayerFifth);
        mPrayerSixth = (CardView) findViewById(R.id.prayerSixth);

        mPrayerBackBtn = (ImageView) findViewById(R.id.prayer_backBtn);

        mPrayerFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId", "5wvr39JlNMo");
                startActivity(i);
            }
        });

        mPrayerSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId", "xQqBieu7Dmg");
                startActivity(i);
            }
        });

        mPrayerThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId", "fXrn3Y-4848");
                startActivity(i);
            }
        });


        mPrayerFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId", "HBZvU4oy_8k");
                startActivity(i);
            }
        });

        mPrayerFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId", "Ju38Sdc2cSg");
                startActivity(i);
            }
        });


        mPrayerSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId", "O78UfDkGhRs");
                startActivity(i);
            }
        });


        mPrayerBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        this.finish();
        super.onBackPressed();
    }
}
