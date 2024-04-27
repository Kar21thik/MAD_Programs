package com.example.alertdialogmessage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button button;

ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button=findViewById(R.id.button);
      cl=findViewById(R.id.cl);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              AlertDialog.Builder builder;
              builder= new AlertDialog.Builder(MainActivity.this);
              builder.setTitle("ARE you sure about it").setMessage("pakka").setPositiveButton("YES", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {
                      cl=findViewById(R.id.cl);
                      Random rand= new Random();
                      cl.setBackgroundColor(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
                  }
              }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {

                  }
              }).setIcon(R.drawable.ic_launcher_background);
          }
      });
    }
}