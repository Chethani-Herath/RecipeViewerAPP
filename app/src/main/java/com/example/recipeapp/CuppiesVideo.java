package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class CuppiesVideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView cuppiesplayer;
    String cuppiedkey = "AIzaSyDXoipQMFILRvcXLVQkme5dGOBbA_b3GMo";
    String cuppiesid = "kt9xQjvSPcY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuppies_video);
        cuppiesplayer = (YouTubePlayerView)findViewById(R.id.cuppies_video);
        cuppiesplayer.initialize(cuppiedkey,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
       if (wasRestored !=true){
           youTubePlayer.cueVideo(cuppiesid);
           youTubePlayer.play();

       }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
