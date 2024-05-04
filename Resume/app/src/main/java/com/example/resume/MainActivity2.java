package com.example.resume;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
  private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);


        Intent i =getIntent();
        String name =i.getStringExtra("name");
        String email =i.getStringExtra("email");
        String phone =i.getStringExtra("phone");
        String quaili =i.getStringExtra("quaili");
        String gender = i.getStringExtra("gender");

        t1.setText("Name"+name);
        t1.setText("email"+email);
        t1.setText("phone"+phone);
        t1.setText("quaili"+quaili);
        t1.setText("gender"+gender);
      
    }}