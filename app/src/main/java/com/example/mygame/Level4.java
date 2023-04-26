package com.example.mygame;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
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

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Level4 extends AppCompatActivity {


    Dialog dialogEnd; //конечное окно
    Dialog setting; //окно настроек
    private  long backPressedTime; //кнопка назад
    private Toast backToast; //сообщение при возращении
    Array array = new Array(); //массив с значениями текста и силы
    public int count =0;
    public int numleft; //кнопки==текст
    public int numright;
    public int numleft2;
    public int numright2;
    public int numquest; //текст с квестом
    public int o1,o2,o3,o4,o5; //номера для перехода значений в массиве
    public  int hp=3; //жизни
    int x1=1; //для исправления метода onFinish()
    int x2=1; //тоже
    Setting reshbtn= new Setting(); //работа с значениями настроек
    private MediaPlayer btnsoung; //звук системы
    private MediaPlayer btnsounderr; //звук правильного ответа
    private MediaPlayer btnsoundnice; //звук не правильного ответа
    private boolean running=false;
    private int sec=0;
    public int stars=3;
    public int num=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.level4); //текст уровня

        SharedPreferences savestar4 = getSharedPreferences("Savestar4", MODE_PRIVATE);
        final int star4 = savestar4.getInt("Star4", 0);




        //текстовые объекты начало
        final TextView img_l=(TextView) findViewById(R.id.img_l);
        final TextView img_r=(TextView) findViewById(R.id.img_r);
        final TextView img_l2=(TextView) findViewById(R.id.img_l2);
        final TextView img_r2=(TextView) findViewById(R.id.img_r2);
        final TextView imgtext=(TextView) findViewById(R.id.imgtext);
        //текстовые объекты конец


        //путь звуков н
        btnsoung=MediaPlayer.create(this,R.raw.btnsoung);
        btnsounderr=MediaPlayer.create(this,R.raw.btnsonderr);
        btnsoundnice=MediaPlayer.create(this,R.raw.btnsoundnice);
        //путь звуков к



        //работа с баррами н
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        //работа с баррами к



        TextView txttimer = (TextView) findViewById(R.id.timer);





        //анимация н
        final Animation a = AnimationUtils.loadAnimation(Level4.this,R.anim.alpha);
        final Animation b = AnimationUtils.loadAnimation(Level4.this,R.anim.alpha);
        final Animation c = AnimationUtils.loadAnimation(Level4.this,R.anim.alpha);
        final Animation d = AnimationUtils.loadAnimation(Level4.this,R.anim.alpha);
        final Animation e = AnimationUtils.loadAnimation(Level4.this,R.anim.alpha);
        //анимация к

        //работа с окном настроек н
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
                try {
                    btnsetting.startAnimation(e);
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
                    w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
        //работа с окном настроек к




        //работа с окном конца н
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
                    Intent intent = new Intent(Level4.this,GameLevels.class);
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
                    Intent intent = new Intent(Level4.this, Level5.class);
                    startActivity(intent);finish();
                    running=false;
                    sec=0;

                }catch (Exception e){

                }
                dialogEnd.dismiss();
            }
        });
        //работа с окном конца к

        //кнопка назад н
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
                    Intent intent = new Intent(Level4.this, GameLevels.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка назад к

        //прогресс поинты н
        final int[] progress ={
                R.id.point1,  R.id.point2,  R.id.point3,  R.id.point4,  R.id.point5,  R.id.point6,
                R.id.point7,  R.id.point8,  R.id.point9,  R.id.point10,  R.id.point11,  R.id.point12,
                R.id.point13,  R.id.point14,  R.id.point15,  R.id.point16,  R.id.point17,  R.id.point18,
                R.id.point19,  R.id.point20
        };
        //прогресс поинты к



        //первоначальные значения текста н
            img_l.setText(array. stringbtn4[0]);
            img_r.setText(array. stringbtn4[1]);
            img_l2.setText(array. stringbtn4[2]);
            img_r2.setText(array. stringbtn4[3]);
            imgtext.setText(array. stringbtn4[4]);
        //первоначальные значения текста к


        ImageView imghp=(ImageView) findViewById(R.id.hp); //картинка жизней


        //первоначальные значения силы н
            numleft = array.power4[0];
            numright = array.power4[1];
            numleft2 = array.power4[2];
            numright2 = array.power4[3];
            numquest = array.power4[4];
        o1=0;
        o2=1;
        o3=2;
        o4=3;
        o5=4;
        //первоначальные значения силы к

        TextView txtprogressend =(TextView)dialogEnd.findViewById(R.id.time);
        Button restart =(Button)setting.findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (reshbtn.resh == true) {
                        soundPlay(btnsoung);
                    } else {

                    }

                    backToast = Toast.makeText(getBaseContext(), "Вы не можете сбросить прогресс, когда находитесь в уровне", Toast.LENGTH_SHORT);
                    backToast.show();

                } catch (Exception e) {

                }
            }
        });



        //timer н
        long seconds = Long.parseLong(txttimer.getText().toString());

        CountDownTimer my_timer = new CountDownTimer(seconds*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                txttimer.setText(Long.toString(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {

                if((count==1 || count==2)&&x1==1){
                    hp=3;
                    imghp.setImageResource(R.drawable.heartfull);
                    count=0;

                    img_l.setText(array. stringbtn4[0]);
                    img_r.setText(array. stringbtn4[1]);
                    img_l2.setText(array. stringbtn4[2]);
                    img_r2.setText(array. stringbtn4[3]);
                    imgtext.setText(array. stringbtn4[4]);
                    stay();
                    txttimer.setText("X");
                    x1=x1-1;
                    x2=x2-1;
                    running=false;
                    sec=0;

                }else if (count>2 && count <20 &&x2==1){
                    if(hp!=1) {
                        count = count - 2;
                        img_l.setText(array.stringbtn4[o1 - 10]);
                        img_r.setText(array.stringbtn4[o2 - 10]);
                        img_l2.setText(array.stringbtn4[o3 - 10]);
                        img_r2.setText(array.stringbtn4[o4 - 10]);
                        imgtext.setText(array.stringbtn4[o5 - 10]);
                        numleft = array.power4[o1-10];
                        numright = array.power4[o2-10];
                        numleft2 = array.power4[o3-10];
                        numright2 = array.power4[o4-10];
                        numquest = array.power4[o5-10];
                        o1=o1-10;
                        o2=o2-10;
                        o3=o3-10;
                        o4=o4-10;
                        o5=o5-10;
                        x1=x1-1;
                        x2=x2-1;
                        hp = hp - 1;
                        txttimer.setText("X");
                         if(hp==2){
                            imghp.setImageResource(R.drawable.hearttwo);

                        }
                        if (hp==1){
                            imghp.setImageResource(R.drawable.heartone);
                        }
                    } else{
                        img_l.setText(array.stringbtn4[0]);
                        img_r.setText(array.stringbtn4[1]);
                        img_l2.setText(array.stringbtn4[2]);
                        img_r2.setText(array.stringbtn4[3]);
                        imgtext.setText(array.stringbtn4[4]);
                        stay();
                        hp=3;
                        count=0;
                        imghp.setImageResource(R.drawable.heartfull);

                        txttimer.setText("X");
                        running=false;
                        sec=0;
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
            }

        };
        //timer к

        runTimer();



        txttimer.setText("X"); //таймер без значений

        ImageView starses = (ImageView)dialogEnd.findViewById(R.id.star);
        TextView nameprog = (TextView)dialogEnd.findViewById(R.id.progreename);

        ArrayList<String> name = new ArrayList<String>();
        name.add("ПЛОХО");
        name.add("ПОЙДЕТ");
        name.add("НОРМАЛЬНО");
        name.add("ХОРОШО");
        name.add("ОТЛИЧНО");
        name.add("ВЕЛИКОЛЕПНО");
        name.add("Ты схитрил!Но это было круто");



        //обработка нажатия н
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

                            my_timer.start();

                        if (reshbtn.resh==true){
                            soundPlay(btnsoundnice);
                        }
                    }else if (reshbtn.resh==true){
                        soundPlay(btnsounderr);
                    }



                }else if (event.getAction()==MotionEvent.ACTION_UP){
                    if (x1==0){
                        x1=1;
                    }
                    if (x2==0){
                        x2=1;
                    }

                    if (numleft==numquest){
                        if (count<20){

                            count=count+1;

                            img_l.setText(array.stringbtn4[o1+5]);
                            img_r.setText(array.stringbtn4[o2+5]);
                            img_l2.setText(array.stringbtn4[o3+5]);
                            img_r2.setText(array.stringbtn4[o4+5]);
                            imgtext.setText(array.stringbtn4[o5+5]);
                            next();

                        }
                    }
                    else{
                        if(count>0){
                            if(count==1 || count==2){
                                hp=3;
                                imghp.setImageResource(R.drawable.heartfull);
                                count=0;

                                img_l.setText(array.stringbtn4[0]);
                                img_r.setText(array.stringbtn4[1]);
                                img_l2.setText(array.stringbtn4[2]);
                                img_r2.setText(array.stringbtn4[3]);
                                imgtext.setText(array.stringbtn4[4]);
                                stay();
                                my_timer.cancel();
                                txttimer.setText("X");
                                running=false;
                                sec=0;

                            }else{

                                if(hp!=1) {
                                    count = count - 2;
                                    img_l.setText(array.stringbtn4[o1 - 10]);
                                    img_r.setText(array.stringbtn4[o2 - 10]);
                                    img_l2.setText(array.stringbtn4[o3 - 10]);
                                    img_r2.setText(array.stringbtn4[o4 - 10]);
                                    imgtext.setText(array.stringbtn4[o5 - 10]);
                                    back();
                                    hp=hp-1;
                                    my_timer.cancel();
                                    txttimer.setText("X");
                                    if (hp==2){
                                        imghp.setImageResource(R.drawable.hearttwo);
                                    }
                                    else{
                                        imghp.setImageResource(R.drawable.heartone);
                                    }
                                }
                                else{
                                    img_l.setText(array.stringbtn4[0]);
                                    img_r.setText(array.stringbtn4[1]);
                                    img_l2.setText(array.stringbtn4[2]);
                                    img_r2.setText(array.stringbtn4[3]);
                                    imgtext.setText(array.stringbtn4[4]);
                                    stay();
                                    hp=3;
                                    count=0;
                                    imghp.setImageResource(R.drawable.heartfull);
                                    my_timer.cancel();
                                    txttimer.setText("X");
                                    running=false;
                                    sec=0;
                                }





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
                        running=false;
                       dialogEnd.show();
                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                        final int level = save.getInt("level", 1);
                        if (level>4){

                        }else{
                            SharedPreferences.Editor editor = save.edit();
                            editor.putInt("level",5);
                            editor.commit();
                        }

                       my_timer.cancel();

                        if (stars ==3){
                            starses.setImageResource(R.drawable.starsendfull);
                            SharedPreferences.Editor editor = savestar4.edit();
                            editor.putInt("Star4",3);
                            editor.commit();
                        }else if (stars ==2){
                            starses.setImageResource(R.drawable.starsendtwo);
                            if(star4!=3) {
                                SharedPreferences.Editor editor = savestar4.edit();
                                editor.putInt("Star4",2);
                                editor.commit();
                            }
                        }else{
                            starses.setImageResource(R.drawable.starsendone);
                            if(star4!=2 && star4!=3) {
                                SharedPreferences.Editor editor = savestar4.edit();
                                editor.putInt("Star4",1);
                                editor.commit();
                            }
                        }

                       nameprog.setText(name.get(num));


                    }else {

                        img_r.setEnabled(true);
                        img_l2.setEnabled(true);
                        img_r2.setEnabled(true);
                    }


                    if (count==1){

                        running=true;}


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

                            my_timer.start();

                        if (reshbtn.resh==true){
                            soundPlay(btnsoundnice);
                        }


                    }else if (reshbtn.resh==true){
                        soundPlay(btnsounderr);
                    }


                }else if (event.getAction()==MotionEvent.ACTION_UP){
                    if (x1==0){
                        x1=1;
                    }
                    if (x2==0){
                        x2=1;
                    }

                    //если опустил
                    if (numright==numquest){
                        if (count<20){
                            count=count+1;
                            img_l.setText(array.stringbtn4[o1+5]);
                            img_r.setText(array.stringbtn4[o2+5]);
                            img_l2.setText(array.stringbtn4[o3+5]);
                            img_r2.setText(array.stringbtn4[o4+5]);
                            imgtext.setText(array.stringbtn4[o5+5]);
                            next();

                        }
                    }
                    else{
                        if(count>0){
                            if(count==1 || count==2){
                                hp=3;
                                imghp.setImageResource(R.drawable.heartfull);
                                count=0;

                                img_l.setText(array.stringbtn4[0]);
                                img_r.setText(array.stringbtn4[1]);
                                img_l2.setText(array.stringbtn4[2]);
                                img_r2.setText(array.stringbtn4[3]);
                                imgtext.setText(array.stringbtn4[4]);
                                stay();
                                my_timer.cancel();
                                txttimer.setText("X");
                                running=false;
                                sec=0;

                            }else{

                                if(hp!=1) {
                                    count = count - 2;
                                    img_l.setText(array.stringbtn4[o1 - 10]);
                                    img_r.setText(array.stringbtn4[o2 - 10]);
                                    img_l2.setText(array.stringbtn4[o3 - 10]);
                                    img_r2.setText(array.stringbtn4[o4 - 10]);
                                    imgtext.setText(array.stringbtn4[o5 - 10]);
                                    back();
                                    hp=hp-1;
                                    my_timer.cancel();
                                    txttimer.setText("X");
                                    if (hp==2){
                                        imghp.setImageResource(R.drawable.hearttwo);
                                    }
                                    else{
                                        imghp.setImageResource(R.drawable.heartone);
                                    }
                                }
                                else{
                                    img_l.setText(array.stringbtn4[0]);
                                    img_r.setText(array.stringbtn4[1]);
                                    img_l2.setText(array.stringbtn4[2]);
                                    img_r2.setText(array.stringbtn4[3]);
                                    imgtext.setText(array.stringbtn4[4]);
                                    stay();
                                    hp=3;
                                    count=0;
                                    imghp.setImageResource(R.drawable.heartfull);
                                    my_timer.cancel();
                                    txttimer.setText("X");
                                    running=false;
                                    sec=0;
                                }


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
                        running=false;
                        dialogEnd.show();
                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                        final int level = save.getInt("level", 1);
                        if (level>4){

                        }else{
                            SharedPreferences.Editor editor = save.edit();
                            editor.putInt("level",5);
                            editor.commit();
                        }
                        my_timer.cancel();
                        if (stars ==3){
                            starses.setImageResource(R.drawable.starsendfull);
                            SharedPreferences.Editor editor = savestar4.edit();
                            editor.putInt("Star4",3);
                            editor.commit();
                        }else if (stars ==2){
                            starses.setImageResource(R.drawable.starsendtwo);
                            if(star4!=3) {
                                SharedPreferences.Editor editor = savestar4.edit();
                                editor.putInt("Star4",2);
                                editor.commit();
                            }
                        }else{
                            starses.setImageResource(R.drawable.starsendone);
                            if(star4!=2 && star4!=3) {
                                SharedPreferences.Editor editor = savestar4.edit();
                                editor.putInt("Star4",1);
                                editor.commit();
                            }
                        }
                        nameprog.setText(name.get(num));
                    }else {

                        img_r2.setEnabled(true);
                        img_l2.setEnabled(true);
                        img_l.setEnabled(true);

                    }

                    if (count==1){

                        running=true;}



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

                            my_timer.start();

                        if (reshbtn.resh==true){
                            soundPlay(btnsoundnice);
                        }
                    }else if (reshbtn.resh==true){
                        soundPlay(btnsounderr);
                    }


                }else if (event.getAction()==MotionEvent.ACTION_UP){
                    if (x1==0){
                        x1=1;
                    }
                    if (x2==0){
                        x2=1;
                    }
                    //если опустил
                    if (numleft2==numquest){
                        if (count<20){
                            count=count+1;
                            img_l.setText(array.stringbtn4[o1+5]);
                            img_r.setText(array.stringbtn4[o2+5]);
                            img_l2.setText(array.stringbtn4[o3+5]);
                            img_r2.setText(array.stringbtn4[o4+5]);
                            imgtext.setText(array.stringbtn4[o5+5]);
                            next();
                        }
                    }
                    else{
                        if(count>0){
                            if(count==1 || count==2){
                                hp=3;
                                imghp.setImageResource(R.drawable.heartfull);
                                count=0;
                                img_l.setText(array.stringbtn4[0]);
                                img_r.setText(array.stringbtn4[1]);
                                img_l2.setText(array.stringbtn4[2]);
                                img_r2.setText(array.stringbtn4[3]);
                                imgtext.setText(array.stringbtn4[4]);
                                stay();
                                my_timer.cancel();
                                txttimer.setText("X");
                                running=false;
                                sec=0;

                            }else{
                                if(hp!=1) {
                                    count = count - 2;
                                    img_l.setText(array.stringbtn4[o1 - 10]);
                                    img_r.setText(array.stringbtn4[o2 - 10]);
                                    img_l2.setText(array.stringbtn4[o3 - 10]);
                                    img_r2.setText(array.stringbtn4[o4 - 10]);
                                    imgtext.setText(array.stringbtn4[o5 - 10]);
                                    back();
                                    hp=hp-1;
                                    my_timer.cancel();
                                    txttimer.setText("X");
                                    if (hp==2){
                                        imghp.setImageResource(R.drawable.hearttwo);
                                    }
                                    else{
                                        imghp.setImageResource(R.drawable.heartone);
                                    }
                                }
                                else{
                                    img_l.setText(array.stringbtn4[0]);
                                    img_r.setText(array.stringbtn4[1]);
                                    img_l2.setText(array.stringbtn4[2]);
                                    img_r2.setText(array.stringbtn4[3]);
                                    imgtext.setText(array.stringbtn4[4]);
                                    stay();
                                    hp=3;
                                    count=0;
                                    imghp.setImageResource(R.drawable.heartfull);
                                    my_timer.cancel();
                                    txttimer.setText("X");
                                    running=false;
                                    sec=0;
                                }
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
                        running=false;
                        dialogEnd.show();
                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                        final int level = save.getInt("level", 1);
                        if (level>4){

                        }else{
                            SharedPreferences.Editor editor = save.edit();
                            editor.putInt("level",5);
                            editor.commit();
                        }

                        my_timer.cancel();
                        if (stars ==3){
                            starses.setImageResource(R.drawable.starsendfull);
                            SharedPreferences.Editor editor = savestar4.edit();
                            editor.putInt("Star4",3);
                            editor.commit();
                        }else if (stars ==2){
                            starses.setImageResource(R.drawable.starsendtwo);
                            if(star4!=3) {
                                SharedPreferences.Editor editor = savestar4.edit();
                                editor.putInt("Star4",2);
                                editor.commit();
                            }
                        }else{
                            starses.setImageResource(R.drawable.starsendone);
                            if(star4!=2 && star4!=3) {
                                SharedPreferences.Editor editor = savestar4.edit();
                                editor.putInt("Star4",1);
                                editor.commit();
                            }
                        }
                        nameprog.setText(name.get(num));
                    }else {
                        img_r.setEnabled(true);
                        img_r2.setEnabled(true);
                        img_l.setEnabled(true);
                    }

                    if (count==1){

                        running=true;}


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

                            my_timer.start();

                        if (reshbtn.resh==true){
                            soundPlay(btnsoundnice);
                        }
                    }else if (reshbtn.resh==true){
                        soundPlay(btnsounderr);
                    }
                }else if (event.getAction()==MotionEvent.ACTION_UP){
                    if (x1==0){
                        x1=1;
                    }
                    if (x2==0){
                        x2=1;
                    }
                    //если опустил
                    //если опустил
                    if (numright2==numquest){
                        if (count<20){
                            count=count+1;
                            img_l.setText(array.stringbtn4[o1+5]);
                            img_r.setText(array.stringbtn4[o2+5]);
                            img_l2.setText(array.stringbtn4[o3+5]);
                            img_r2.setText(array.stringbtn4[o4+5]);
                            imgtext.setText(array.stringbtn4[o5+5]);
                            next();
                        }
                    }
                    else{
                        if(count>0){
                            if(count==1 || count==2){
                                hp=3;
                                imghp.setImageResource(R.drawable.heartfull);
                                count=0;
                                img_l.setText(array.stringbtn4[0]);
                                img_r.setText(array.stringbtn4[1]);
                                img_l2.setText(array.stringbtn4[2]);
                                img_r2.setText(array.stringbtn4[3]);
                                imgtext.setText(array.stringbtn4[4]);
                                stay();
                                my_timer.cancel();
                                txttimer.setText("X");
                                running=false;
                                sec=0;
                            }else{
                                if(hp!=1) {
                                    count = count - 2;
                                    img_l.setText(array.stringbtn4[o1 - 10]);
                                    img_r.setText(array.stringbtn4[o2 - 10]);
                                    img_l2.setText(array.stringbtn4[o3 - 10]);
                                    img_r2.setText(array.stringbtn4[o4 - 10]);
                                    imgtext.setText(array.stringbtn4[o5 - 10]);
                                    back();
                                    hp=hp-1;
                                    my_timer.cancel();
                                    txttimer.setText("X");
                                    if (hp==2){
                                        imghp.setImageResource(R.drawable.hearttwo);
                                    }
                                    else{
                                        imghp.setImageResource(R.drawable.heartone);
                                    }
                                }
                                else{
                                    img_l.setText(array.stringbtn4[0]);
                                    img_r.setText(array.stringbtn4[1]);
                                    img_l2.setText(array.stringbtn4[2]);
                                    img_r2.setText(array.stringbtn4[3]);
                                    imgtext.setText(array.stringbtn4[4]);
                                    stay();
                                    hp=3;
                                    count=0;
                                    imghp.setImageResource(R.drawable.heartfull);
                                    my_timer.cancel();
                                    txttimer.setText("X");
                                    running=false;
                                    sec=0;
                                }
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
                        running=false;
                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                        final int level = save.getInt("level", 1);
                        if (level>4){

                        }else{
                            SharedPreferences.Editor editor = save.edit();
                            editor.putInt("level",5);
                            editor.commit();
                        }

                        dialogEnd.show();

                        my_timer.cancel();
                        if (stars ==3){
                            starses.setImageResource(R.drawable.starsendfull);
                            SharedPreferences.Editor editor = savestar4.edit();
                            editor.putInt("Star4",3);
                            editor.commit();
                        }else if (stars ==2){
                            starses.setImageResource(R.drawable.starsendtwo);
                            if(star4!=3) {
                                SharedPreferences.Editor editor = savestar4.edit();
                                editor.putInt("Star4",2);
                                editor.commit();
                            }
                        }else{
                            starses.setImageResource(R.drawable.starsendone);
                            if(star4!=2 && star4!=3) {
                                SharedPreferences.Editor editor = savestar4.edit();
                                editor.putInt("Star4",1);
                                editor.commit();
                            }
                        }
                        nameprog.setText(name.get(num));
                    }else {
                        img_r.setEnabled(true);
                        img_l2.setEnabled(true);
                        img_l.setEnabled(true);
                    }

                    if (count==1){

                        running=true;}


                }

                //касание
                return true;
            }
        });
        //обработка нажатия к



    }
    //системная кнопка назад н
    @Override
    public  void onBackPressed(){
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            Intent intent = new Intent(Level4.this, GameLevels.class);
            startActivity(intent);finish();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Вы действительно хотите вернуться к выбору уровня?", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
    //системная кнопка назад н

    //метод перехода уровня вперед н
    public void next(){
        numleft = array.power4[o1+5];
        numright = array.power4[o2+5];
        numleft2 = array.power4[o3+5];
        numright2 = array.power4[o4+5];
        numquest = array.power4[o5+5];
        o1=o1+5;
        o2=o2+5;
        o3=o3+5;
        o4=o4+5;
        o5=o5+5;
    }
    //метод перехода уровня кц

    //метод сброс до 0 уровня нц
    public void stay(){

        numleft = array.power4[0];
        numright = array.power4[1];
        numleft2 = array.power4[2];
        numright2 = array.power4[3];
        numquest = array.power4[4];
        o1=0;
        o2=1;
        o3=2;
        o4=3;
        o5=4;
    }
    //метод сброс до 0 уровня кц

    //метод возращения на 2 уровня нц
    public void back(){
        numleft = array.power4[o1-10];
        numright = array.power4[o2-10];
        numleft2 = array.power4[o3-10];
        numright2 = array.power4[o4-10];
        numquest = array.power4[o5-10];
        o1=o1-10;
        o2=o2-10;
        o3=o3-10;
        o4=o4-10;
        o5=o5-10;
    }
    //метод возращения на 2 уровня кц

    //звуки кнопок н
    public  void soundPlay(MediaPlayer sound){
        sound.start();
        sound.setVolume(30,30);
    }
    //звуки кнопок к

    //сервис с музыкой н
    public void startmusic(){
        startService(new Intent(this, MyService.class));
    }
    public void stoptmusic(){
        stopService(new Intent(this, MyService.class));
    }
    //сервис с музыкой к

    private void runTimer(){
        final TextView txtprogress =(TextView)dialogEnd.findViewById(R.id.time);

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int minuts =(sec%3600)/60 ;
                int second = sec%60;




                String time = String.format("%d:%02d", minuts, second);//время








                txtprogress.setText(time);


                if(running){
                    sec++;
                }
                handler.postDelayed(this, 1000);

                if (minuts==0 && second<=55){
                    if(second<=10){
                        num=6;
                    }else if(second>10 && second <= 20){
                        num=5;
                    }else if (second>20 && second<=30){
                        num=4;
                    }else{
                        num=3;
                    }
                    stars=3;

                }else if ((minuts==0 && second>55) || (minuts==1 && second<=15)){
                    if (minuts<=1 && second<=10){
                        num=2;
                    }else{
                        num=1;
                    }
                    stars=2;

                }else if(minuts>=1 && second>15){
                    num=0;
                    stars=1;

                }

            }


        });
    }


}