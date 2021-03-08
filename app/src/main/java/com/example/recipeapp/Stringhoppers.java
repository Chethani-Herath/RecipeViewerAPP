package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stringhoppers extends AppCompatActivity {
    Button Shopperbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stringhoppers);
        Shopperbtn = (Button)findViewById(R.id.playStringhopper);
        Shopperbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Stringhoppers.this , StringHopperVideo.class));

            }
        });
    }
}
