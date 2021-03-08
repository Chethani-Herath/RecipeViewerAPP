package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MousseVide extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView mousseplayer;
    String moussekey="AIzaSyBvkPyuehzyHkZeGJVQ4i3bF8rqr6cSUk4";
    String mousseid="3eXycW1fZEI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mousse_vide);
        mousseplayer = (YouTubePlayerView)findViewById(R.id.video_mousse);
        mousseplayer.initialize(moussekey,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        if (wasRestored !=true){
            youTubePlayer.cueVideo(mousseid);
            youTubePlayer.play();
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
