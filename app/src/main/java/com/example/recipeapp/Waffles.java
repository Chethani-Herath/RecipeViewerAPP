package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Waffles extends AppCompatActivity {
    Button wafflebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waffles);
        wafflebtn = (Button)findViewById(R.id.playWaffles);
        wafflebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Waffles.this , WaffleVideo.class));
            }
        });
    }
}
