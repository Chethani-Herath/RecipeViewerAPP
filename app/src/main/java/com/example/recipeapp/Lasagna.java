package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lasagna extends AppCompatActivity {
    Button lasagnabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lasagna);
        lasagnabtn = (Button)findViewById(R.id.playLasagna);
        lasagnabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lasagna.this , LasagnaVideo.class));
            }
        });
    }
}
