package com.example.resumerbuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private EditText name;
    private EditText email;
    private EditText mobile;
    private EditText qualify;
    private RadioGroup r;
    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        mobile=findViewById(R.id.mobile);
        qualify=findViewById(R.id.qualify);
        r= findViewById(R.id.r);
        button= findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n= String.valueOf(name.getText());
                String e= String.valueOf(email.getText());
                String m= String.valueOf(mobile.getText());
                String q= String.valueOf(qualify.getText());
                int select = r.getCheckedRadioButtonId();
                RadioButton rb= findViewById(select);
                String gender = rb.getText().toString();

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("Name:",n);
                i.putExtra("Email:",e);
                i.putExtra("Mobile:",m);
                i.putExtra("Qualify:",q);
                i.putExtra("Gender",gender);
                startActivity(i);


            }
        });


    }
}