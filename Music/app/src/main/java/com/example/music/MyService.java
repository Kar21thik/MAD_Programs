package com.example.music;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
public MyService()
{}
    MediaPlayer music;

    @Override
    public void onCreate() {
        super.onCreate();
        music = MediaPlayer.create(this, R.raw.a);
        Toast.makeText(MyService.this, "Music has been inserted to the device", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(MyService.this, "Music has been started in out device", Toast.LENGTH_SHORT).show();
        music.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyService.this, "Music has been stopped", Toast.LENGTH_SHORT).show();
        music.stop();

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("This is not supported yet !");
    }
}