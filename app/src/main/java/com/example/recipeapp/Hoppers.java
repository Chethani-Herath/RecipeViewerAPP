package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hoppers extends AppCompatActivity {

    Button hopperbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoppers);
        hopperbtn = (Button)findViewById(R.id.playHopper);
        hopperbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hoppers.this, HopperVideoPlayer.class));


            }
        });
    }
}
