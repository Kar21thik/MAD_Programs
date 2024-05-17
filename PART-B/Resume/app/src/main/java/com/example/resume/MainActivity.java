package com.example.resume;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5;
    RadioGroup rg;
    Button b1, b2;
    Uri selectedImageUri;

    private static final int PICK_IMAGE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        rg = findViewById(R.id.rg);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImagePicker();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String age = e2.getText().toString();
                String address = e3.getText().toString();
                String qualify = e4.getText().toString();
                String email = e5.getText().toString();
                int select = rg.getCheckedRadioButtonId();
                RadioButton rb = findViewById(select);
                String gender = rb.getText().toString();



                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("Name", name);
                i.putExtra("Age", age);
                i.putExtra("Address", address);
                i.putExtra("Qualify", qualify);
                i.putExtra("Email", email);
                i.putExtra("Gender", gender);
                i.putExtra("ImageUri", selectedImageUri.toString());
                startActivity(i);
            }
        });
    }

    private void openImagePicker() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Image"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK) {
            selectedImageUri = data.getData();
        }
    }
}
