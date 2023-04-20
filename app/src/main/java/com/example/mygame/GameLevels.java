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
            if (Variables.count2==true){
            Variables.countstar=Variables.countstar+1;
            Variables.count2=false;
            }
            stars2.setImageResource(R.drawable.starsendone);
        }else if (Variables.star2==2){
            if (Variables.count2_2==true) {
                Variables.countstar = Variables.countstar + 2;
                if (Variables.count2==false){
                    Variables.countstar=Variables.countstar-1;
                }
                Variables.count2_2=false;
                Variables.count2=false;
            }
            stars2.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star2==3){
            if (Variables.count2_3==true) {
                Variables.countstar = Variables.countstar + 3;
                if (Variables.count2==false && Variables.count2_2==true){
                    Variables.countstar=Variables.countstar-1;
                }else if(Variables.count2==true && Variables.count2_2==false || Variables.count2==false && Variables.count2_2==false){
                    Variables.countstar=Variables.countstar-2;
                }
                Variables.count2_3=false;
                Variables.count2_2=false;
                Variables.count2=false;
            }
            stars2.setImageResource(R.drawable.starsendfull);
        }

        if (Variables.star3 == 1){
            if (Variables.count3==true){
                Variables.countstar=Variables.countstar+1;
                Variables.count3=false;
            }

            stars3.setImageResource(R.drawable.starsendone);
        }else if (Variables.star3==2) {
            if (Variables.count3_2 == true) {
                Variables.countstar = Variables.countstar + 2;
            }
            if (Variables.count3 == false) {
                Variables.countstar = Variables.countstar - 1;
            }
            Variables.count3_2 = false;
            Variables.count3 = false;

            stars3.setImageResource(R.drawable.starsendtwo);


        }else if (Variables.star3==3){
            if (Variables.count3_3==true) {
                Variables.countstar = Variables.countstar + 3;
                if (Variables.count3 == false && Variables.count3_2 == true) {
                    Variables.countstar = Variables.countstar - 1;
                } else if (Variables.count3 == true && Variables.count3_2 == false || Variables.count3 == false && Variables.count3_2 == false) {
                    Variables.countstar = Variables.countstar - 2;
                }
                Variables.count3_3 = false;
                Variables.count3_2 = false;
                Variables.count3 = false;
            }
            stars3.setImageResource(R.drawable.starsendfull);

        }
        if (Variables.star4 == 1){
            if (Variables.count4==true){
                Variables.countstar=Variables.countstar+1;
                Variables.count4=false;
            }

            stars4.setImageResource(R.drawable.starsendone);
        }else if (Variables.star4==2){
            if (Variables.count4_2==true) {
                Variables.countstar = Variables.countstar + 2;
                if (Variables.count4==false){
                    Variables.countstar=Variables.countstar-1;
                }
                Variables.count4_2=false;
                Variables.count4=false;
            }
            stars4.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star4==3){
            if (Variables.count4_3==true) {
                Variables.countstar = Variables.countstar + 3;
                if (Variables.count4==false && Variables.count4_2==true){
                    Variables.countstar=Variables.countstar-1;
                }else if(Variables.count4==true && Variables.count4_2==false || Variables.count4==false && Variables.count4_2==false){
                    Variables.countstar=Variables.countstar-2;
                }
                Variables.count4_3=false;
                Variables.count4_2=false;
                Variables.count4=false;
            }
            stars4.setImageResource(R.drawable.starsendfull);
        }
        if (Variables.star5 == 1){
            if (Variables.count5==true){
                Variables.countstar=Variables.countstar+1;
                Variables.count5=false;
            }

            stars5.setImageResource(R.drawable.starsendone);
        }else if (Variables.star5==2){
            if (Variables.count5_2==true) {
                Variables.countstar = Variables.countstar + 2;
                if (Variables.count5==false){
                    Variables.countstar=Variables.countstar-1;
                }
                Variables.count5_2=false;
                Variables.count5=false;
            }
            stars5.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star5==3){
            if (Variables.count5_3==true) {
                Variables.countstar = Variables.countstar + 3;
                if (Variables.count5==false && Variables.count5_2==true){
                    Variables.countstar=Variables.countstar-1;
                }else if(Variables.count5==true && Variables.count5_2==false || Variables.count5==false && Variables.count5_2==false){
                    Variables.countstar=Variables.countstar-2;
                }
                Variables.count5_3=false;
                Variables.count5_2=false;
                Variables.count5=false;
            }
            stars5.setImageResource(R.drawable.starsendfull);
        }
        if (Variables.star6 == 1){
            if (Variables.count6==true){
                Variables.countstar=Variables.countstar+1;
                Variables.count6=false;
            }
            stars6.setImageResource(R.drawable.starsendone);
        }else if (Variables.star6==2){
            if (Variables.count6_2==true) {
                Variables.countstar = Variables.countstar + 2;
                if (Variables.count6==false){
                    Variables.countstar=Variables.countstar-1;
                }
                Variables.count6_2=false;
                Variables.count6=false;
            }
            stars6.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star6==3){
            if (Variables.count6_3==true) {
                Variables.countstar = Variables.countstar + 3;
                if (Variables.count6==false && Variables.count6_2==true){
                    Variables.countstar=Variables.countstar-1;
                }else if(Variables.count6==true && Variables.count6_2==false || Variables.count6==false && Variables.count6_2==false){
                    Variables.countstar=Variables.countstar-2;
                }
                Variables.count6_3=false;
                Variables.count6_2=false;
                Variables.count6=false;
            }
            stars6.setImageResource(R.drawable.starsendfull);
        }
        if (Variables.star7 == 1){
            if (Variables.count7==true){
                Variables.countstar=Variables.countstar+1;
                Variables.count7=false;
            }
            stars7.setImageResource(R.drawable.starsendone);
        }else if (Variables.star7==2){
            if (Variables.count7_2==true) {
                Variables.countstar = Variables.countstar + 2;
                if (Variables.count7==false){
                    Variables.countstar=Variables.countstar-1;
                }
                Variables.count7_2=false;
                Variables.count7=false;
            }
            stars7.setImageResource(R.drawable.starsendtwo);
        }else if (Variables.star7==3){
            if (Variables.count7_3==true) {
                Variables.countstar = Variables.countstar + 3;
                if (Variables.count7==false && Variables.count7_2==true){
                    Variables.countstar=Variables.countstar-1;
                }else if(Variables.count7==true && Variables.count7_2==false || Variables.count7==false && Variables.count7_2==false){
                    Variables.countstar=Variables.countstar-2;
                }
                Variables.count7_3=false;
                Variables.count7_2=false;
                Variables.count7=false;
            }
            stars7.setImageResource(R.drawable.starsendfull);
        }


        TextView countstr = (TextView) findViewById(R.id.countstars);
        String txtcount = Integer.toString(Variables.countstar);

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
        if (Variables.progresslvl>=7) {

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