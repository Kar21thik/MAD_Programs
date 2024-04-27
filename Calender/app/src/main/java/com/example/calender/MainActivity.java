package com.example.calender;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    ArrayAdapter ad;
    Spinner s;
    DatePicker dp;

    String s2[] = {"CSE", "ISE", "BTE", "AI&RI", "ECE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = findViewById(R.id.li);
        dp = findViewById(R.id.dp);
        s.setOnItemClickListener(this);
        ad = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, s2);
        s.setAdapter(ad);


    }
    public  void OnItemSelectedListener(AdapterView<?> adapterView, View view, int i , long l){}

}


