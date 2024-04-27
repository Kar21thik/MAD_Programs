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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
    ArrayAdapter ad;
    DatePicker d;
    String s2 []= {"CSE","ISE","BT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d=findViewById(R.id.d);
        Spinner s=findViewById(R.id.li);
        s.setOnItemSelectedListener(this);
        ad= new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,s2);
        s.setAdapter(ad);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
String s1 = ad.getItem(i).toString();
String date= d.getDayOfMonth()+"/"+(d.getMonth()+1)+"/"+d.getYear();
if (s1!=" ")
{
    String toat ="The Joined date and year is :"+date+"The taken out course is"+s1;
    TextView t= findViewById(R.id.t);
    t.setText("\nCONGRAJULATIONS \n"+toat);
    Toast.makeText(this,toat,Toast.LENGTH_LONG).show();

}
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
