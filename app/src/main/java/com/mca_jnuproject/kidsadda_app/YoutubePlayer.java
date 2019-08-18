package com.mca_jnuproject.kidsadda_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubePlayer extends YouTubeBaseActivity {

    private YouTubePlayerView mPlayer;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    public static final String API_KEY="AIzaSyDEPVkjAIuOOChFBhmZTpMhmFPWUQ5-GpA";
    public String fetchedYoutubeId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_player);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        Intent i = getIntent();
        fetchedYoutubeId = i.getStringExtra("YoutubeId");

        mPlayer = (YouTubePlayerView) findViewById(R.id.youtubePlayer);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, final YouTubePlayer youTubePlayerMain, boolean wasRestored) {
                youTubePlayerMain.setShowFullscreenButton(false);
                if (!wasRestored) {

                    youTubePlayerMain.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                    youTubePlayerMain.setFullscreen(true);
                    youTubePlayerMain.cueVideo(fetchedYoutubeId);
                    //youTubePlayerMain.loadVideo("lGfWirQASMA");
                    //youTubePlayerMain.play();

                } else {
                    youTubePlayerMain.play();
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        };

        mPlayer.initialize(API_KEY, onInitializedListener);

    }

}
