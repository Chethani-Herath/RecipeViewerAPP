package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Biscipudding extends AppCompatActivity {

    Button biscibtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biscipudding);
        biscibtn = (Button)findViewById(R.id.playBisci);
        biscibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Biscipudding.this,BisciPuddingVideo.class));
            }
        });
    }
}
