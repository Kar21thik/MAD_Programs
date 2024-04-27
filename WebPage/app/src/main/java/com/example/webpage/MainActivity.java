package com.example.webpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
b1=findViewById(R.id.b1);
b2=findViewById(R.id.b2);
t1=findViewById(R.id.t1);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i= new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("load","default12");
        startActivity(i);
    }
});

b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("load",t1.getText().toString());
        startActivity(i);
    }
});
    }
}