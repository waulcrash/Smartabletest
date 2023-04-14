package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    Setting reshbtn= new Setting();
    public int reshmenu;
    private MediaPlayer btnsoung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION  | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_menu);
        Button btnstart=(Button) findViewById(R.id.buttonstart);
        Button btnback =(Button) findViewById(R.id.button_back);
        btnsoung=MediaPlayer.create(this,R.raw.btnsoung);


        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(Menu.this, GameLevels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(Menu.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
    }
    @Override
    public  void onBackPressed(){
        try {
            Intent intent = new Intent(Menu.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
    public  void soundPlay(MediaPlayer sound){
        sound.start();
        sound.setVolume(30,30);
    }

}