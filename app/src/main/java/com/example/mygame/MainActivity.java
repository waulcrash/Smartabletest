package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  long backPressedTime;
    private Toast backToast;
    Setting reshbtn= new Setting();
    public int reshmain;
    private MediaPlayer btnsoung;
    Dialog setting;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.activity_main);
        Button btnstart = (Button) findViewById(R.id.mstart);
        Button btnsetting = (Button) findViewById(R.id.msetting);
        btnsoung=MediaPlayer.create(this,R.raw.btnsoung);

        setting = new Dialog(this); //new dialog window
        setting.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрытие
        setting.setContentView(R.layout.activity_setting);  //путь диалога
        setting.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //прозрачность
        setting.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setting.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        setting.setCancelable(false); //запрет на снятие диалога кнопкой назад

        btnstart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }

                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });

        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }

                        setting.show();
                    setting.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


                }catch (Exception e){

                }

            }
        });
        TextView btnclosesetting = (TextView)setting.findViewById(R.id.button_back);
        btnclosesetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    setting.dismiss(); //закрытие диалога
                    w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
                    w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

                }catch (Exception e){

                }

            }
        });


        Button btnsound =(Button)setting.findViewById(R.id.btnsong);
        btnsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (reshbtn.resh==false){
                        btnsound.setText(R.string.settingvick);
                        soundPlay(btnsoung);
                        reshbtn.resh=true;

                    }else{
                        btnsound.setText(R.string.settingvkl);
                        reshbtn.resh=false;
                    }
                }catch (Exception e){

                }
            }
        });

        Button restart =(Button)setting.findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh == true) {
                        soundPlay(btnsoung);
                    } else {

                    }

                    SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                    final int level = save.getInt("level", 1);
                    SharedPreferences.Editor editor = save.edit();
                    editor.putInt("level",1);
                    editor.commit();

                    //
                    SharedPreferences savestar2 = getSharedPreferences("Savestar2", MODE_PRIVATE);
                    final int star2 = savestar2.getInt("Star2", 0);
                    SharedPreferences.Editor editor2 = savestar2.edit();
                    editor2.putInt("Star2",0);
                    editor2.commit();
                    SharedPreferences status2 = getSharedPreferences("Status2", MODE_PRIVATE);
                    final int statusstar2 = status2.getInt("StatusStar2", 0);
                    SharedPreferences.Editor editor3 = status2.edit();
                    editor3.putInt("StatusStar2",0);
                    editor3.commit();
                    SharedPreferences status2_2 = getSharedPreferences("Status2_2", MODE_PRIVATE);
                    final int statusstar2_2 = status2_2.getInt("StatusStar2_2", 0);
                    SharedPreferences.Editor editor4 = status2_2.edit();
                    editor4.putInt("StatusStar2_2",0);
                    editor4.commit();
                    SharedPreferences status2_3 = getSharedPreferences("Status2_3", MODE_PRIVATE);
                    final int statusstar2_3 = status2_3.getInt("StatusStar2_3", 0);
                    SharedPreferences.Editor editor5 = status2_3.edit();
                    editor4.putInt("StatusStar2_3",0);
                    editor4.commit();
                    //
                    //
                    SharedPreferences savestar3 = getSharedPreferences("Savestar3", MODE_PRIVATE);
                    final int star3 = savestar3.getInt("Star3", 0);
                    SharedPreferences.Editor editor6 = savestar3.edit();
                    editor6.putInt("Star3",0);
                    editor6.commit();
                    SharedPreferences status3 = getSharedPreferences("Status3", MODE_PRIVATE);
                    final int statusstar3 = status3.getInt("StatusStar3", 0);
                    SharedPreferences.Editor editor7 = status3.edit();
                    editor7.putInt("StatusStar3",0);
                    editor7.commit();
                    SharedPreferences status3_2 = getSharedPreferences("Status3_2", MODE_PRIVATE);
                    final int statusstar3_2 = status3_2.getInt("StatusStar3_2", 0);
                    SharedPreferences.Editor editor8 = status3_2.edit();
                    editor8.putInt("StatusStar3_2",0);
                    editor8.commit();
                    SharedPreferences status3_3 = getSharedPreferences("Status3_3", MODE_PRIVATE);
                    final int statusstar3_3 = status3_3.getInt("StatusStar3_3", 0);
                    SharedPreferences.Editor editor9 = status3_3.edit();
                    editor9.putInt("StatusStar3_3",0);
                    editor9.commit();
                    //
                    //
                    SharedPreferences savestar4 = getSharedPreferences("Savestar4", MODE_PRIVATE);
                    final int star4 = savestar4.getInt("Star4", 0);
                    SharedPreferences.Editor editor10 = savestar4.edit();
                    editor10.putInt("Star4",0);
                    editor10.commit();
                    SharedPreferences status4 = getSharedPreferences("Status4", MODE_PRIVATE);
                    final int statusstar4 = status4.getInt("StatusStar4", 0);
                    SharedPreferences.Editor editor11 = status4.edit();
                    editor11.putInt("StatusStar4",0);
                    editor11.commit();
                    SharedPreferences status4_2 = getSharedPreferences("Status4_2", MODE_PRIVATE);
                    final int statusstar4_2 = status4_2.getInt("StatusStar4_2", 0);
                    SharedPreferences.Editor editor12 = status4_2.edit();
                    editor12.putInt("StatusStar4_2",0);
                    editor12.commit();
                    SharedPreferences status4_3 = getSharedPreferences("Status4_3", MODE_PRIVATE);
                    final int statusstar4_3 = status4_3.getInt("StatusStar4_3", 0);
                    SharedPreferences.Editor editor13 = status4_3.edit();
                    editor13.putInt("StatusStar4_3",0);
                    editor13.commit();
                    //
                    //
                    SharedPreferences savestar5 = getSharedPreferences("Savestar5", MODE_PRIVATE);
                    final int star5 = savestar5.getInt("Star5", 0);
                    SharedPreferences.Editor editor14 = savestar5.edit();
                    editor14.putInt("Star5",0);
                    editor14.commit();
                    SharedPreferences status5 = getSharedPreferences("Status5", MODE_PRIVATE);
                    final int statusstar5 = status5.getInt("StatusStar5", 0);
                    SharedPreferences.Editor editor15 = status5.edit();
                    editor15.putInt("StatusStar5",0);
                    editor15.commit();
                    SharedPreferences status5_2 = getSharedPreferences("Status5_2", MODE_PRIVATE);
                    final int statusstar5_2 = status5_2.getInt("StatusStar5_2", 0);
                    SharedPreferences.Editor editor16 = status5_2.edit();
                    editor16.putInt("StatusStar5_2",0);
                    editor16.commit();
                    SharedPreferences status5_3 = getSharedPreferences("Status5_3", MODE_PRIVATE);
                    final int statusstar5_3 = status5_3.getInt("StatusStar5_3", 0);
                    SharedPreferences.Editor editor17 = status5_3.edit();
                    editor17.putInt("StatusStar5_3",0);
                    editor17.commit();
                    //
                    //
                    SharedPreferences savestar6 = getSharedPreferences("Savestar6", MODE_PRIVATE);
                    final int star6 = savestar6.getInt("Star6", 0);
                    SharedPreferences.Editor editor18 = savestar6.edit();
                    editor18.putInt("Star6",0);
                    editor18.commit();
                    SharedPreferences status6 = getSharedPreferences("Status6", MODE_PRIVATE);
                    final int statusstar6 = status6.getInt("StatusStar6", 0);
                    SharedPreferences.Editor editor19 = status6.edit();
                    editor19.putInt("StatusStar6",0);
                    editor19.commit();
                    SharedPreferences status6_2 = getSharedPreferences("Status6_2", MODE_PRIVATE);
                    final int statusstar6_2 = status6_2.getInt("StatusStar6_2", 0);
                    SharedPreferences.Editor editor20 = status6_2.edit();
                    editor20.putInt("StatusStar6_2",0);
                    editor20.commit();
                    SharedPreferences status6_3 = getSharedPreferences("Status6_3", MODE_PRIVATE);
                    final int statusstar6_3 = status6_3.getInt("StatusStar6_3", 0);
                    SharedPreferences.Editor editor21 = status6_3.edit();
                    editor21.putInt("StatusStar6_3",0);
                    editor21.commit();
                    //
                    //
                    SharedPreferences savestar7 = getSharedPreferences("Savestar7", MODE_PRIVATE);
                    final int star7 = savestar7.getInt("Star7", 0);
                    SharedPreferences.Editor editor22 = savestar7.edit();
                    editor22.putInt("Star7",0);
                    editor22.commit();
                    SharedPreferences status7 = getSharedPreferences("Status7", MODE_PRIVATE);
                    final int statusstar7 = status7.getInt("StatusStar7", 0);
                    SharedPreferences.Editor editor23 = status7.edit();
                    editor23.putInt("StatusStar7",0);
                    editor23.commit();
                    SharedPreferences status7_2 = getSharedPreferences("Status7_2", MODE_PRIVATE);
                    final int statusstar7_2 = status7_2.getInt("StatusStar7_2", 0);
                    SharedPreferences.Editor editor24 = status7_2.edit();
                    editor24.putInt("StatusStar7_2",0);
                    editor24.commit();
                    SharedPreferences status7_3 = getSharedPreferences("Status7_3", MODE_PRIVATE);
                    final int statusstar7_3 = status7_3.getInt("StatusStar7_3", 0);
                    SharedPreferences.Editor editor25 = status7_3.edit();
                    editor25.putInt("StatusStar7_3",0);
                    editor25.commit();
                    //
                    //
                    SharedPreferences savestar8 = getSharedPreferences("Savestar8", MODE_PRIVATE);
                    final int star8 = savestar8.getInt("Star8", 0);
                    SharedPreferences.Editor editor26 = savestar8.edit();
                    editor26.putInt("Star8",0);
                    editor26.commit();
                    SharedPreferences status8 = getSharedPreferences("Status8", MODE_PRIVATE);
                    final int statusstar8 = status8.getInt("StatusStar8", 0);
                    SharedPreferences.Editor editor27 = status8.edit();
                    editor27.putInt("StatusStar8",0);
                    editor27.commit();
                    SharedPreferences status8_2 = getSharedPreferences("Status8_2", MODE_PRIVATE);
                    final int statusstar8_2 = status8_2.getInt("StatusStar8_2", 0);
                    SharedPreferences.Editor editor28 = status8_2.edit();
                    editor28.putInt("StatusStar8_2",0);
                    editor28.commit();
                    SharedPreferences status8_3 = getSharedPreferences("Status8_3", MODE_PRIVATE);
                    final int statusstar8_3 = status8_3.getInt("StatusStar8_3", 0);
                    SharedPreferences.Editor editor29 = status8_3.edit();
                    editor29.putInt("StatusStar8_3",0);
                    editor29.commit();
                    //
                    //
                    SharedPreferences savestar9 = getSharedPreferences("Savestar9", MODE_PRIVATE);
                    final int star9 = savestar9.getInt("Star9", 0);
                    SharedPreferences.Editor editor30 = savestar9.edit();
                    editor30.putInt("Star9",0);
                    editor30.commit();
                    SharedPreferences status9 = getSharedPreferences("Status9", MODE_PRIVATE);
                    final int statusstar9 = status9.getInt("StatusStar9", 0);
                    SharedPreferences.Editor editor31 = status9.edit();
                    editor31.putInt("StatusStar9",0);
                    editor31.commit();
                    SharedPreferences status9_2 = getSharedPreferences("Status9_2", MODE_PRIVATE);
                    final int statusstar9_2 = status9_2.getInt("StatusStar9_2", 0);
                    SharedPreferences.Editor editor32 = status9_2.edit();
                    editor32.putInt("StatusStar9_2",0);
                    editor32.commit();
                    SharedPreferences status9_3 = getSharedPreferences("Status9_3", MODE_PRIVATE);
                    final int statusstar9_3 = status9_3.getInt("StatusStar9_3", 0);
                    SharedPreferences.Editor editor33 = status9_3.edit();
                    editor33.putInt("StatusStar9_3",0);
                    editor33.commit();
                    //
                    //
                    SharedPreferences savestar10 = getSharedPreferences("Savestar10", MODE_PRIVATE);
                    final int star10 = savestar10.getInt("Star10", 0);
                    SharedPreferences.Editor editor34 = savestar10.edit();
                    editor34.putInt("Star10",0);
                    editor34.commit();
                    SharedPreferences status10 = getSharedPreferences("Status10", MODE_PRIVATE);
                    final int statusstar10 = status10.getInt("StatusStar10", 0);
                    SharedPreferences.Editor editor35 = status10.edit();
                    editor35.putInt("StatusStar10",0);
                    editor35.commit();
                    SharedPreferences status10_2 = getSharedPreferences("Status10_2", MODE_PRIVATE);
                    final int statusstar10_2 = status10_2.getInt("StatusStar10_2", 0);
                    SharedPreferences.Editor editor36 = status10_2.edit();
                    editor36.putInt("StatusStar10_2",0);
                    editor36.commit();
                    SharedPreferences status10_3 = getSharedPreferences("Status10_3", MODE_PRIVATE);
                    final int statusstar10_3 = status10_3.getInt("StatusStar10_3", 0);
                    SharedPreferences.Editor editor37 = status10_3.edit();
                    editor37.putInt("StatusStar10_3",0);
                    editor37.commit();
                    //


                } catch (Exception e) {

                }
            }
        });

        Button btnmusic=(Button)setting.findViewById(R.id.btnmusic);
        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.reshmusic==false){
                        btnmusic.setText(R.string.settingvick);
                        startmusic();
                        reshbtn.reshmusic=true;

                    }else{
                        btnmusic.setText(R.string.settingvkl);
                        stoptmusic();
                        reshbtn.reshmusic=false;
                    }
                }catch (Exception e){

                }
            }
        });
        if (reshbtn.resh==false) {
            btnsound.setText(R.string.settingvkl);
        }else{
            btnsound.setText(R.string.settingvick);
        }
        if (reshbtn.reshmusic==false) {
            btnmusic.setText(R.string.settingvkl);
        }else{
            btnmusic.setText(R.string.settingvick);
        }


    }

    public void startmusic(){
        startService(new Intent(this, MyService.class));
    }
    public void stoptmusic(){
        stopService(new Intent(this, MyService.class));
    }



    @Override
    public void onBackPressed() {


        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            stoptmusic();
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();

    }
    public  void soundPlay(MediaPlayer sound){
        sound.start();
        sound.setVolume(30,30);
    }
}