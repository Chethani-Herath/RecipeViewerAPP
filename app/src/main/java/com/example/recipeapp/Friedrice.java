package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Friedrice extends AppCompatActivity {
    Button friedriceplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friedrice);
        friedriceplayer = (Button)findViewById(R.id.playFriedRice);
        friedriceplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Friedrice.this, FriedRiceVideo.class));
            }
        });
    }
}
