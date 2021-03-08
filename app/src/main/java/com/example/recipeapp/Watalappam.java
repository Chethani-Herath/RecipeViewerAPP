package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Watalappam extends AppCompatActivity {
    Button watalappanbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watalappam);
        watalappanbtn=(Button)findViewById(R.id.playWatalappan);
        watalappanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Watalappam.this , WatalappanVideo.class));
            }
        });
    }
}
