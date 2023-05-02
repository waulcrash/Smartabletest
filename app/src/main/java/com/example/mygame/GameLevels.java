package com.example.mygame;

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

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {
    Setting reshbtn= new Setting();//распространение настроек
    private MediaPlayer btnsoung;//звук нажатия кнопки

    public int countstars=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION  | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.gamelevels);
        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        final int level = save.getInt("level", 1);



        //
        SharedPreferences savestar2 = getSharedPreferences("Savestar2", MODE_PRIVATE);
        final int star2 = savestar2.getInt("Star2", 0);

        SharedPreferences status2 = getSharedPreferences("Status2", MODE_PRIVATE);
        final int statusstar2 = status2.getInt("StatusStar2", 0);
        SharedPreferences status2_2 = getSharedPreferences("Status2_2", MODE_PRIVATE);
        final int statusstar2_2 = status2_2.getInt("StatusStar2", 0);
        SharedPreferences status2_3 = getSharedPreferences("Status2_3", MODE_PRIVATE);
        final int statusstar2_3 = status2_3.getInt("StatusStar2_3", 0);
        //
        //
        SharedPreferences savestar3 = getSharedPreferences("Savestar3", MODE_PRIVATE);
        final int star3 = savestar3.getInt("Star3", 0);

        SharedPreferences status3 = getSharedPreferences("Status3", MODE_PRIVATE);
        final int statusstar3 = status3.getInt("StatusStar3", 0);
        SharedPreferences status3_2 = getSharedPreferences("Status3_2", MODE_PRIVATE);
        final int statusstar3_2 = status3_2.getInt("StatusStar3", 0);
        SharedPreferences status3_3 = getSharedPreferences("Status3_3", MODE_PRIVATE);
        final int statusstar3_3 = status3_3.getInt("StatusStar3_3", 0);
        //
        //
        SharedPreferences savestar4 = getSharedPreferences("Savestar4", MODE_PRIVATE);
        final int star4 = savestar4.getInt("Star4", 0);

        SharedPreferences status4 = getSharedPreferences("Status4", MODE_PRIVATE);
        final int statusstar4 = status4.getInt("StatusStar4", 0);
        SharedPreferences status4_2 = getSharedPreferences("Status4_2", MODE_PRIVATE);
        final int statusstar4_2 = status4_2.getInt("StatusStar4", 0);
        SharedPreferences status4_3 = getSharedPreferences("Status4_3", MODE_PRIVATE);
        final int statusstar4_3 = status4_3.getInt("StatusStar4_3", 0);
        //
        //
        SharedPreferences savestar5 = getSharedPreferences("Savestar5", MODE_PRIVATE);
        final int star5 = savestar5.getInt("Star5", 0);

        SharedPreferences status5 = getSharedPreferences("Status5", MODE_PRIVATE);
        final int statusstar5 = status5.getInt("StatusStar5", 0);
        SharedPreferences status5_2 = getSharedPreferences("Status5_2", MODE_PRIVATE);
        final int statusstar5_2 = status5_2.getInt("StatusStar5", 0);
        SharedPreferences status5_3 = getSharedPreferences("Status5_3", MODE_PRIVATE);
        final int statusstar5_3 = status5_3.getInt("StatusStar5_3", 0);
        //
        //
        SharedPreferences savestar6 = getSharedPreferences("Savestar6", MODE_PRIVATE);
        final int star6 = savestar6.getInt("Star6", 0);

        SharedPreferences status6 = getSharedPreferences("Status6", MODE_PRIVATE);
        final int statusstar6 = status6.getInt("StatusStar6", 0);
        SharedPreferences status6_2 = getSharedPreferences("Status6_2", MODE_PRIVATE);
        final int statusstar6_2 = status6_2.getInt("StatusStar6_2", 0);
        SharedPreferences status6_3 = getSharedPreferences("Status6_3", MODE_PRIVATE);
        final int statusstar6_3 = status6_3.getInt("StatusStar6_3", 0);
        //
        //
        SharedPreferences savestar7 = getSharedPreferences("Savestar7", MODE_PRIVATE);
        final int star7 = savestar7.getInt("Star7", 0);

        SharedPreferences status7 = getSharedPreferences("Status7", MODE_PRIVATE);
        final int statusstar7 = status7.getInt("StatusStar7", 0);
        SharedPreferences status7_2 = getSharedPreferences("Status7_2", MODE_PRIVATE);
        final int statusstar7_2 = status7_2.getInt("StatusStar7", 0);
        SharedPreferences status7_3 = getSharedPreferences("Status7_3", MODE_PRIVATE);
        final int statusstar7_3 = status7_3.getInt("StatusStar7_3", 0);
        //
        SharedPreferences savestar8 = getSharedPreferences("Savestar8", MODE_PRIVATE);
        final int star8 = savestar8.getInt("Star8", 0);

        SharedPreferences status8 = getSharedPreferences("Status8", MODE_PRIVATE);
        final int statusstar8 = status8.getInt("StatusStar8", 0);
        SharedPreferences status8_2 = getSharedPreferences("Status8_2", MODE_PRIVATE);
        final int statusstar8_2 = status8_2.getInt("StatusStar8", 0);
        SharedPreferences status8_3 = getSharedPreferences("Status8_3", MODE_PRIVATE);
        final int statusstar8_3 = status8_3.getInt("StatusStar8_3", 0);
        //
        //
        SharedPreferences savestar9 = getSharedPreferences("Savestar9", MODE_PRIVATE);
        final int star9 = savestar9.getInt("Star9", 0);

        SharedPreferences status9 = getSharedPreferences("Status9", MODE_PRIVATE);
        final int statusstar9 = status9.getInt("StatusStar9", 0);
        SharedPreferences status9_2 = getSharedPreferences("Status9_2", MODE_PRIVATE);
        final int statusstar9_2 = status9_2.getInt("StatusStar9", 0);
        SharedPreferences status9_3 = getSharedPreferences("Status9_3", MODE_PRIVATE);
        final int statusstar9_3 = status9_3.getInt("StatusStar9_3", 0);
        //
        //
        SharedPreferences savestar10 = getSharedPreferences("Savestar10", MODE_PRIVATE);
        final int star10 = savestar10.getInt("Star10", 0);

        SharedPreferences status10 = getSharedPreferences("Status10", MODE_PRIVATE);
        final int statusstar10 = status10.getInt("StatusStar10", 0);
        SharedPreferences status10_2 = getSharedPreferences("Status10_2", MODE_PRIVATE);
        final int statusstar10_2 = status10_2.getInt("StatusStar10", 0);
        SharedPreferences status10_3 = getSharedPreferences("Status10_3", MODE_PRIVATE);
        final int statusstar10_3 = status10_3.getInt("StatusStar10_3", 0);
        //
        //
        SharedPreferences savestar11 = getSharedPreferences("Savestar11", MODE_PRIVATE);
        final int star11 = savestar11.getInt("Star11", 0);

        SharedPreferences status11 = getSharedPreferences("Status11", MODE_PRIVATE);
        final int statusstar11 = status11.getInt("StatusStar11", 0);
        SharedPreferences status11_2 = getSharedPreferences("Status11_2", MODE_PRIVATE);
        final int statusstar11_2 = status11_2.getInt("StatusStar11", 0);
        SharedPreferences status11_3 = getSharedPreferences("Status11_3", MODE_PRIVATE);
        final int statusstar11_3 = status11_3.getInt("StatusStar11_3", 0);
        //
        //
        SharedPreferences savestar12 = getSharedPreferences("Savestar12", MODE_PRIVATE);
        final int star12 = savestar12.getInt("Star12", 0);

        SharedPreferences status12 = getSharedPreferences("Status12", MODE_PRIVATE);
        final int statusstar12 = status12.getInt("StatusStar12", 0);
        SharedPreferences status12_2 = getSharedPreferences("Status12_2", MODE_PRIVATE);
        final int statusstar12_2 = status12_2.getInt("StatusStar12", 0);
        SharedPreferences status12_3 = getSharedPreferences("Status12_3", MODE_PRIVATE);
        final int statusstar12_3 = status12_3.getInt("StatusStar12_3", 0);
        //
        //
        SharedPreferences savestar13 = getSharedPreferences("Savestar13", MODE_PRIVATE);
        final int star13 = savestar13.getInt("Star13", 0);

        SharedPreferences status13 = getSharedPreferences("Status13", MODE_PRIVATE);
        final int statusstar13 = status13.getInt("StatusStar13", 0);
        SharedPreferences status13_2 = getSharedPreferences("Status13_2", MODE_PRIVATE);
        final int statusstar13_2 = status13_2.getInt("StatusStar31", 0);
        SharedPreferences status13_3 = getSharedPreferences("Status13_3", MODE_PRIVATE);
        final int statusstar13_3 = status13_3.getInt("StatusStar13_3", 0);
        //
        //
        SharedPreferences savestar14 = getSharedPreferences("Savestar14", MODE_PRIVATE);
        final int star14 = savestar14.getInt("Star14", 0);

        SharedPreferences status14 = getSharedPreferences("Status14", MODE_PRIVATE);
        final int statusstar14 = status14.getInt("StatusStar14", 0);
        SharedPreferences status14_2 = getSharedPreferences("Status14_2", MODE_PRIVATE);
        final int statusstar14_2 = status14_2.getInt("StatusStar14", 0);
        SharedPreferences status14_3 = getSharedPreferences("Status14_3", MODE_PRIVATE);
        final int statusstar14_3 = status14_3.getInt("StatusStar14_3", 0);
        //
        //
        SharedPreferences savestar15 = getSharedPreferences("Savestar15", MODE_PRIVATE);
        final int star15 = savestar15.getInt("Star15", 0);

        SharedPreferences status15 = getSharedPreferences("Status15", MODE_PRIVATE);
        final int statusstar15 = status15.getInt("StatusStar15", 0);
        SharedPreferences status15_2 = getSharedPreferences("Status15_2", MODE_PRIVATE);
        final int statusstar15_2 = status15_2.getInt("StatusStar15", 0);
        SharedPreferences status15_3 = getSharedPreferences("Status15_3", MODE_PRIVATE);
        final int statusstar15_3 = status15_3.getInt("StatusStar15_3", 0);
        //
        //
        SharedPreferences savestar16 = getSharedPreferences("Savestar16", MODE_PRIVATE);
        final int star16 = savestar16.getInt("Star16", 0);

        SharedPreferences status16 = getSharedPreferences("Status16", MODE_PRIVATE);
        final int statusstar16 = status16.getInt("StatusStar16", 0);
        SharedPreferences status16_2 = getSharedPreferences("Status16_2", MODE_PRIVATE);
        final int statusstar16_2 = status16_2.getInt("StatusStar6", 0);
        SharedPreferences status16_3 = getSharedPreferences("Status16_3", MODE_PRIVATE);
        final int statusstar16_3 = status16_3.getInt("StatusStar16_3", 0);
        //
        //
        SharedPreferences savestar17 = getSharedPreferences("Savestar17", MODE_PRIVATE);
        final int star17 = savestar17.getInt("Star17", 0);

        SharedPreferences status17 = getSharedPreferences("Status17", MODE_PRIVATE);
        final int statusstar17 = status17.getInt("StatusStar17", 0);
        SharedPreferences status17_2 = getSharedPreferences("Status17_2", MODE_PRIVATE);
        final int statusstar17_2 = status17_2.getInt("StatusStar17", 0);
        SharedPreferences status17_3 = getSharedPreferences("Status17_3", MODE_PRIVATE);
        final int statusstar17_3 = status17_3.getInt("StatusStar17_3", 0);
        //
        SharedPreferences savestar18 = getSharedPreferences("Savestar18", MODE_PRIVATE);
        final int star18 = savestar18.getInt("Star18", 0);

        SharedPreferences status18 = getSharedPreferences("Status18", MODE_PRIVATE);
        final int statusstar18 = status18.getInt("StatusStar18", 0);
        SharedPreferences status18_2 = getSharedPreferences("Status18_2", MODE_PRIVATE);
        final int statusstar18_2 = status18_2.getInt("StatusStar18", 0);
        SharedPreferences status18_3 = getSharedPreferences("Status18_3", MODE_PRIVATE);
        final int statusstar18_3 = status18_3.getInt("StatusStar18_3", 0);
        //
        //
        SharedPreferences savestar19 = getSharedPreferences("Savestar19", MODE_PRIVATE);
        final int star19 = savestar19.getInt("Star19", 0);

        SharedPreferences status19 = getSharedPreferences("Status19", MODE_PRIVATE);
        final int statusstar19 = status19.getInt("StatusStar19", 0);
        SharedPreferences status19_2 = getSharedPreferences("Status19_2", MODE_PRIVATE);
        final int statusstar19_2 = status19_2.getInt("StatusStar19", 0);
        SharedPreferences status19_3 = getSharedPreferences("Status19_3", MODE_PRIVATE);
        final int statusstar19_3 = status19_3.getInt("StatusStar19_3", 0);
        //
        //
        SharedPreferences savestar20 = getSharedPreferences("Savestar20", MODE_PRIVATE);
        final int star20 = savestar20.getInt("Star20", 0);

        SharedPreferences status20 = getSharedPreferences("Status20", MODE_PRIVATE);
        final int statusstar20 = status20.getInt("StatusStar20", 0);
        SharedPreferences status20_2 = getSharedPreferences("Status20_2", MODE_PRIVATE);
        final int statusstar20_2 = status20_2.getInt("StatusStar20", 0);
        SharedPreferences status20_3 = getSharedPreferences("Status20_3", MODE_PRIVATE);
        final int statusstar20_3 = status20_3.getInt("StatusStar20_3", 0);
        //
        //
        SharedPreferences savestar21 = getSharedPreferences("Savestar21", MODE_PRIVATE);
        final int star21 = savestar21.getInt("Star21", 0);

        SharedPreferences status21 = getSharedPreferences("Status21", MODE_PRIVATE);
        final int statusstar21 = status21.getInt("StatusStar21", 0);
        SharedPreferences status21_2 = getSharedPreferences("Status21_2", MODE_PRIVATE);
        final int statusstar21_2 = status21_2.getInt("StatusStar21", 0);
        SharedPreferences status21_3 = getSharedPreferences("Status21_3", MODE_PRIVATE);
        final int statusstar21_3 = status11_3.getInt("StatusStar21_3", 0);
        //
        //
        SharedPreferences savestar22 = getSharedPreferences("Savestar22", MODE_PRIVATE);
        final int star22 = savestar22.getInt("Star22", 0);

        SharedPreferences status22 = getSharedPreferences("Status22", MODE_PRIVATE);
        final int statusstar22 = status22.getInt("StatusStar22", 0);
        SharedPreferences status22_2 = getSharedPreferences("Status22_2", MODE_PRIVATE);
        final int statusstar22_2 = status22_2.getInt("StatusStar22", 0);
        SharedPreferences status22_3 = getSharedPreferences("Status22_3", MODE_PRIVATE);
        final int statusstar22_3 = status22_3.getInt("StatusStar22_3", 0);
        //
        //
        SharedPreferences savestar23 = getSharedPreferences("Savestar23", MODE_PRIVATE);
        final int star23 = savestar23.getInt("Star23", 0);

        SharedPreferences status23 = getSharedPreferences("Status23", MODE_PRIVATE);
        final int statusstar23 = status23.getInt("StatusStar23", 0);
        SharedPreferences status23_2 = getSharedPreferences("Status23_2", MODE_PRIVATE);
        final int statusstar23_2 = status23_2.getInt("StatusStar23", 0);
        SharedPreferences status23_3 = getSharedPreferences("Status23_3", MODE_PRIVATE);
        final int statusstar23_3 = status23_3.getInt("StatusStar23_3", 0);
        //
        //
        SharedPreferences savestar24 = getSharedPreferences("Savestar24", MODE_PRIVATE);
        final int star24 = savestar24.getInt("Sta2r4", 0);

        SharedPreferences status24 = getSharedPreferences("Status24", MODE_PRIVATE);
        final int statusstar24 = status24.getInt("StatusStar24", 0);
        SharedPreferences status24_2 = getSharedPreferences("Status24_2", MODE_PRIVATE);
        final int statusstar24_2 = status24_2.getInt("StatusStar24", 0);
        SharedPreferences status24_3 = getSharedPreferences("Status24_3", MODE_PRIVATE);
        final int statusstar24_3 = status24_3.getInt("StatusStar24_3", 0);
        //
        //
        SharedPreferences savestar25 = getSharedPreferences("Savestar25", MODE_PRIVATE);
        final int star25 = savestar25.getInt("Star25", 0);

        SharedPreferences status25 = getSharedPreferences("Status25", MODE_PRIVATE);
        final int statusstar25 = status25.getInt("StatusStar25", 0);
        SharedPreferences status25_2 = getSharedPreferences("Status25_2", MODE_PRIVATE);
        final int statusstar25_2 = status25_2.getInt("StatusStar25", 0);
        SharedPreferences status25_3 = getSharedPreferences("Status25_3", MODE_PRIVATE);
        final int statusstar25_3 = status25_3.getInt("StatusStar25_3", 0);
        //
        //
        SharedPreferences savestar26 = getSharedPreferences("Savestar26", MODE_PRIVATE);
        final int star26 = savestar4.getInt("Star26", 0);

        SharedPreferences status26 = getSharedPreferences("Status26", MODE_PRIVATE);
        final int statusstar26 = status26.getInt("StatusStar26", 0);
        SharedPreferences status26_2 = getSharedPreferences("Status26_2", MODE_PRIVATE);
        final int statusstar26_2 = status26_2.getInt("StatusStar26", 0);
        SharedPreferences status26_3 = getSharedPreferences("Status26_3", MODE_PRIVATE);
        final int statusstar26_3 = status26_3.getInt("StatusStar26_3", 0);
        //
        //
        SharedPreferences savestar27 = getSharedPreferences("Savestar27", MODE_PRIVATE);
        final int star27 = savestar27.getInt("Star27", 0);

        SharedPreferences status27 = getSharedPreferences("Status27", MODE_PRIVATE);
        final int statusstar27 = status27.getInt("StatusStar27", 0);
        SharedPreferences status27_2 = getSharedPreferences("Status27_2", MODE_PRIVATE);
        final int statusstar27_2 = status27_2.getInt("StatusStar27", 0);
        SharedPreferences status27_3 = getSharedPreferences("Status27_3", MODE_PRIVATE);
        final int statusstar27_3 = status8_3.getInt("StatusStar27_3", 0);
        //
        SharedPreferences savestar28 = getSharedPreferences("Savestar28", MODE_PRIVATE);
        final int star28 = savestar28.getInt("Star28", 0);

        SharedPreferences status28 = getSharedPreferences("Status28", MODE_PRIVATE);
        final int statusstar28 = status28.getInt("StatusStar28", 0);
        SharedPreferences status28_2 = getSharedPreferences("Status28_2", MODE_PRIVATE);
        final int statusstar28_2 = status28_2.getInt("StatusStar28", 0);
        SharedPreferences status28_3 = getSharedPreferences("Status28_3", MODE_PRIVATE);
        final int statusstar28_3 = status28_3.getInt("StatusStar28_3", 0);
        //
        //
        SharedPreferences savestar29 = getSharedPreferences("Savestar29", MODE_PRIVATE);
        final int star29 = savestar9.getInt("Star29", 0);

        SharedPreferences status29 = getSharedPreferences("Status29", MODE_PRIVATE);
        final int statusstar29 = status29.getInt("StatusStar29", 0);
        SharedPreferences status29_2 = getSharedPreferences("Status29_2", MODE_PRIVATE);
        final int statusstar29_2 = status29_2.getInt("StatusStar29", 0);
        SharedPreferences status29_3 = getSharedPreferences("Status29_3", MODE_PRIVATE);
        final int statusstar29_3 = status29_3.getInt("StatusStar29_3", 0);
        //
        //
        SharedPreferences savestar30 = getSharedPreferences("Savestar30", MODE_PRIVATE);
        final int star30 = savestar10.getInt("Star30", 0);

        SharedPreferences status30 = getSharedPreferences("Status30", MODE_PRIVATE);
        final int statusstar30 = status30.getInt("StatusStar30", 0);
        SharedPreferences status30_2 = getSharedPreferences("Status30_2", MODE_PRIVATE);
        final int statusstar30_2 = status30_2.getInt("StatusStar30", 0);
        SharedPreferences status30_3 = getSharedPreferences("Status30_3", MODE_PRIVATE);
        final int statusstar30_3 = status30_3.getInt("StatusStar30_3", 0);
        //


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

        //stars end




        //условие для звезд по уровнем
        if (star2 == 1){

            if (statusstar2==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status2.edit();
                editor2.putInt("Status2",1);
                editor2.commit();
            }
            stars2.setImageResource(R.drawable.starsendone);
        }else if (star2==2){
            if (statusstar2_2==0) {
                countstars=countstars+2;
                if (statusstar2==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status2.edit();
                editor2.putInt("Status2",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status2_2.edit();
                editor3.putInt("Status2_2",1);
                editor3.commit();
            }
            stars2.setImageResource(R.drawable.starsendtwo);
        }else if (star2==3){
            if (statusstar2_3==0) {
                countstars=countstars+3;
                if (statusstar2==1 && statusstar2_2==0){
                    countstars=countstars-1;
                }else if(statusstar2==0 && statusstar2_2==1 || statusstar2==1 && statusstar2_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status2.edit();
                editor2.putInt("Status2",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status2_2.edit();
                editor3.putInt("Status2_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status2_3.edit();
                editor4.putInt("Status2_3",1);
                editor4.commit();
            }
            stars2.setImageResource(R.drawable.starsendfull);
        }



        if (star3 == 1){

            if (statusstar3==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status3.edit();
                editor2.putInt("Status3",1);
                editor2.commit();
            }
            stars3.setImageResource(R.drawable.starsendone);
        }else if (star3==2){
            if (statusstar3_2==0) {
                countstars=countstars+2;
                if (statusstar3==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status3.edit();
                editor2.putInt("Status3",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status3_2.edit();
                editor3.putInt("Status3_2",1);
                editor3.commit();
            }
            stars3.setImageResource(R.drawable.starsendtwo);
        }else if (star3==3){
            if (statusstar3_3==0) {
                countstars=countstars+3;
                if (statusstar3==1 && statusstar3_2==0){
                    countstars=countstars-1;
                }else if(statusstar3==0 && statusstar3_2==1 || statusstar3==1 && statusstar3_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status3.edit();
                editor2.putInt("Status3",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status3_2.edit();
                editor3.putInt("Status3_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status3_3.edit();
                editor4.putInt("Status3_3",1);
                editor4.commit();
            }
            stars3.setImageResource(R.drawable.starsendfull);
        }


        if (star4 == 1){

            if (statusstar4==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status4.edit();
                editor2.putInt("Status4",1);
                editor2.commit();
            }
            stars4.setImageResource(R.drawable.starsendone);
        }else if (star4==2){
            if (statusstar4_2==0) {
                countstars=countstars+2;
                if (statusstar4==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status4.edit();
                editor2.putInt("Status4",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status4_2.edit();
                editor3.putInt("Status4_2",1);
                editor3.commit();
            }
            stars4.setImageResource(R.drawable.starsendtwo);
        }else if (star4==3){
            if (statusstar4_3==0) {
                countstars=countstars+3;
                if (statusstar4==1 && statusstar4_2==0){
                    countstars=countstars-1;
                }else if(statusstar4==0 && statusstar4_2==1 || statusstar4==1 && statusstar4_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status4.edit();
                editor2.putInt("Status4",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status4_2.edit();
                editor3.putInt("Status4_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status4_3.edit();
                editor4.putInt("Status4_3",1);
                editor4.commit();
            }
            stars4.setImageResource(R.drawable.starsendfull);
        }
        if (star5 == 1){

            if (statusstar5==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status5.edit();
                editor2.putInt("Status5",1);
                editor2.commit();
            }
            stars5.setImageResource(R.drawable.starsendone);
        }else if (star5==2){
            if (statusstar5_2==0) {
                countstars=countstars+2;
                if (statusstar5==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status5.edit();
                editor2.putInt("Status5",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status5_2.edit();
                editor3.putInt("Status5_2",1);
                editor3.commit();
            }
            stars5.setImageResource(R.drawable.starsendtwo);
        }else if (star5==3){
            if (statusstar5_3==0) {
                countstars=countstars+3;
                if (statusstar5==1 && statusstar5_2==0){
                    countstars=countstars-1;
                }else if(statusstar5==0 && statusstar5_2==1 || statusstar5==1 && statusstar5_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status5.edit();
                editor2.putInt("Status5",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status5_2.edit();
                editor3.putInt("Status5_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status5_3.edit();
                editor4.putInt("Status5_3",1);
                editor4.commit();
            }
            stars5.setImageResource(R.drawable.starsendfull);
        }
        if (star6 == 1){

            if (statusstar6==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status6.edit();
                editor2.putInt("Status6",1);
                editor2.commit();
            }
            stars6.setImageResource(R.drawable.starsendone);
        }else if (star6==2){
            if (statusstar6_2==0) {
                countstars=countstars+2;
                if (statusstar6==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status6.edit();
                editor2.putInt("Status6",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status6_2.edit();
                editor3.putInt("Status6_2",1);
                editor3.commit();
            }
            stars6.setImageResource(R.drawable.starsendtwo);
        }else if (star6==3){
            if (statusstar6_3==0) {
                countstars=countstars+3;
                if (statusstar6==1 && statusstar6_2==0){
                    countstars=countstars-1;
                }else if(statusstar6==0 && statusstar6_2==1 || statusstar6==1 && statusstar6_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status6.edit();
                editor2.putInt("Status6",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status6_2.edit();
                editor3.putInt("Status6_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status6_3.edit();
                editor4.putInt("Status4_3",1);
                editor4.commit();
            }
            stars6.setImageResource(R.drawable.starsendfull);
        }
        if (star7 == 1){

            if (statusstar7==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status7.edit();
                editor2.putInt("Status7",1);
                editor2.commit();
            }
            stars7.setImageResource(R.drawable.starsendone);
        }else if (star7==2){
            if (statusstar7_2==0) {
                countstars=countstars+2;
                if (statusstar7==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status7.edit();
                editor2.putInt("Status7",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status7_2.edit();
                editor3.putInt("Status7_2",1);
                editor3.commit();
            }
            stars7.setImageResource(R.drawable.starsendtwo);
        }else if (star7==3){
            if (statusstar7_3==0) {
                countstars=countstars+3;
                if (statusstar7==1 && statusstar7_2==0){
                    countstars=countstars-1;
                }else if(statusstar7==0 && statusstar7_2==1 || statusstar7==1 && statusstar7_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status7.edit();
                editor2.putInt("Status7",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status7_2.edit();
                editor3.putInt("Status7_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status7_3.edit();
                editor4.putInt("Status7_3",1);
                editor4.commit();
            }
            stars7.setImageResource(R.drawable.starsendfull);
        }
        if (star8 == 1){

            if (statusstar8==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status8.edit();
                editor2.putInt("Status8",1);
                editor2.commit();
            }
            stars8.setImageResource(R.drawable.starsendone);
        }else if (star8==2){
            if (statusstar8_2==0) {
                countstars=countstars+2;
                if (statusstar8==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status8.edit();
                editor2.putInt("Status8",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status8_2.edit();
                editor3.putInt("Status8_2",1);
                editor3.commit();
            }
            stars8.setImageResource(R.drawable.starsendtwo);
        }else if (star8==3){
            if (statusstar8_3==0) {
                countstars=countstars+3;
                if (statusstar8==1 && statusstar8_2==0){
                    countstars=countstars-1;
                }else if(statusstar8==0 && statusstar8_2==1 || statusstar8==1 && statusstar8_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status8.edit();
                editor2.putInt("Status8",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status8_2.edit();
                editor3.putInt("Status8_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status8_3.edit();
                editor4.putInt("Status8_3",1);
                editor4.commit();
            }
            stars8.setImageResource(R.drawable.starsendfull);
        }
        if (star9 == 1){

            if (statusstar9==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status9.edit();
                editor2.putInt("Status9",1);
                editor2.commit();
            }
            stars9.setImageResource(R.drawable.starsendone);
        }else if (star9==2){
            if (statusstar9_2==0) {
                countstars=countstars+2;
                if (statusstar9==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status9.edit();
                editor2.putInt("Status9",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status9_2.edit();
                editor3.putInt("Status9_2",1);
                editor3.commit();
            }
            stars9.setImageResource(R.drawable.starsendtwo);
        }else if (star9==3){
            if (statusstar9_3==0) {
                countstars=countstars+3;
                if (statusstar9==1 && statusstar9_2==0){
                    countstars=countstars-1;
                }else if(statusstar9==0 && statusstar9_2==1 || statusstar9==1 && statusstar9_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status9.edit();
                editor2.putInt("Status9",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status9_2.edit();
                editor3.putInt("Status9_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status9_3.edit();
                editor4.putInt("Status9_3",1);
                editor4.commit();
            }
            stars9.setImageResource(R.drawable.starsendfull);
        }
        if (star10 == 1){

            if (statusstar10==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status10.edit();
                editor2.putInt("Status10",1);
                editor2.commit();
            }
            stars10.setImageResource(R.drawable.starsendone);
        }else if (star10==2){
            if (statusstar10_2==0) {
                countstars=countstars+2;
                if (statusstar10==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status10.edit();
                editor2.putInt("Status10",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status10_2.edit();
                editor3.putInt("Status10_2",1);
                editor3.commit();
            }
            stars10.setImageResource(R.drawable.starsendtwo);
        }else if (star10==3){
            if (statusstar10_3==0) {
                countstars=countstars+3;
                if (statusstar10==1 && statusstar10_2==0){
                    countstars=countstars-1;
                }else if(statusstar10==0 && statusstar10_2==1 || statusstar10==1 && statusstar10_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status10.edit();
                editor2.putInt("Status10",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status10_2.edit();
                editor3.putInt("Status10_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status10_3.edit();
                editor4.putInt("Status10_3",1);
                editor4.commit();
            }
            stars10.setImageResource(R.drawable.starsendfull);
        }
        if (star11 == 1){

            if (statusstar11==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status11.edit();
                editor2.putInt("Status11",1);
                editor2.commit();
            }
            stars11.setImageResource(R.drawable.starsendone);
        }else if (star11==2){
            if (statusstar11_2==0) {
                countstars=countstars+2;
                if (statusstar11==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status11.edit();
                editor2.putInt("Status11",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status11_2.edit();
                editor3.putInt("Status11_2",1);
                editor3.commit();
            }
            stars11.setImageResource(R.drawable.starsendtwo);
        }else if (star11==3){
            if (statusstar11_3==0) {
                countstars=countstars+3;
                if (statusstar11==1 && statusstar11_2==0){
                    countstars=countstars-1;
                }else if(statusstar11==0 && statusstar11_2==1 || statusstar11==1 && statusstar11_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status11.edit();
                editor2.putInt("Status11",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status11_2.edit();
                editor3.putInt("Status11_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status11_3.edit();
                editor4.putInt("Status11_3",1);
                editor4.commit();
            }
            stars11.setImageResource(R.drawable.starsendfull);
        }
        if (star12 == 1){

            if (statusstar12==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status12.edit();
                editor2.putInt("Status12",1);
                editor2.commit();
            }
            stars12.setImageResource(R.drawable.starsendone);
        }else if (star12==2){
            if (statusstar12_2==0) {
                countstars=countstars+2;
                if (statusstar12==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status12.edit();
                editor2.putInt("Status12",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status12_2.edit();
                editor3.putInt("Status12_2",1);
                editor3.commit();
            }
            stars12.setImageResource(R.drawable.starsendtwo);
        }else if (star12==3){
            if (statusstar12_3==0) {
                countstars=countstars+3;
                if (statusstar12==1 && statusstar12_2==0){
                    countstars=countstars-1;
                }else if(statusstar12==0 && statusstar12_2==1 || statusstar12==1 && statusstar12_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status12.edit();
                editor2.putInt("Status12",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status12_2.edit();
                editor3.putInt("Status12_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status12_3.edit();
                editor4.putInt("Status12_3",1);
                editor4.commit();
            }
            stars12.setImageResource(R.drawable.starsendfull);
        }



        if (star13 == 1){

            if (statusstar13==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status13.edit();
                editor2.putInt("Status13",1);
                editor2.commit();
            }
            stars13.setImageResource(R.drawable.starsendone);
        }else if (star13==2){
            if (statusstar13_2==0) {
                countstars=countstars+2;
                if (statusstar13==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status13.edit();
                editor2.putInt("Status13",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status13_2.edit();
                editor3.putInt("Status13_2",1);
                editor3.commit();
            }
            stars13.setImageResource(R.drawable.starsendtwo);
        }else if (star13==3){
            if (statusstar13_3==0) {
                countstars=countstars+3;
                if (statusstar13==1 && statusstar13_2==0){
                    countstars=countstars-1;
                }else if(statusstar13==0 && statusstar13_2==1 || statusstar13==1 && statusstar13_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status13.edit();
                editor2.putInt("Status13",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status13_2.edit();
                editor3.putInt("Status13_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status13_3.edit();
                editor4.putInt("Status13_3",1);
                editor4.commit();
            }
            stars13.setImageResource(R.drawable.starsendfull);
        }


        if (star14 == 1){

            if (statusstar14==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status14.edit();
                editor2.putInt("Status14",1);
                editor2.commit();
            }
            stars14.setImageResource(R.drawable.starsendone);
        }else if (star14==2){
            if (statusstar14_2==0) {
                countstars=countstars+2;
                if (statusstar14==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status14.edit();
                editor2.putInt("Status14",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status14_2.edit();
                editor3.putInt("Status14_2",1);
                editor3.commit();
            }
            stars14.setImageResource(R.drawable.starsendtwo);
        }else if (star14==3){
            if (statusstar14_3==0) {
                countstars=countstars+3;
                if (statusstar14==1 && statusstar14_2==0){
                    countstars=countstars-1;
                }else if(statusstar14==0 && statusstar14_2==1 || statusstar14==1 && statusstar14_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status14.edit();
                editor2.putInt("Status14",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status14_2.edit();
                editor3.putInt("Status14_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status14_3.edit();
                editor4.putInt("Status14_3",1);
                editor4.commit();
            }
            stars14.setImageResource(R.drawable.starsendfull);
        }
        if (star15 == 1){

            if (statusstar15==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status15.edit();
                editor2.putInt("Status15",1);
                editor2.commit();
            }
            stars15.setImageResource(R.drawable.starsendone);
        }else if (star15==2){
            if (statusstar15_2==0) {
                countstars=countstars+2;
                if (statusstar15==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status15.edit();
                editor2.putInt("Status15",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status15_2.edit();
                editor3.putInt("Status15_2",1);
                editor3.commit();
            }
            stars15.setImageResource(R.drawable.starsendtwo);
        }else if (star15==3){
            if (statusstar15_3==0) {
                countstars=countstars+3;
                if (statusstar15==1 && statusstar15_2==0){
                    countstars=countstars-1;
                }else if(statusstar15==0 && statusstar15_2==1 || statusstar15==1 && statusstar15_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status15.edit();
                editor2.putInt("Status15",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status15_2.edit();
                editor3.putInt("Status15_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status15_3.edit();
                editor4.putInt("Status15_3",1);
                editor4.commit();
            }
            stars15.setImageResource(R.drawable.starsendfull);
        }
        if (star16 == 1){

            if (statusstar16==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status16.edit();
                editor2.putInt("Status16",1);
                editor2.commit();
            }
            stars16.setImageResource(R.drawable.starsendone);
        }else if (star16==2){
            if (statusstar16_2==0) {
                countstars=countstars+2;
                if (statusstar16==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status16.edit();
                editor2.putInt("Status16",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status16_2.edit();
                editor3.putInt("Status16_2",1);
                editor3.commit();
            }
            stars16.setImageResource(R.drawable.starsendtwo);
        }else if (star16==3){
            if (statusstar16_3==0) {
                countstars=countstars+3;
                if (statusstar16==1 && statusstar16_2==0){
                    countstars=countstars-1;
                }else if(statusstar16==0 && statusstar16_2==1 || statusstar16==1 && statusstar16_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status16.edit();
                editor2.putInt("Status16",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status16_2.edit();
                editor3.putInt("Status16_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status16_3.edit();
                editor4.putInt("Status16_3",1);
                editor4.commit();
            }
            stars16.setImageResource(R.drawable.starsendfull);
        }
        if (star17 == 1){

            if (statusstar17==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status17.edit();
                editor2.putInt("Status17",1);
                editor2.commit();
            }
            stars17.setImageResource(R.drawable.starsendone);
        }else if (star17==2){
            if (statusstar17_2==0) {
                countstars=countstars+2;
                if (statusstar17==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status17.edit();
                editor2.putInt("Status17",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status17_2.edit();
                editor3.putInt("Status17_2",1);
                editor3.commit();
            }
            stars17.setImageResource(R.drawable.starsendtwo);
        }else if (star17==3){
            if (statusstar17_3==0) {
                countstars=countstars+3;
                if (statusstar17==1 && statusstar17_2==0){
                    countstars=countstars-1;
                }else if(statusstar17==0 && statusstar17_2==1 || statusstar17==1 && statusstar17_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status17.edit();
                editor2.putInt("Status17",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status17_2.edit();
                editor3.putInt("Status17_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status17_3.edit();
                editor4.putInt("Status17_3",1);
                editor4.commit();
            }
            stars17.setImageResource(R.drawable.starsendfull);
        }
        if (star18 == 1){

            if (statusstar18==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status18.edit();
                editor2.putInt("Status18",1);
                editor2.commit();
            }
            stars18.setImageResource(R.drawable.starsendone);
        }else if (star18==2){
            if (statusstar18_2==0) {
                countstars=countstars+2;
                if (statusstar18==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status18.edit();
                editor2.putInt("Status18",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status18_2.edit();
                editor3.putInt("Status18_2",1);
                editor3.commit();
            }
            stars18.setImageResource(R.drawable.starsendtwo);
        }else if (star18==3){
            if (statusstar18_3==0) {
                countstars=countstars+3;
                if (statusstar18==1 && statusstar18_2==0){
                    countstars=countstars-1;
                }else if(statusstar18==0 && statusstar18_2==1 || statusstar18==1 && statusstar18_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status18.edit();
                editor2.putInt("Status18",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status18_2.edit();
                editor3.putInt("Status18_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status18_3.edit();
                editor4.putInt("Status18_3",1);
                editor4.commit();
            }
            stars18.setImageResource(R.drawable.starsendfull);
        }
        if (star19 == 1){

            if (statusstar19==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status19.edit();
                editor2.putInt("Status19",1);
                editor2.commit();
            }
            stars9.setImageResource(R.drawable.starsendone);
        }else if (star19==2){
            if (statusstar19_2==0) {
                countstars=countstars+2;
                if (statusstar19==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status19.edit();
                editor2.putInt("Status19",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status19_2.edit();
                editor3.putInt("Status19_2",1);
                editor3.commit();
            }
            stars19.setImageResource(R.drawable.starsendtwo);
        }else if (star19==3){
            if (statusstar19_3==0) {
                countstars=countstars+3;
                if (statusstar19==1 && statusstar19_2==0){
                    countstars=countstars-1;
                }else if(statusstar19==0 && statusstar19_2==1 || statusstar19==1 && statusstar19_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status19.edit();
                editor2.putInt("Status19",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status19_2.edit();
                editor3.putInt("Status19_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status19_3.edit();
                editor4.putInt("Status19_3",1);
                editor4.commit();
            }
            stars19.setImageResource(R.drawable.starsendfull);
        }
        if (star20 == 1){

            if (statusstar20==0){
                countstars=countstars+1;
                SharedPreferences.Editor editor2 = status20.edit();
                editor2.putInt("Status20",1);
                editor2.commit();
            }
            stars20.setImageResource(R.drawable.starsendone);
        }else if (star20==2){
            if (statusstar20_2==0) {
                countstars=countstars+2;
                if (statusstar20==1){
                    countstars=countstars-1;
                }
                SharedPreferences.Editor editor2 = status20.edit();
                editor2.putInt("Status20",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status20_2.edit();
                editor3.putInt("Status20_2",1);
                editor3.commit();
            }
            stars20.setImageResource(R.drawable.starsendtwo);
        }else if (star20==3){
            if (statusstar20_3==0) {
                countstars=countstars+3;
                if (statusstar20==1 && statusstar20_2==0){
                    countstars=countstars-1;
                }else if(statusstar20==0 && statusstar20_2==1 || statusstar20==1 && statusstar20_2==1){
                    countstars=countstars-2;
                }
                SharedPreferences.Editor editor2 = status20.edit();
                editor2.putInt("Status20",1);
                editor2.commit();
                SharedPreferences.Editor editor3 = status20_2.edit();
                editor3.putInt("Status20_2",1);
                editor3.commit();
                SharedPreferences.Editor editor4 = status20_3.edit();
                editor4.putInt("Status20_3",1);
                editor4.commit();
            }
            stars20.setImageResource(R.drawable.starsendfull);
        }



        TextView countstr = (TextView) findViewById(R.id.countstars);

            String txtcount = Integer.toString(countstars);

            countstr.setText(txtcount);





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
        if (level>=2) {
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
        if (level>=3) {
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
        if (level>=4) {
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
        if (level>=5) {

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
        if (level>=6) {

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
        if (level>=7) {

            TextView textView7 = (TextView) findViewById(R.id.textView7);
            textView7.setBackgroundResource(R.drawable.btn_gamelevels);
            textView7.setText("7");
            textView7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level7.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }

        if (level>=8) {

            TextView textView8 = (TextView) findViewById(R.id.textView8);
            textView8.setBackgroundResource(R.drawable.btn_gamelevels);
            textView8.setText("8");
            textView8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level8.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (level>=9) {

            TextView textView9 = (TextView) findViewById(R.id.textView9);
            textView9.setBackgroundResource(R.drawable.btn_gamelevels);
            textView9.setText("9");
            textView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level9.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (level>=10) {

            TextView textView10 = (TextView) findViewById(R.id.textView10);
            textView10.setBackgroundResource(R.drawable.btn_gamelevels);
            textView10.setText("10");
            textView10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level10.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (level>=11) {

            TextView textView11 = (TextView) findViewById(R.id.textView11);
            textView11.setBackgroundResource(R.drawable.btn_gamelevels);
            textView11.setText("11");
            textView11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level11.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (level>=12) {

            TextView textView12 = (TextView) findViewById(R.id.textView12);
            textView12.setBackgroundResource(R.drawable.btn_gamelevels);
            textView12.setText("12");
            textView12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level12.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (level>=13) {

            TextView textView13 = (TextView) findViewById(R.id.textView13);
            textView13.setBackgroundResource(R.drawable.btn_gamelevels);
            textView13.setText("13");
            textView13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level13.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }

        if (level>=14) {

            TextView textView14 = (TextView) findViewById(R.id.textView14);
            textView14.setBackgroundResource(R.drawable.btn_gamelevels);
            textView14.setText("14");
            textView14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level14.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (level>=15) {

            TextView textView15 = (TextView) findViewById(R.id.textView15);
            textView15.setBackgroundResource(R.drawable.btn_gamelevels);
            textView15.setText("15");
            textView15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level15.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                }
            });
        }
        if (level>=16) {

            TextView textView16 = (TextView) findViewById(R.id.textView16);
            textView16.setBackgroundResource(R.drawable.btn_gamelevels);
            textView16.setText("16");
            textView16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        if (reshbtn.resh == true) {
                            soundPlay(btnsoung);
                        } else {

                        }
                        Intent intent = new Intent(GameLevels.this, Level16.class);
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