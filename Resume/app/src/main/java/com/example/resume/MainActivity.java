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
    private EditText nameEditText;
    private EditText emailEditText;
    private EditText mobileEditText;
    private RadioGroup genderRadioGroup;
    private ImageView imageView;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private static final int PICK_IMAGE_REQUEST = 1;
    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        mobileEditText = findViewById(R.id.mobileEditText);
        genderRadioGroup = findViewById(R.id.genderRadioGroup);
        imageView = findViewById(R.id.imageView);

        Button uploadButton = findViewById(R.id.uploadButton);
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });

        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameEditText.getText().toString();
                email = emailEditText.getText().toString();
                mobile = mobileEditText.getText().toString();
                int selectedId = genderRadioGroup.getCheckedRadioButtonId();
                RadioButton genderRadioButton = findViewById(selectedId);
                gender = genderRadioButton.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("mobile", mobile);
                intent.putExtra("gender", gender);
                if (imageUri != null) {
                    intent.putExtra("imageUri", imageUri.toString());
                }
                startActivity(intent);
            }
        });
    }

    private void openGallery() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imageUri = data.getData();
            try {
                imageView.setImageBitmap(MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
