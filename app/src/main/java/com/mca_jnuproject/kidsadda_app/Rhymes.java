package com.mca_jnuproject.kidsadda_app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Rhymes extends AppCompatActivity {

    private Context context = this;
    private CardView mRhymesFirst, mRhymesSecond, mRhymesThird, mRhymesFourth, mRhymesFifth, mRhymesSixth, mRhymesSeventh,
            mRhymesEight, mRhymesNinth, mRhymesTenth;
    private ImageView mRhymesBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhymes);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        mRhymesFirst = (CardView) findViewById(R.id.rhymesFirst);
        mRhymesSecond = (CardView) findViewById(R.id.rhymesSecond);
        mRhymesThird = (CardView) findViewById(R.id.rhymesThird);
        mRhymesFourth = (CardView) findViewById(R.id.rhymesFourth);
        mRhymesFifth = (CardView) findViewById(R.id.rhymesFifth);
        mRhymesSixth = (CardView) findViewById(R.id.rhymesSixth);
        mRhymesSeventh = (CardView) findViewById(R.id.rhymesSeventh);
        mRhymesEight = (CardView) findViewById(R.id.rhymesEight);
        mRhymesNinth = (CardView) findViewById(R.id.rhymesNinth);
        mRhymesTenth = (CardView) findViewById(R.id.rhymesTenth);

        mRhymesBackBtn = (ImageView) findViewById(R.id.rhymes_backBtn);


        mRhymesFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","AWYfMqHa_gM");
                startActivity(i);
            }
        });

        mRhymesSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","NjOetE6vJRc");
                startActivity(i);
            }
        });

        mRhymesThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","dzgq1JQp9VY");
                startActivity(i);
            }
        });


        mRhymesFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","y6xuET419-0");
                startActivity(i);
            }
        });

        mRhymesFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","ArWSw76xm1E");
                startActivity(i);
            }
        });


        mRhymesSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","F4tHL8reNCs");
                startActivity(i);
            }
        });

        mRhymesSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","nCqUYAnQF0o");
                startActivity(i);
            }
        });

        mRhymesEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","-ccCPcujnys");
                startActivity(i);
            }
        });

        mRhymesNinth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","ptXUH9vhCmA");
                startActivity(i);
            }
        });

        mRhymesTenth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","sUxTSW4hW2g");
                startActivity(i);
            }
        });


        mRhymesBackBtn.setOnClickListener(new View.OnClickListener() {
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