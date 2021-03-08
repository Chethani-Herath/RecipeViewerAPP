package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Yellowrice extends AppCompatActivity {
    Button yellobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellowrice);
        yellobtn = (Button)findViewById(R.id.playYellorice);
        yellobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Yellowrice.this , YelloRiceVideo.class));
            }
        });
    }
}
