package com.example.praticetrail;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
  b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
        img.startAnimation(animation);
        }
        });
        b2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
        img.startAnimation(animation);
        }
        });

        b3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
        img.startAnimation(animation);
        }
        });

        b4.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
        img.startAnimation(animation);
        }
        });