package com.example.ip.myapplication_3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CleanActivity extends AppCompatActivity {
    ImageView dust;
    Button stop;
    Handler handler;
    int val=0;
    float x =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean);

        dust = (ImageView) findViewById(R.id.dust);
        stop = (Button)findViewById(R.id.bt1);



        final Thread thread = new Thread(new Runnable() {
            int current = 0;
            int dx = 10;
            public void run() {
                while (true) {
                    try {
                        dust.setX((float) current);
                        current += dx;
                        if(current == 110) {
                            dx = 10;
                        }
                        if(current == 1160) {
                            dx = -10;
                        }
                        Thread.sleep(50);
/*
                        x = dust.getX();
                        dust.setX(x += 10);
                        Thread.sleep(30);

                        if(dust.getX()>=1160.0){
                            while(true) {
                                dust.setX(x -= 10);
                                Thread.sleep(30);
                            }
                        }

                        if(dust.getX()>=1160.0){
                            while(true) {
                                dust.setX(x += 10);
                                Thread.sleep(30);
                            }
                        }*/

                    } catch (Throwable t) {
                        break;

                    }
                }
            }
        });

        thread.start();

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), String.valueOf(dust.getX()) , Toast.LENGTH_SHORT).show();
                thread.interrupt();
                if(dust.getX()<=1200.0 && dust.getX()>=930.0){
                    Toast.makeText(getApplicationContext(),"게임성공" , Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CleanActivity.this, PresentShow.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "게임실패", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CleanActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        Toast.makeText(this, String.valueOf(x), Toast.LENGTH_SHORT).show();

    }
}
