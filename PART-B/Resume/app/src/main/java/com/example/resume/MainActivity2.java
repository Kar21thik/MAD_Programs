package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1, t2, t3, t4, t5, t6;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        imageView = findViewById(R.id.imageView);

        Intent i = getIntent();
        String name = i.getStringExtra("Name");
        String age = i.getStringExtra("Age");
        String address = i.getStringExtra("Address");
        String gender = i.getStringExtra("Gender");
        String qualify = i.getStringExtra("Qualify");
        String email = i.getStringExtra("Email");
        String imageUriString = i.getStringExtra("ImageUri");
        Uri imageUri = Uri.parse(imageUriString);

        t1.setText("Name: " + name);
        t2.setText("Age: " + age);
        t3.setText("Address: " + address);
        t4.setText("Gender: " + gender);
        t5.setText("Qualification: " + qualify);
        t6.setText("Email: " + email);
        imageView.setImageURI(imageUri);
    }
}
