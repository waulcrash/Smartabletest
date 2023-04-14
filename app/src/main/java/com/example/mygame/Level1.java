package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Level1 extends AppCompatActivity {

    Dialog dialog;
    Dialog dialogEnd;
    Dialog setting;
    private  long backPressedTime;
    private Toast backToast;
    Array array = new Array();
    public int count =0;
    public int numleft;
    public int numright;
    public int numleft2;
    public int numright2;
    public int numquest;
    public int o1,o2,o3,o4,o5;
    Setting reshbtn= new Setting();
    public int reshlvl;
    private MediaPlayer btnsoung;
    private MediaPlayer btnsounderr;
    private MediaPlayer btnsoundnice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.level1); //текст


        final TextView img_l=(TextView) findViewById(R.id.img_l);

        final TextView img_r=(TextView) findViewById(R.id.img_r);

        final TextView img_l2=(TextView) findViewById(R.id.img_l2);

        final TextView img_r2=(TextView) findViewById(R.id.img_r2);

        final TextView imgtext=(TextView) findViewById(R.id.imgtext);


        //sound
        btnsoung=MediaPlayer.create(this,R.raw.btnsoung);
        btnsounderr=MediaPlayer.create(this,R.raw.btnsonderr);
        btnsoundnice=MediaPlayer.create(this,R.raw.btnsoundnice);



        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        dialog = new Dialog(this); //new dialog window
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрытие
        dialog.setContentView(R.layout.previesdia);  //путь диалога
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);//прозрачность
        dialog.setCancelable(false); //запрет на снятие диалога кнопкой назад
        TextView txttimer = (TextView) findViewById(R.id.timer);

        //button закр.диалог нц
        TextView btnclose = (TextView)dialog.findViewById(R.id.btnclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(Level1.this,GameLevels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
                dialog.dismiss(); //закрытие диалога
            }
        });

        //анимация

        final Animation a = AnimationUtils.loadAnimation(Level1.this,R.anim.alpha);
        final Animation b = AnimationUtils.loadAnimation(Level1.this,R.anim.alpha);
        final Animation c = AnimationUtils.loadAnimation(Level1.this,R.anim.alpha);
        final Animation d = AnimationUtils.loadAnimation(Level1.this,R.anim.alpha);
        final Animation e = AnimationUtils.loadAnimation(Level1.this,R.anim.alpha);


        //анимация
        //button кц
        setting = new Dialog(this); //new dialog window
        setting.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрытие
        setting.setContentView(R.layout.activity_setting);  //путь диалога
        setting.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //прозрачность
        setting.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setting.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        setting.setCancelable(false); //запрет на снятие диалога кнопкой назад

        ImageView btnsetting = (ImageView) findViewById(R.id.imagesetting);

        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnsetting.startAnimation(e);

                    try {
                        if (reshbtn.resh==true){
                            soundPlay(btnsoung);
                        }
                        if (count==0){

                            setting.show();
                        }else {
                            backToast = Toast.makeText(getBaseContext(), "Вы не можете зайти в настройки, как начали этап", Toast.LENGTH_SHORT);
                            backToast.show();
                        }

                    }catch (Exception e){

                    }






            }
        });

        Button btnclosesetting = (Button) setting.findViewById(R.id.button_back);
        btnclosesetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
                    w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
                    setting.dismiss(); //закрытие диалога


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

        Button btnmusic = (Button)setting.findViewById(R.id.btnmusic);
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





        //button продолжить

        Button btnconti = (Button)dialog.findViewById(R.id.btnconti);
        btnconti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    dialog.dismiss();


                }catch (Exception e){

                }
            }
        });


        dialog.show(); //показ диалога

        //-------------------------------------------------------------------------
        dialogEnd = new Dialog(this); //new dialog window
        dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрытие
        dialogEnd.setContentView(R.layout.diaend);  //путь диалога
        dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //прозрачность
        dialogEnd.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        dialogEnd.setCancelable(false); //запрет на снятие диалога кнопкой назад



        //button закр.диалог нц
        TextView btnclose2 = (TextView)dialogEnd.findViewById(R.id.btnclose);
        btnclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(Level1.this,GameLevels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
                dialogEnd.dismiss(); //закрытие диалога
            }
        });
        //button кц

        //button продолжить

        Button btnconti2 = (Button)dialogEnd.findViewById(R.id.btnconti);
        btnconti2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(Level1.this,Level2.class);
                    startActivity(intent);finish();

                }catch (Exception e){

                }
                dialogEnd.dismiss();
            }
        });



        //---------------------------------------------------------------------------

        TextView timer = (TextView) findViewById(R.id.timer);
        timer.setText("X");



        Button btnback = (Button) findViewById(R.id.buttonback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh==true){
                        soundPlay(btnsoung);
                    }
                    else{

                    }
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

        //massive progress
        final int[] progress ={
                R.id.point1,  R.id.point2,  R.id.point3,  R.id.point4,  R.id.point5,  R.id.point6,
                R.id.point7,  R.id.point8,  R.id.point9,  R.id.point10,  R.id.point11,  R.id.point12,
                R.id.point13,  R.id.point14,  R.id.point15,  R.id.point16,  R.id.point17,  R.id.point18,
                R.id.point19,  R.id.point20
        };
        //massive progress



            img_l.setText(array.stringbtn1[0]);
            img_r.setText(array.stringbtn1[1]);
            img_l2.setText(array.stringbtn1[2]);
            img_r2.setText(array.stringbtn1[3]);
            imgtext.setText(array.stringbtn1[4]);


        ImageView starses = (ImageView)dialogEnd.findViewById(R.id.star);
        TextView nameprog = (TextView)dialogEnd.findViewById(R.id.progreename);
        TextView txtprogressend =(TextView)dialogEnd.findViewById(R.id.time);


        starses.setImageResource(R.drawable.starsendfull);
        nameprog.setText(R.string.lvl1txtend);
        txtprogressend.setText("0:00:00");








        //обработка нажатия

            numleft = array.power1[0];
            numright = array.power1[1];
            numleft2 = array.power1[2];
            numright2 = array.power1[3];
            numquest = array.power1[4];
        o1=0;
        o2=1;
        o3=2;
        o4=3;
        o5=4;
        ImageView imghp=(ImageView) findViewById(R.id.hp);

        imghp.setImageResource(R.drawable.hpblocked);








        img_l.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //касание


                if (event.getAction()==MotionEvent.ACTION_DOWN){

                    //если коснулся
                    img_r.setEnabled(false);
                    img_l2.setEnabled(false);
                    img_r2.setEnabled(false);
                    img_l.startAnimation(a);


                    if (numleft==numquest){
                        if (reshbtn.resh==true){
                            soundPlay(btnsoundnice);
                        }
                    }else if (reshbtn.resh==true){
                        soundPlay(btnsounderr);
                    }



                }else if (event.getAction()==MotionEvent.ACTION_UP){
                    if (numleft==numquest){
                        if (count<20){

                            count=count+1;

                            img_l.setText(array.stringbtn1[o1+5]);
                            img_r.setText(array.stringbtn1[o2+5]);
                            img_l2.setText(array.stringbtn1[o3+5]);
                            img_r2.setText(array.stringbtn1[o4+5]);
                            imgtext.setText(array.stringbtn1[o5+5]);
                            next();
                            if (count==1){

                            }
                        }
                    }
                    else{
                        if(count>0){
                            if(count==1){
                                count=0;

                                img_l.setText(array.stringbtn1[0]);
                                img_r.setText(array.stringbtn1[1]);
                                img_l2.setText(array.stringbtn1[2]);
                                img_r2.setText(array.stringbtn1[3]);
                                imgtext.setText(array.stringbtn1[4]);
                                stay();

                            }else{
                                count=count-2;
                                img_l.setText(array.stringbtn1[o1-10]);
                                img_r.setText(array.stringbtn1[o2-10]);
                                img_l2.setText(array.stringbtn1[o3-10]);
                                img_r2.setText(array.stringbtn1[o4-10]);
                                imgtext.setText(array.stringbtn1[o5-10]);
                                back();



                            }
                    }

                    }
                    for (int i =0;i<19;i++){
                        TextView tv= findViewById(progress[i]);
                        tv.setBackgroundResource(R.drawable.style_points);
                    }
                    for (int i =0;i<count;i++){
                        TextView tv= findViewById(progress[i]);
                        tv.setBackgroundResource(R.drawable.style_points_green);
                    }
                    if (count==20){
                        //end
                       dialogEnd.show();


                    }else {

                        img_r.setEnabled(true);
                        img_l2.setEnabled(true);
                        img_r2.setEnabled(true);
                    }



                }

                //касание


                return true;
            }
        });

        img_r.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //касание

                if (event.getAction()==MotionEvent.ACTION_DOWN){

                    //если коснулся
                    img_l.setEnabled(false);
                    img_l2.setEnabled(false);
                    img_r2.setEnabled(false);
                    img_r.startAnimation(b);

                    if (numright==numquest){
                        if (reshbtn.resh==true){
                            soundPlay(btnsoundnice);
                        }


                    }else if (reshbtn.resh==true){
                        soundPlay(btnsounderr);
                    }


                }else if (event.getAction()==MotionEvent.ACTION_UP){
                    //если опустил
                    if (numright==numquest){
                        if (count<20){
                            count=count+1;
                            img_l.setText(array.stringbtn1[o1+5]);
                            img_r.setText(array.stringbtn1[o2+5]);
                            img_l2.setText(array.stringbtn1[o3+5]);
                            img_r2.setText(array.stringbtn1[o4+5]);
                            imgtext.setText(array.stringbtn1[o5+5]);
                            next();
                            if (count==1){

                            }
                        }
                    }
                    else{
                        if(count>0){
                            if(count==1){
                                count=0;

                                img_l.setText(array.stringbtn1[0]);
                                img_r.setText(array.stringbtn1[1]);
                                img_l2.setText(array.stringbtn1[2]);
                                img_r2.setText(array.stringbtn1[3]);
                                imgtext.setText(array.stringbtn1[4]);
                                stay();

                            }else{
                                count=count-2;
                                img_l.setText(array.stringbtn1[o1-10]);
                                img_r.setText(array.stringbtn1[o2-10]);
                                img_l2.setText(array.stringbtn1[o3-10]);
                                img_r2.setText(array.stringbtn1[o4-10]);
                                imgtext.setText(array.stringbtn1[o5-10]);
                                back();


                            }
                        }

                    }


                    for (int i =0;i<19;i++){
                        TextView tv= findViewById(progress[i]);
                        tv.setBackgroundResource(R.drawable.style_points);
                    }
                    for (int i =0;i<count;i++){
                        TextView tv= findViewById(progress[i]);
                        tv.setBackgroundResource(R.drawable.style_points_green);
                    }
                    if (count==20){
                        //end
                        dialogEnd.show();

                    }else {

                        img_r2.setEnabled(true);
                        img_l2.setEnabled(true);
                        img_l.setEnabled(true);

                    }

                }

                //касание


                return true;
            }
        });

        img_l2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //касание

                if (event.getAction()==MotionEvent.ACTION_DOWN){

                    //если коснулся
                    img_r.setEnabled(false);
                    img_l.setEnabled(false);
                    img_r2.setEnabled(false);
                    img_l2.startAnimation(c);

                    if (numleft2==numquest){
                        if (reshbtn.resh==true){
                            soundPlay(btnsoundnice);
                        }
                    }else if (reshbtn.resh==true){
                        soundPlay(btnsounderr);
                    }


                }else if (event.getAction()==MotionEvent.ACTION_UP){
                    //если опустил
                    if (numleft2==numquest){
                        if (count<20){
                            count=count+1;
                            img_l.setText(array.stringbtn1[o1+5]);
                            img_r.setText(array.stringbtn1[o2+5]);
                            img_l2.setText(array.stringbtn1[o3+5]);
                            img_r2.setText(array.stringbtn1[o4+5]);
                            imgtext.setText(array.stringbtn1[o5+5]);
                            next();
                            if (count==1){

                            }
                        }
                    }
                    else{
                        if(count>0){
                            if(count==1){
                                count=0;

                                img_l.setText(array.stringbtn1[0]);
                                img_r.setText(array.stringbtn1[1]);
                                img_l2.setText(array.stringbtn1[2]);
                                img_r2.setText(array.stringbtn1[3]);
                                imgtext.setText(array.stringbtn1[4]);
                                stay();

                            }else{
                                count=count-2;
                                img_l.setText(array.stringbtn1[o1-10]);
                                img_r.setText(array.stringbtn1[o2-10]);
                                img_l2.setText(array.stringbtn1[o3-10]);
                                img_r2.setText(array.stringbtn1[o4-10]);
                                imgtext.setText(array.stringbtn1[o5-10]);
                                back();


                            }
                        }

                    }

                    for (int i =0;i<19;i++){
                        TextView tv= findViewById(progress[i]);
                        tv.setBackgroundResource(R.drawable.style_points);
                    }
                    for (int i =0;i<count;i++){
                        TextView tv= findViewById(progress[i]);
                        tv.setBackgroundResource(R.drawable.style_points_green);
                    }
                    if (count==20){
                        //end
                        dialogEnd.show();

                    }else {

                        img_r.setEnabled(true);
                        img_r2.setEnabled(true);
                        img_l.setEnabled(true);

                    }

                }

                //касание


                return true;
            }
        });

        img_r2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //касание

                if (event.getAction()==MotionEvent.ACTION_DOWN){

                    //если коснулся
                    img_r.setEnabled(false);
                    img_l2.setEnabled(false);
                    img_l.setEnabled(false);
                    img_r2.startAnimation(d);

                    if (numright2==numquest){
                        if (reshbtn.resh==true){
                            soundPlay(btnsoundnice);
                        }
                    }else if (reshbtn.resh==true){
                        soundPlay(btnsounderr);
                    }


                }else if (event.getAction()==MotionEvent.ACTION_UP){
                    //если опустил
                    //если опустил
                    if (numright2==numquest){
                        if (count<20){
                            count=count+1;
                            img_l.setText(array.stringbtn1[o1+5]);
                            img_r.setText(array.stringbtn1[o2+5]);
                            img_l2.setText(array.stringbtn1[o3+5]);
                            img_r2.setText(array.stringbtn1[o4+5]);
                            imgtext.setText(array.stringbtn1[o5+5]);
                            next();
                            if (count==1){

                            }
                        }
                    }
                    else{
                        if(count>0){
                            if(count==1){
                                count=0;

                                img_l.setText(array.stringbtn1[0]);
                                img_r.setText(array.stringbtn1[1]);
                                img_l2.setText(array.stringbtn1[2]);
                                img_r2.setText(array.stringbtn1[3]);
                                imgtext.setText(array.stringbtn1[4]);
                                stay();

                            }else{
                                count=count-2;
                                img_l.setText(array.stringbtn1[o1-10]);
                                img_r.setText(array.stringbtn1[o2-10]);
                                img_l2.setText(array.stringbtn1[o3-10]);
                                img_r2.setText(array.stringbtn1[o4-10]);
                                imgtext.setText(array.stringbtn1[o5-10]);
                                back();


                            }
                        }

                    }


                    //while
                    for (int i =0;i<20;i++){
                        TextView tv= findViewById(progress[i]);
                        tv.setBackgroundResource(R.drawable.style_points);
                    }
                    //green
                    for (int i =0;i<count;i++){
                        TextView tv= findViewById(progress[i]);
                        tv.setBackgroundResource(R.drawable.style_points_green);
                    }
                    if (count==20){
                        //end
                        dialogEnd.show();

                    }else {

                        img_r.setEnabled(true);
                        img_l2.setEnabled(true);
                        img_l.setEnabled(true);
                    }


                }

                //касание


                return true;
            }
        });

        //обработка нажатия


    }
    @Override
    public  void onBackPressed(){

        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            Intent intent = new Intent(Level1.this, GameLevels.class);
            startActivity(intent);finish();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Вы действительно хотите вернуться к выбору уровня?", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();

    }
    //метод перехода уровня вперед
    public void next(){
        numleft = array.power1[o1+5];
        numright = array.power1[o2+5];
        numleft2 = array.power1[o3+5];
        numright2 = array.power1[o4+5];
        numquest = array.power1[o5+5];
        o1=o1+5;
        o2=o2+5;
        o3=o3+5;
        o4=o4+5;
        o5=o5+5;

    }
    //метод перехода уровня кц
    //метод сброс до 0 уровня нц
    public void stay(){
        numleft = array.power1[0];
        numright = array.power1[1];
        numleft2 = array.power1[2];
        numright2 = array.power1[3];
        numquest = array.power1[4];
        o1=0;
        o2=1;
        o3=2;
        o4=3;
        o5=4;
    }
    //метод сброс до 0 уровня кц
    //метод возращения на 2 уровня нц
    public void back(){
        numleft = array.power1[o1-10];
        numright = array.power1[o2-10];
        numleft2 = array.power1[o3-10];
        numright2 = array.power1[o4-10];
        numquest = array.power1[o5-10];
        o1=o1-10;
        o2=o2-10;
        o3=o3-10;
        o4=o4-10;
        o5=o5-10;
    }
    //метод возращения на 2 уровня кц
    public  void soundPlay(MediaPlayer sound){
        sound.start();
        sound.setVolume(30,30);
    }

    public void startmusic(){
        startService(new Intent(this, MyService.class));
    }
    public void stoptmusic(){
        stopService(new Intent(this, MyService.class));
    }


}