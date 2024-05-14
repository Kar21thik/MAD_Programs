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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
DatePicker d;
Spinner s;
TextView t;
ArrayAdapter ad;
String s2[]={"AI","BTE","CCM","CSE","CVE","DSE","ISE","ME","AI&RI","EEC","ECE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d= findViewById(R.id.d);
        s=findViewById(R.id.s);
        t=findViewById(R.id.t);
        s.setOnItemSelectedListener(this);
        ad= new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,s2);
        s.setAdapter(ad);



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String s1= ad.getItem(i).toString();
        String date = d.getDayOfMonth()+"-"+(d.getMonth()+1)+"-"+d.getYear();
        String msg= "You Have Joined on the year "+date+"And selected the course "+s1;
        if (s1!="")
        {
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            t.setText("Well you have joined in the year->"+date+"\nAnd selected the course->"+s1);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}