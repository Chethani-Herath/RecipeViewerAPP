package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cake extends AppCompatActivity {
    CardView choco;
    CardView butter;
    CardView cuppies;
    CardView fruit;
    CardView lava;
    CardView brownies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);
        choco = findViewById(R.id.card_chocolatecake);
        butter = findViewById(R.id.card_buttercake);
        cuppies = findViewById(R.id.card_cuppies);
        fruit = findViewById(R.id.card_fruitcakee);
        lava = findViewById(R.id.card_lavacake);


        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cake.this, Chococake.class));

            }
        });

        butter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cake.this, Buttercake.class));

            }
        });

        cuppies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cake.this, Cuppies.class));

            }
        });

        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cake.this, Fruitcake.class));

            }
        });

        lava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cake.this, Lavacake.class));

            }
        });



    }
}
