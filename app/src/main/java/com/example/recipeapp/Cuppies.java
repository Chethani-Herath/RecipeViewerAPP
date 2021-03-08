package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cuppies extends AppCompatActivity {
    Button cuppiesplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuppies);
        cuppiesplayer = (Button)findViewById(R.id.playCuppies);
        cuppiesplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cuppies.this , CuppiesVideo.class));

            }
        });
    }
}
