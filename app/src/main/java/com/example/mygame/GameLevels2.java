package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameLevels2 extends AppCompatActivity {

    Setting reshbtn= new Setting();//распространение настроек
    private MediaPlayer btnsoung;//звук нажатия кнопки
    public  int countstarsc=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION  | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_game_levels2);
        SharedPreferences save2 = getSharedPreferences("Save2", MODE_PRIVATE);
        final int level2 = save2.getInt("level2", 1);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        final int level = save.getInt("level", 1);


        //
        SharedPreferences savestar1c = getSharedPreferences("Savestar1c", MODE_PRIVATE);
        final int star1c = savestar1c.getInt("Star1c", 0);

        SharedPreferences status1c = getSharedPreferences("Status1c", MODE_PRIVATE);
        final int statusstar1c = status1c.getInt("StatusStar1c", 0);
        SharedPreferences status1_2c = getSharedPreferences("Status1_2c", MODE_PRIVATE);
        final int statusstar1_2c = status1_2c.getInt("StatusStar1_2c", 0);
        SharedPreferences status1_3c = getSharedPreferences("Status1_3c", MODE_PRIVATE);
        final int statusstar1_3c = status1_3c.getInt("StatusStar1_3c", 0);
        //
        //
        SharedPreferences savestar2c = getSharedPreferences("Savestar2c", MODE_PRIVATE);
        final int star2c = savestar2c.getInt("Star2c", 0);

        SharedPreferences status2c = getSharedPreferences("Status2c", MODE_PRIVATE);
        final int statusstar2c = status2c.getInt("StatusStar2c", 0);
        SharedPreferences status2_2c = getSharedPreferences("Status2_2c", MODE_PRIVATE);
        final int statusstar2_2c = status2_2c.getInt("StatusStar2c", 0);
        SharedPreferences status2_3c = getSharedPreferences("Status2_3c", MODE_PRIVATE);
        final int statusstar2_3c = status2_3c.getInt("StatusStar2_3c", 0);
        //
        //
        SharedPreferences savestar3c = getSharedPreferences("Savestar3c", MODE_PRIVATE);
        final int star3c = savestar3c.getInt("Star3c", 0);

        SharedPreferences status3c = getSharedPreferences("Status3c", MODE_PRIVATE);
        final int statusstar3c = status3c.getInt("StatusStar3c", 0);
        SharedPreferences status3_2c = getSharedPreferences("Status3_2c", MODE_PRIVATE);
        final int statusstar3_2c = status3_2c.getInt("StatusStar3c", 0);
        SharedPreferences status3_3c = getSharedPreferences("Status3_3c", MODE_PRIVATE);
        final int statusstar3_3c = status3_3c.getInt("StatusStar3_3c", 0);
        //
        //
        SharedPreferences savestar4c = getSharedPreferences("Savestar4c", MODE_PRIVATE);
        final int star4c = savestar4c.getInt("Star4c", 0);

        SharedPreferences status4c = getSharedPreferences("Status4c", MODE_PRIVATE);
        final int statusstar4c = status4c.getInt("StatusStar4c", 0);
        SharedPreferences status4_2c = getSharedPreferences("Status4_2c", MODE_PRIVATE);
        final int statusstar4_2c = status4_2c.getInt("StatusStar4c", 0);
        SharedPreferences status4_3c = getSharedPreferences("Status4_3c", MODE_PRIVATE);
        final int statusstar4_3c = status4_3c.getInt("StatusStar4_3c", 0);
        //
        //
        SharedPreferences savestar5c = getSharedPreferences("Savestar5c", MODE_PRIVATE);
        final int star5c = savestar5c.getInt("Star5c", 0);

        SharedPreferences status5c = getSharedPreferences("Status5c", MODE_PRIVATE);
        final int statusstar5c = status5c.getInt("StatusStar5c", 0);
        SharedPreferences status5_2c = getSharedPreferences("Status5_2c", MODE_PRIVATE);
        final int statusstar5_2c = status5_2c.getInt("StatusStar5c", 0);
        SharedPreferences status5_3c = getSharedPreferences("Status5_3c", MODE_PRIVATE);
        final int statusstar5_3c = status5_3c.getInt("StatusStar5_3c", 0);
        //
        ImageView stars1 = (ImageView) findViewById(R.id.stars1c);
        ImageView stars2 = (ImageView) findViewById(R.id.stars2c);//звезды по уровнем
        ImageView stars3 = (ImageView) findViewById(R.id.stars3c);
        ImageView stars4 = (ImageView) findViewById(R.id.stars4c);
        ImageView stars5 = (ImageView) findViewById(R.id.stars5c);

        //условие для звезд по уровнем
        if (star1c == 1){

            if (statusstar1c==0){
                countstarsc=countstarsc+1;
                SharedPreferences.Editor editor2 = status1c.edit();
                editor2.putInt("Status1c",1);
                editor2.commit();
            }
            stars1.setImageResource(R.drawable.starsendone);
        }else if (star1c==2){
            if (statusstar1_2c==0) {
                countstarsc=countstarsc+2;
                if (statusstar1c==1){
                    countstarsc=countstarsc-1;
                }
                SharedPreferences.Editor editor2 = status1c.edit();
                editor2.putInt("Status1c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status1_2c.edit();
                editor3.putInt("Status1_2c",1);
                editor3.commit();
            }
            stars1.setImageResource(R.drawable.starsendtwo);
        }else if (star1c==3){
            if (statusstar1_3c==0) {
                countstarsc=countstarsc+3;
                if (statusstar1c==1 && statusstar1_2c==0){
                    countstarsc=countstarsc-1;
                }else if(statusstar1c==0 && statusstar1_2c==1 || statusstar1c==1 && statusstar1_2c==1){
                    countstarsc=countstarsc-2;
                }
                SharedPreferences.Editor editor2 = status1c.edit();
                editor2.putInt("Status1c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status1_2c.edit();
                editor3.putInt("Status1_2c",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status1_3c.edit();
                editor4.putInt("Status1_3c",1);
                editor4.commit();
            }
            stars1.setImageResource(R.drawable.starsendfull);
        }
        if (star2c == 1){

            if (statusstar2c==0){
                countstarsc=countstarsc+1;
                SharedPreferences.Editor editor2 = status2c.edit();
                editor2.putInt("Status2c",1);
                editor2.commit();
            }
            stars2.setImageResource(R.drawable.starsendone);
        }else if (star2c==2){
            if (statusstar2_2c==0) {
                countstarsc=countstarsc+2;
                if (statusstar2c==1){
                    countstarsc=countstarsc-1;
                }
                SharedPreferences.Editor editor2 = status2c.edit();
                editor2.putInt("Status2c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status2_2c.edit();
                editor3.putInt("Status2_2c",1);
                editor3.commit();
            }
            stars2.setImageResource(R.drawable.starsendtwo);
        }else if (star2c==3){
            if (statusstar2_3c==0) {
                countstarsc=countstarsc+3;
                if (statusstar2c==1 && statusstar2_2c==0){
                    countstarsc=countstarsc-1;
                }else if(statusstar2c==0 && statusstar2_2c==1 || statusstar2c==1 && statusstar2_2c==1){
                    countstarsc=countstarsc-2;
                }
                SharedPreferences.Editor editor2 = status2c.edit();
                editor2.putInt("Status2c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status2_2c.edit();
                editor3.putInt("Status2_2c",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status2_3c.edit();
                editor4.putInt("Status2_3c",1);
                editor4.commit();
            }
            stars2.setImageResource(R.drawable.starsendfull);
        }



        if (star3c == 1){

            if (statusstar3c==0){
                countstarsc=countstarsc+1;
                SharedPreferences.Editor editor2 = status3c.edit();
                editor2.putInt("Status3",1);
                editor2.commit();
            }
            stars3.setImageResource(R.drawable.starsendone);
        }else if (star3c==2){
            if (statusstar3_2c==0) {
                countstarsc=countstarsc+2;
                if (statusstar3c==1){
                    countstarsc=countstarsc-1;
                }
                SharedPreferences.Editor editor2 = status3c.edit();
                editor2.putInt("Status3c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status3_2c.edit();
                editor3.putInt("Status3_2c",1);
                editor3.commit();
            }
            stars3.setImageResource(R.drawable.starsendtwo);
        }else if (star3c==3){
            if (statusstar3_3c==0) {
                countstarsc=countstarsc+3;
                if (statusstar3c==1 && statusstar3_2c==0){
                    countstarsc=countstarsc-1;
                }else if(statusstar3c==0 && statusstar3_2c==1 || statusstar3c==1 && statusstar3_2c==1){
                    countstarsc=countstarsc-2;
                }
                SharedPreferences.Editor editor2 = status3c.edit();
                editor2.putInt("Status3c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status3_2c.edit();
                editor3.putInt("Status3_2c",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status3_3c.edit();
                editor4.putInt("Status3_3c",1);
                editor4.commit();
            }
            stars3.setImageResource(R.drawable.starsendfull);
        }


        if (star4c == 1){

            if (statusstar4c==0){
                countstarsc=countstarsc+1;
                SharedPreferences.Editor editor2 = status4c.edit();
                editor2.putInt("Status4c",1);
                editor2.commit();
            }
            stars4.setImageResource(R.drawable.starsendone);
        }else if (star4c==2){
            if (statusstar4_2c==0) {
                countstarsc=countstarsc+2;
                if (statusstar4c==1){
                    countstarsc=countstarsc-1;
                }
                SharedPreferences.Editor editor2 = status4c.edit();
                editor2.putInt("Status4c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status4_2c.edit();
                editor3.putInt("Status4_2c",1);
                editor3.commit();
            }
            stars4.setImageResource(R.drawable.starsendtwo);
        }else if (star4c==3){
            if (statusstar4_3c==0) {
                countstarsc=countstarsc+3;
                if (statusstar4c==1 && statusstar4_2c==0){
                    countstarsc=countstarsc-1;
                }else if(statusstar4c==0 && statusstar4_2c==1 || statusstar4c==1 && statusstar4_2c==1){
                    countstarsc=countstarsc-2;
                }
                SharedPreferences.Editor editor2 = status4c.edit();
                editor2.putInt("Status4c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status4_2c.edit();
                editor3.putInt("Status4_2c",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status4_3c.edit();
                editor4.putInt("Status4_3c",1);
                editor4.commit();
            }
            stars4.setImageResource(R.drawable.starsendfull);
        }
        if (star5c == 1){

            if (statusstar5c==0){
                countstarsc=countstarsc+1;
                SharedPreferences.Editor editor2 = status5c.edit();
                editor2.putInt("Status5c",1);
                editor2.commit();
            }
            stars5.setImageResource(R.drawable.starsendone);
        }else if (star5c==2){
            if (statusstar5_2c==0) {
                countstarsc=countstarsc+2;
                if (statusstar5c==1){
                    countstarsc=countstarsc-1;
                }
                SharedPreferences.Editor editor2 = status5c.edit();
                editor2.putInt("Status5c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status5_2c.edit();
                editor3.putInt("Status5_2c",1);
                editor3.commit();
            }
            stars5.setImageResource(R.drawable.starsendtwo);
        }else if (star5c==3){
            if (statusstar5_3c==0) {
                countstarsc=countstarsc+3;
                if (statusstar5c==1 && statusstar5_2c==0){
                    countstarsc=countstarsc-1;
                }else if(statusstar5c==0 && statusstar5_2c==1 || statusstar5c==1 && statusstar5_2c==1){
                    countstarsc=countstarsc-2;
                }
                SharedPreferences.Editor editor2 = status5c.edit();
                editor2.putInt("Status5c",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status5_2c.edit();
                editor3.putInt("Status5_2c",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status5_3c.edit();
                editor4.putInt("Status5_3c",1);
                editor4.commit();
            }
            stars5.setImageResource(R.drawable.starsendfull);
        }

        Button btnback =(Button) findViewById(R.id.button_back);//кнопка назад
        btnsoung= MediaPlayer.create(this,R.raw.btnsoung);//звук

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(GameLevels2.this, Menu.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        if (level>10) {
            TextView textView1 = (TextView) findViewById(R.id.textView1);
            textView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels2.this, Level2_1.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
            //1 level
            if (level2>=2) {
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
                            Intent intent = new Intent(GameLevels2.this, Level2_2.class);
                            startActivity(intent);
                            finish();
                        } catch (Exception e) {

                        }
                    }
                });
                //2 level
            }
        }


    }
    @Override
    public  void onBackPressed(){
        try {
            Intent intent = new Intent(GameLevels2.this, Menu.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
    public  void soundPlay(MediaPlayer sound){
        sound.start();
        sound.setVolume(30,30);
    }


}

