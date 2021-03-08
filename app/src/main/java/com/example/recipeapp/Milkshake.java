package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Milkshake extends AppCompatActivity {
    Button milkshakebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milkshake);
        milkshakebtn = (Button)findViewById(R.id.playMilkshake);
        milkshakebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Milkshake.this , MilkshakeVideo.class));
            }
        });
    }
}
