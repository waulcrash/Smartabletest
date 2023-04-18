package com.example.mygame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {
    Setting reshbtn= new Setting();//распространение настроек
    private MediaPlayer btnsoung;//звук нажатия кнопки


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION  | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.gamelevels);

        Button btnback =(Button) findViewById(R.id.button_back);//кнопка назад
        btnsoung=MediaPlayer.create(this,R.raw.btnsoung);//звук

        ImageView stars2 = (ImageView) findViewById(R.id.stars2);//звезды по уровнем
        ImageView stars3 = (ImageView) findViewById(R.id.stars3);
        ImageView stars4 = (ImageView) findViewById(R.id.stars4);
        ImageView stars5 = (ImageView) findViewById(R.id.stars5);
        ImageView stars6 = (ImageView) findViewById(R.id.stars6);
        ImageView stars7 = (ImageView) findViewById(R.id.stars7);
        ImageView stars8 = (ImageView) findViewById(R.id.stars8);
        ImageView stars9 = (ImageView) findViewById(R.id.stars9);
        ImageView stars10 = (ImageView) findViewById(R.id.stars10);
        ImageView stars11 = (ImageView) findViewById(R.id.stars11);
        ImageView stars12 = (ImageView) findViewById(R.id.stars12);
        ImageView stars13 = (ImageView) findViewById(R.id.stars13);
        ImageView stars14 = (ImageView) findViewById(R.id.stars14);
        ImageView stars15 = (ImageView) findViewById(R.id.stars15);
        ImageView stars16 = (ImageView) findViewById(R.id.stars16);
        ImageView stars17 = (ImageView) findViewById(R.id.stars17);
        ImageView stars18 = (ImageView) findViewById(R.id.stars18);
        ImageView stars19 = (ImageView) findViewById(R.id.stars19);
        ImageView stars20 = (ImageView) findViewById(R.id.stars20);
        ImageView stars21 = (ImageView) findViewById(R.id.stars21);
        ImageView stars22 = (ImageView) findViewById(R.id.stars22);
        ImageView stars23 = (ImageView) findViewById(R.id.stars23);
        ImageView stars24 = (ImageView) findViewById(R.id.stars24);
        ImageView stars25 = (ImageView) findViewById(R.id.stars25);
        ImageView stars26 = (ImageView) findViewById(R.id.stars26);
        ImageView stars27 = (ImageView) findViewById(R.id.stars27);
        ImageView stars28 = (ImageView) findViewById(R.id.stars28);
        ImageView stars29 = (ImageView) findViewById(R.id.stars29);
        ImageView stars30 = (ImageView) findViewById(R.id.stars30);
        //stars end


        //условие для звезд по уровнем
        if (Variables.star2 == 1){
            stars2.setImageResource(R.drawable.starsendone);
        }else if (Variables.star2==2){
            stars2.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star2==3){
            stars2.setImageResource(R.drawable.starsendfull);
        }
        if (Variables.star3 == 1){
            stars3.setImageResource(R.drawable.starsendone);
        }else if (Variables.star3==2){
            stars3.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star3==3){
            stars3.setImageResource(R.drawable.starsendfull);
        }
        if (Variables.star4 == 1){
            stars4.setImageResource(R.drawable.starsendone);
        }else if (Variables.star4==2){
            stars4.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star4==3){
            stars4.setImageResource(R.drawable.starsendfull);
        }
        if (Variables.star5 == 1){
            stars5.setImageResource(R.drawable.starsendone);
        }else if (Variables.star5==2){
            stars5.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star5==3){
            stars5.setImageResource(R.drawable.starsendfull);
        }
        if (Variables.star6 == 1){
            stars6.setImageResource(R.drawable.starsendone);
        }else if (Variables.star6==2){
            stars6.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star6==3){
            stars6.setImageResource(R.drawable.starsendfull);
        }
        if (Variables.star7 == 1){
            stars7.setImageResource(R.drawable.starsendone);
        }else if (Variables.star7==2){
            stars7.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star7==3){
            stars7.setImageResource(R.drawable.starsendfull);
        }




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
        if (Variables.progresslvl>=2) {
            //2 level
            TextView textView2 = (TextView) findViewById(R.id.textView2);
            textView2.setBackgroundResource(R.drawable.btn_gamelevels);
            textView2.setText("2");
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level2.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
            //2 level
        }
        if (Variables.progresslvl>=3) {
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            textView3.setBackgroundResource(R.drawable.btn_gamelevels);
            textView3.setText("3");
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level3.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (Variables.progresslvl>=4) {
            TextView textView4 = (TextView) findViewById(R.id.textView4);
            textView4.setBackgroundResource(R.drawable.btn_gamelevels);
            textView4.setText("4");
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level4.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (Variables.progresslvl>=5) {

            TextView textView5 = (TextView) findViewById(R.id.textView5);
            textView5.setBackgroundResource(R.drawable.btn_gamelevels);
            textView5.setText("5");
            textView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level5.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (Variables.progresslvl>=6) {

            TextView textView6 = (TextView) findViewById(R.id.textView6);
            textView6.setBackgroundResource(R.drawable.btn_gamelevels);
            textView6.setText("6");
            textView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level6.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
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