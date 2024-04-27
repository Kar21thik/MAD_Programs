package com.example.resumerbuilder;



import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
private TextView name;
    private TextView email;
    private TextView qualify;
    private TextView mobile;
    private TextView gender;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name= findViewById(R.id.name);
        email= findViewById(R.id.email);
        mobile =findViewById(R.id.mobile);
        gender= findViewById(R.id.mobile);
        qualify=findViewById(R.id.qualify);
        Intent i = getIntent();
        String n= i.getStringExtra("name");
        String e =i.getStringExtra("email");
        String m = i.getStringExtra("tmobile");
        String g =i.getStringExtra("gender");
        String q =i.getStringExtra("qualify");

        qualify.setText("QUALIFICATION IS :"+n);
        name.setText("QUALIFICATION IS :"+e);
        email.setText("EMAIL IS :"+m);
        gender.setText("GENDER is :"+g);
        mobile.setText("MOBILE IS :"+q);




    }
}