package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class IcecoffeVideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView Icecoffeplayer;
    String icecoffekey="AIzaSyD1Q1bcLljHWI9VVBZnX6-lE-QMavbcPpM";
    String icecoffeid="h5013DsFw8I";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecoffe_video);
        Icecoffeplayer =(YouTubePlayerView)findViewById(R.id.video_icecoffe);
        Icecoffeplayer.initialize(icecoffekey,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        if (wasRestored !=true){
            youTubePlayer.cueVideo(icecoffeid);
            youTubePlayer.play();

        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
