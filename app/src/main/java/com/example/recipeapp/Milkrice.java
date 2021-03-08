package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Milkrice extends AppCompatActivity {
    Button milkricebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milkrice);
        milkricebtn = (Button)findViewById(R.id.playMilkrice);
        milkricebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Milkrice.this, MilkriceVideo.class));
            }
        });

    }
}
