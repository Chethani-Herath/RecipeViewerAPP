package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class NewBreakfast extends AppCompatActivity {



    CardView pittu;
    CardView stringhoppers;
    CardView hoppers;
    CardView pancake;
    CardView milkrice;
    CardView dosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_breakfast);

        pittu = findViewById(R.id.card_pittu);
        stringhoppers = findViewById(R.id.card_stringhoppers);
        hoppers = findViewById(R.id.card_hoppers);
        pancake = findViewById(R.id.card_pancake);
        milkrice = findViewById(R.id.card_milkricee);
        dosa = findViewById(R.id.card_dosa);



        pittu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewBreakfast.this, Pittu.class));

            }
        });


        stringhoppers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewBreakfast.this, Stringhoppers.class));

            }
        });


        hoppers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewBreakfast.this, Hoppers.class));

            }
        });


        pancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewBreakfast.this, Pancake.class));

            }
        });


        milkrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewBreakfast.this, Milkrice.class));


            }
        });


        dosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewBreakfast.this, Dosa.class));

            }
        });


    }





    }

