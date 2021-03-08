package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MangoVideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView mangoplayer;
    String mangokey="AIzaSyC9Jola2nxSwgYebll1GtwXkskN9cj5x5E";
    String mangoid="kv9Qux0IEno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mango_video);
        mangoplayer = (YouTubePlayerView)findViewById(R.id.video_mango);
        mangoplayer.initialize(mangokey,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        if (wasRestored !=true){
            youTubePlayer.cueVideo(mangoid);
            youTubePlayer.play();
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
