package com.example.musicplayerapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService  extends Service {
public void Myservice(){}
    MediaPlayer music ;

    @Override
    public void onCreate() {
        super.onCreate();
        music = MediaPlayer.create(MyService.this,R.raw.a);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        music.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        music.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
