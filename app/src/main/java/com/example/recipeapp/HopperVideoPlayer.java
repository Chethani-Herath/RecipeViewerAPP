package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class HopperVideoPlayer extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView Hopperplayer;
    String keyHop = "AIzaSyBwO3JWWNN1WDC8sPT-XMuqbl-4lSiWv68";
    String idHop = "a89iI1lXaSM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hopper_video_player);
        Hopperplayer =(YouTubePlayerView)findViewById(R.id.video_hopper);
        Hopperplayer.initialize(keyHop,this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
           if (wasRestored !=true){
               youTubePlayer.cueVideo(idHop);
               youTubePlayer.play();
           }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
