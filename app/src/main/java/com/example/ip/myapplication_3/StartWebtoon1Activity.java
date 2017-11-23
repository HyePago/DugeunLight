package com.example.ip.myapplication_3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;

public class StartWebtoon1Activity extends AppCompatActivity {
    LinearLayout startcartoon1;
    int []images={R.drawable.gs_2, R.drawable.gs_3};
    Intent intent;
    Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startwebtoon1);

        startcartoon1 = (LinearLayout) findViewById(R.id.startcartoon1);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                startcartoon1.setBackgroundResource(images[0]);
            }
        }, 1000);

        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            public void run() {
                startcartoon1.setBackgroundResource(images[1]);
            }

        }, 2000);


        Handler handler2= new Handler();
        handler2.postDelayed(new Runnable() {
            public void run() {
                intent = new Intent(StartWebtoon1Activity.this, ClockAcitivity.class);
                startActivity(intent);
            }

        }, 3000);
/*

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                    intent = new Intent(StartWebtoon1Activity.this, ClockAcitivity.class);
                    intent.putExtra("num", 0);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                    thread.interrupt();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        thread.start();





    */
    }
}
