package com.example.mygame;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
public class MyService extends Service {
    private static final String TAG = "MyService";
    MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {


        player = MediaPlayer.create(this, R.raw.music);
        player.setVolume(50,50);
        player.setLooping(true); // зацикливаем
    }

    @Override
    public void onDestroy() {
        player.stop();
    }

    @Override
    public void onStart(Intent intent, int startid) {

        player.start();
    }
}
