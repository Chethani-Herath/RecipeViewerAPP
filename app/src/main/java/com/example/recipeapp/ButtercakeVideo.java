package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ButtercakeVideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView bcake;
    String buttercakekey="AIzaSyBHfiKrdKaRQIg7umMY9dUR7oWouHEhRyY";
    String buttercakeid="uTj5StPkymA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttercake_video);
        bcake = (YouTubePlayerView)findViewById(R.id.video_buttercake);
        bcake.initialize(buttercakekey,this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
     if (wasRestored !=true){
         youTubePlayer.cueVideo(buttercakeid);
         youTubePlayer.play();

     }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
