package com.example.mygame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {
    Setting reshbtn= new Setting();
    public int reshgamelevels;
    private MediaPlayer btnsoung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION  | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.gamelevels);

        Button btnback =(Button) findViewById(R.id.button_back);
        btnsoung=MediaPlayer.create(this,R.raw.btnsoung);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(GameLevels.this, Menu.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //1 level
        TextView textView1 =(TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(GameLevels.this,Level1.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //1 level
        //2 level
        TextView textView2 =(TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(GameLevels.this,Level2.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //2 level
    }
    @Override
    public  void onBackPressed(){
        try {
            Intent intent = new Intent(GameLevels.this, Menu.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
    public  void soundPlay(MediaPlayer sound){
        sound.start();
        sound.setVolume(30,30);
    }


}