package com.example.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    public MyService()
    {

    }MediaPlayer music;

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"song is created",Toast.LENGTH_SHORT).show();
        music=MediaPlayer.create(this,R.raw.a);

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
        throw new UnsupportedOperationException("not yet implemeneted");
    }
};
