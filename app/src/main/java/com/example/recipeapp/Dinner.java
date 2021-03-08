package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dinner extends AppCompatActivity {

    CardView kotthu;
    CardView naan;
    CardView spagati;
    CardView pasta;
    CardView patis;
    CardView noodles;
    CardView taco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        kotthu = findViewById(R.id.card_kottuu);
        naan = findViewById(R.id.card_naaan);
        spagati = findViewById(R.id.card_spagatii);
        pasta = findViewById(R.id.card_paasta);
        patis = findViewById(R.id.card_patiss);
        noodles = findViewById(R.id.card_nooodles);


        kotthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dinner.this, Kottu.class));

            }
        });

        naan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dinner.this, Naan.class));

            }
        });

        spagati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dinner.this, Spagati.class));

            }
        });

        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dinner.this, Pasta.class));

            }
        });

        patis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dinner.this, Patis.class));

            }
        });

        noodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dinner.this, Noodles.class));

            }
        });


    }
}
