package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dessert extends AppCompatActivity {
    CardView bisci;
    CardView mousse;
    CardView caremal;
    CardView donut;
    CardView waffles;
    CardView watalappam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        bisci = findViewById(R.id.card_bisci);
        mousse = findViewById(R.id.card_mousse);
        caremal = findViewById(R.id.card_caramell);
        donut = findViewById(R.id.card_donutt);
        waffles = findViewById(R.id.card_waffles);
        watalappam = findViewById(R.id.card_watalappam);

        bisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dessert.this, Biscipudding.class));

            }
        });

        mousse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dessert.this, Mousse.class));

            }
        });

        caremal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dessert.this, Caremal.class));

            }
        });

        donut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dessert.this, Donut.class));

            }
        });

        waffles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dessert.this, Waffles.class));

            }
        });

        watalappam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dessert.this, Watalappam.class));

            }
        });
    }
}
