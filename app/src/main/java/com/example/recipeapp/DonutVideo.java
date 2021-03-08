package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class DonutVideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView donutplayer;
    String donutkey="AIzaSyDyUAujZ-zKkqfO63AwEpBUxxAXLmb0x3Q";
    String donutid="8ZZoxJuxE3A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut_video);
        donutplayer=(YouTubePlayerView)findViewById(R.id.video_donut);
        donutplayer.initialize(donutkey,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
      if (wasRestored !=true){
          youTubePlayer.cueVideo(donutid);
          youTubePlayer.play();
      }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
