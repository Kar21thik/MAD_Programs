package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener  {
Spinner s;
DatePicker d;
TextView t;

ArrayAdapter ad;
String s2 []= {"CSE","ISE","ECE","BTE","AI&RI"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
s =findViewById(R.id.s);
t=findViewById(R.id.t);
d=findViewById(R.id.d);
s.setOnItemSelectedListener(this);
ad= new ArrayAdapter(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,s2);
s.setAdapter(ad);



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String s1 = ad.getItem(i).toString();
        String date = d.getDayOfMonth()+"/"+(d.getMonth()+1)+"/"+d.getYear();
        String toat = "Congratulations\n You Have joined on Date"+date+"\n Selected Course is:"+s1;

        if (s1!="")
        {
            Toast.makeText(MainActivity.this, toat, Toast.LENGTH_LONG).show();
        }
        t.setText(toat);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}