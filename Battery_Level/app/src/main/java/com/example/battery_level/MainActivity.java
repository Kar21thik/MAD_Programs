package com.example.battery_level;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.media.tv.BroadcastInfoRequest;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

ProgressBar p;
TextView t;
BroadcastReceiver b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
p=findViewById(R.id.p);
t=findViewById(R.id.t);
b= new BroadcastReceiver() {
    @Override
    public void onReceive(Context context, Intent intent) {
        int level= intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
        t.setText("The Battery level is :"+level);
        p.setProgress(level);
        ConstraintLayout cl = findViewById(R.id.cl);
        if( level>70)
        {
            cl.setBackgroundColor(Color.GREEN);
        }
        else {
            cl.setBackgroundColor(Color.RED);
        }
}
    };
    }

    @Override
    protected void onStart() {
        super.onStart();
        registerReceiver(b,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(b);
    }
}

