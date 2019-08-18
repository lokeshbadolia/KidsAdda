package com.mca_jnuproject.kidsadda_app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class FunMaths extends AppCompatActivity {

    private Context context = this;
    private CardView mMathFirst, mMathSecond, mMathThird, mMathFourth;
    private ImageView mFunMathsBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_maths);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        mMathFirst = (CardView) findViewById(R.id.mathsFirst);
        mMathSecond = (CardView) findViewById(R.id.mathsSecond);
        mMathThird = (CardView) findViewById(R.id.mathsThird);
        mMathFourth = (CardView) findViewById(R.id.mathsFourth);

        mFunMathsBackBtn = (ImageView) findViewById(R.id.funMaths_backBtn);

        mMathFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","lGfWirQASMA");
                startActivity(i);
            }
        });

        mMathSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","JzrlIQkm60c");
                startActivity(i);
            }
        });

        mMathThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","8cR_1Qi-tP4");
                startActivity(i);
            }
        });


        mMathFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, R.anim.click_animate2));
                Intent i = new Intent(context, YoutubePlayer.class);
                i.putExtra("YoutubeId","67MffSE8Qaw");
                startActivity(i);
            }
        });

        mFunMathsBackBtn.setOnClickListener(new View.OnClickListener() {
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
