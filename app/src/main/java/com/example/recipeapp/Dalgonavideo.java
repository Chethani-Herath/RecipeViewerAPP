package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Dalgonavideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView dalgonaplayer;
    String dalgonakey="AIzaSyDiHpR4hdAZtJPHS-xFKbFD-uEAjSbF-Hw";
    String dalgonaid="MRXhPsc7ESI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalgonavideo);
        dalgonaplayer = (YouTubePlayerView)findViewById(R.id.video_dalgona);
        dalgonaplayer.initialize(dalgonakey,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
     if (wasRestored !=true){
         youTubePlayer.cueVideo(dalgonaid);
         youTubePlayer.play();
     }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
