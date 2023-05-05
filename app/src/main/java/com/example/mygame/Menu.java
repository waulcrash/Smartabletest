package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    Setting reshbtn= new Setting();
    public int reshmenu;
    private MediaPlayer btnsoung;
    public int chapter=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION  | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_menu);
        Button btnstart=(Button) findViewById(R.id.buttonstart);
        Button btnstart2=(Button) findViewById(R.id.rightlvl);
        Button btnstart3=(Button) findViewById(R.id.leftlvl);
        Button btnback =(Button) findViewById(R.id.button_back);


        ImageView shapterpng=(ImageView) findViewById(R.id.main_etap);
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
                    if (chapter==1){
                        Intent intent = new Intent(Menu.this, GameLevels.class);
                        startActivity(intent);finish();

                    }else if (chapter==2){
                        Intent intent = new Intent(Menu.this, GameLevels2.class);
                        startActivity(intent);finish();
                    }

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

        btnstart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    if (chapter==1){
                        chapter=2;
                        shapterpng.setImageResource(R.drawable.earthopen);

                    }else if (chapter==2){
                        chapter=1;
                        shapterpng.setImageResource(R.drawable.etap);
                    }

                }catch (Exception e){

                }
            }
        });
        btnstart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    if (chapter==1){
                        chapter=2;
                        shapterpng.setImageResource(R.drawable.earthopen);

                    }else if (chapter==2){
                        chapter=1;
                        shapterpng.setImageResource(R.drawable.etap);
                    }

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