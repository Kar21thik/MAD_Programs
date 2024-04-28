package com.example.resume;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView nameTextView;
    private TextView emailTextView;
    private TextView mobileTextView;
    private TextView genderTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        mobileTextView = findViewById(R.id.mobileTextView);
        genderTextView = findViewById(R.id.genderTextView);
        imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String mobile = intent.getStringExtra("mobile");
        String gender = intent.getStringExtra("gender");
        String imageUriString = intent.getStringExtra("imageUri");

        nameTextView.setText("Name: " + name);
        emailTextView.setText("Email: " + email);
        mobileTextView.setText("Mobile: " + mobile);
        genderTextView.setText("Gender: " + gender);
            Uri imageUri = Uri.parse(imageUriString);
            imageView.setImageURI(imageUri);

    }
}
