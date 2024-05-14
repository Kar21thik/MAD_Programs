package com.example.battery_level_changer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ProgressBar p;
BroadcastReceiver b;
TextView t;

ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=findViewById(R.id.p);
        t=findViewById(R.id.t);
        cl=findViewById(R.id.cl);

        b= new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
                p.setProgress(level);
                t.setText("the Battery Level is : "+level);
                if (level>50)

                {
                    cl.setBackgroundColor(Color.YELLOW);
                }
                if ( level<20)
                {
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