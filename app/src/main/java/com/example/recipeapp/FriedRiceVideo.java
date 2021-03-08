package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class FriedRiceVideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView friedriceplayer;
    String fricekey="AIzaSyBvNQremVJ8WtpVF3BaK-vL1KfF8qk91Mg";
    String friceid="GF0TcqFW16U";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fried_rice_video);
        friedriceplayer = (YouTubePlayerView)findViewById(R.id.video_friedrice);
        friedriceplayer.initialize(fricekey,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        if (wasRestored !=true){
            youTubePlayer.cueVideo(friceid);
            youTubePlayer.play();

        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
