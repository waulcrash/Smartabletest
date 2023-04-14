package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
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