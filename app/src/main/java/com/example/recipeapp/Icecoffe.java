package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Icecoffe extends AppCompatActivity {
    Button icecoffebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecoffe);
        icecoffebtn =(Button)findViewById(R.id.playIceCofee);
        icecoffebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Icecoffe.this , IcecoffeVideo.class));
            }
        });
    }
}
