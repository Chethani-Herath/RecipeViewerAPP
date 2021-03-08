package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class DosaVideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView dosaplayer;
    String dosakey="AIzaSyAX7fTutBI2u-wc6J0bpR6DJn128wVZL3g";
    String dosaid="G2qdhgfwsAo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosa_video);
        dosaplayer=(YouTubePlayerView)findViewById(R.id.video_dosa);
        dosaplayer.initialize(dosakey,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestotred) {
      if (wasRestotred !=true){
          youTubePlayer.cueVideo(dosaid);
          youTubePlayer.play();
      }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
