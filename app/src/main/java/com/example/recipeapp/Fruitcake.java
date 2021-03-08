package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fruitcake extends AppCompatActivity {
    Button fruitcakeplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitcake);
        fruitcakeplayer = (Button)findViewById(R.id.playFruitcake);
        fruitcakeplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fruitcake.this , FruitcakeVideo.class));
            }
        });
    }
}
