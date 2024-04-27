package com.example.music;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    public MyService()
    {
    }
MediaPlayer music;

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(MyService.this, "Music has been created",Toast.LENGTH_SHORT).show();
        music = MediaPlayer.create(this,R.raw.a);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(MyService.this, "Music has been started to play",Toast.LENGTH_SHORT).show();
        music.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyService.this, "Music has been Paused",Toast.LENGTH_SHORT).show();
music.stop();
    }


    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Unhandled support! please try to restart it!");


    }
}
