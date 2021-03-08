package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Beverage extends AppCompatActivity {
    CardView milk;
    CardView ice;
    CardView faluda;
    CardView dalgona;
    CardView smootie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage);
        milk=findViewById(R.id.card_milkshake);
        ice=findViewById(R.id.card_icecoffee);
        faluda=findViewById(R.id.card_faludaa);
        dalgona=findViewById(R.id.card_dalgonaa);
        smootie=findViewById(R.id.card_smootiee);


        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beverage.this, Milkshake.class));

            }
        });

        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beverage.this, Icecoffe.class));

            }
        });

        faluda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beverage.this, Faluda.class));

            }
        });

        dalgona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beverage.this, Dalgonacoffe.class));

            }
        });

        smootie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beverage.this, Mangosmootie.class));

            }
        });
    }
}
