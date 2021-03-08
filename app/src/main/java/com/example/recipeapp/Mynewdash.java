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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Mynewdash extends AppCompatActivity {

    private Button tipsbtn;

    ViewFlipper v_flipper;

    CardView breakfast;
    CardView lunch;
    CardView dinner;
    CardView dessert;
    CardView cake;
    CardView beverage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mynewdash);

        tipsbtn = (Button) findViewById(R.id.btn_tips);
        tipsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToTipsActivity();
            }
        });


        breakfast = findViewById(R.id.card_breakfast);
        lunch = findViewById(R.id.card_lunch);
        dinner = findViewById(R.id.card_dinner);
        dessert = findViewById(R.id.card_dessert);
        cake = findViewById(R.id.card_cake);
        beverage = findViewById(R.id.card_beverage);


        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mynewdash.this, NewBreakfast.class));

            }
        });

        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mynewdash.this, NewLunch.class));

            }
        });

        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mynewdash.this, Dinner.class));

            }
        });

        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mynewdash.this, Dessert.class));

            }
        });

        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mynewdash.this, Cake.class));

            }
        });


        beverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mynewdash.this, Beverage.class));

            }
        });

        int images[] = {R.drawable.view1, R.drawable.view2, R.drawable.view4};


        v_flipper = findViewById(R.id.v_flipper);

        /*for (int i = 0; i<images.length; i++){
            flipperImages(images[i]);
        }*/

        for (int image : images) {
            flipperImages(image);
        }


    }

    public void moveToTipsActivity(){
        Intent intent = new Intent(this, CookingTips.class);
        startActivity(intent);
    }

    public void flipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);


    }

    public void btn_onClick(View view) {
        String number = "0713999000";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel: " + number));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }


        startActivity(intent);
    }

}
