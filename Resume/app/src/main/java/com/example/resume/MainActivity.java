package com.example.resume;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
 private EditText e1;
    private   EditText e2;
    private   EditText e3;
    private   EditText e4;
    private  RadioGroup r;
    private String name;
    private String email;
    private String phone;
    private String quaili;

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);

        r=findViewById(R.id.r);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                 name= e1.getText().toString();
                 email = e2.getText().toString();
                 phone = e3.getText().toString();
                 quaili = e4.getText().toString();
                int select = r.getCheckedRadioButtonId();
                RadioButton rb= findViewById(select);
                String gender= rb.getText().toString();

                i.putExtra("Name",name);
                i.putExtra("email",email);
                i.putExtra("Phone",phone);
                i.putExtra("Quaili",quaili);
                startActivity(i);
            }
        });

    }


    }
