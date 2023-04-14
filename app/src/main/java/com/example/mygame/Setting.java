package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Setting extends AppCompatActivity {

    private MediaPlayer btnsoung,btnmusic;
    public static boolean resh=false;
    public static boolean reshmusic=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.activity_setting);

        btnsoung=MediaPlayer.create(this,R.raw.btnsoung);

        Button btnsong = (Button) findViewById(R.id.btnsong);
        btnsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                   if (resh==false){
                       soundPlay(btnsoung);
                       resh=true;

                   }else{
                       resh=false;
                   }
                }catch (Exception e){

                }
            }
        });

        Button btnmusic = (Button) findViewById(R.id.btnmusic);
        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshmusic==false){
                        reshmusic=true;

                    }else{
                        reshmusic=false;
                    }
                }catch (Exception e){

                }
            }
        });

        Button btnback=(Button) findViewById(R.id.button_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(Setting.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
    }

    public  void soundPlay(MediaPlayer sound){
        sound.start();
        sound.setVolume(30,30);
    }
}