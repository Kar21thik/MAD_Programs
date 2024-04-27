package com.example.phoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText p,m;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      p= findViewById(R.id.p);
      m= findViewById(R.id.m);
      send=findViewById(R.id.send);
      send.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String phone = p.getText().toString();
              String msg = m.getText().toString();
              Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("sms:"+phone));
              i.putExtra("sms_body",msg);
              startActivity(i);
          }
      });
    }
}