package com.example.foodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
 CheckBox c1,c2,c3,c4;
 TextView t1,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     b1=findViewById(R.id.b1);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        t=findViewById(R.id.t);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total=0;
                StringBuilder result= new StringBuilder();
                if( c1.isChecked())
                {
                    total+=40;
                    result.append("VegMeals");

                }
                if( c2.isChecked())
                {
                    total+=10;
                    result.append("LimeSoda");

                }
                if( c3.isChecked())
                {
                    total+=60;
                    result.append("Veg Biriyani");

                }
                if( c4.isChecked())
                {
                    total+=80;
                    result.append("\nChicken Biriyani\t");

                }
                result.append("Order Placed The total is ->"+total);
                t1.setText(result.toString());
            }
        });

    }
}