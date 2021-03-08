package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewLunch extends AppCompatActivity {
    CardView friedrice;
    CardView naasi;
    CardView lasagna;
    CardView salad;
    CardView pizza;
    CardView yellowrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_lunch);

        friedrice = findViewById(R.id.card_friedric);
        naasi = findViewById(R.id.card_naasi);
        lasagna = findViewById(R.id.card_lasagnaa);
        salad = findViewById(R.id.card_saladd);
        pizza = findViewById(R.id.card_pizza);
        yellowrice = findViewById(R.id.card_yellowrice);

        friedrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewLunch.this, Friedrice.class));

            }
        });

        naasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewLunch.this, Naasi.class));

            }
        });

        lasagna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewLunch.this, Lasagna.class));

            }
        });

        salad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewLunch.this, Salad.class));

            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewLunch.this, Pizza.class));

            }
        });

        yellowrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewLunch.this, Yellowrice.class));

            }
        });

    }
}
