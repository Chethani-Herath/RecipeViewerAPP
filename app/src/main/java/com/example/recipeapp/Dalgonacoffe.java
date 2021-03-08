package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dalgonacoffe extends AppCompatActivity {
    Button Dalgonabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalgonacoffe);
        Dalgonabtn = (Button)findViewById(R.id.playDalgona);
        Dalgonabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startActivity(new Intent(Dalgonacoffe.this,Dalgonavideo.class));
            }
        });
    }
}
