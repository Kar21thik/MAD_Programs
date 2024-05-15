package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","oncreate ivoked");
        Toast.makeText(this, "Lifecycle created", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","Lifecycle started");
        Toast.makeText(this, "Lifecycle started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","Lifecycle stopped");
        Toast.makeText(this, "Lifecycle stoped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","Lifecycle Paused");
        Toast.makeText(this, "Lifecycle paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","Lifecycle resumed");
        Toast.makeText(this, "Lifecycle Resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","Lifecycle destoryed");
        Toast.makeText(this, "Lifecycle destroyed", Toast.LENGTH_SHORT).show();

    }
}