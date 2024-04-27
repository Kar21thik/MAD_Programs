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
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
TextView t;
ProgressBar p;
BroadcastReceiver b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
t= findViewById(R.id.t);
p=findViewById(R.id.p);
b= new BroadcastReceiver() {
    @Override
    public void onReceive(Context context, Intent intent) {
        int level= intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
        p.setProgress(level);
        t.setText("BATTERY_LEVEL IS :"+level);
        ConstraintLayout cl  =findViewById(R.id.cl);

        if ( level>80)
        {
            cl.setBackgroundColor(Color.GREEN);
        }
        else if (level>40)
        {
            cl.setBackgroundColor(Color.YELLOW);

        }
        else

        {
            cl.setBackgroundColor(Color.RED);
        }

    }
};

    }

    @Override
    protected void onStart() {
        super.onStart();
        registerReceiver(b, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));


    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(b);
    }
}



