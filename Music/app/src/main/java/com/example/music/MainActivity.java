package com.example.music;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
b1=findViewById(R.id.b1);
b2=findViewById(R.id.b2);
b3=findViewById(R.id.b3);

b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startService(new Intent(MainActivity.this, MyService.class));

    }
});
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        stopService(new Intent(MainActivity.this,MyService.class));
    }
});
b3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ConstraintLayout cl= findViewById(R.id.cl);
        Random rand = new Random();
        cl.setBackgroundColor(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
    }
});
    }}