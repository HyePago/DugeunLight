package com.example.ip.myapplication_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class PresentShow extends AppCompatActivity {
    Intent intent;
    Thread thread;

    String[] menu = {"파란 꽃", "노란 꽃", "화이트 초콜릿", "사탕", "다크초콜릿", "파란 양말", "공", "빨간 양말"};
    static int[] show = new int[5];
    Random rnd = new Random();
    int val = 0;
    int num=0;
    ImageView question;
    TextView[] txt = new TextView[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        supportRequestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        setContentView(R.layout.activity_present_show);
        question = (ImageView)findViewById(R.id.question);

        num = rnd.nextInt(3);

       // Toast.makeText(this, ""+num, Toast.LENGTH_SHORT).show();

        switch (num){
            case 0:
                question.setBackgroundResource(R.drawable.love_1);
                show[0] = 0;
                show[1] = 6;
                show[2] = 3;
                show[3] = 5;
                show[4] = 4;
                break;
            case 1:
                question.setBackgroundResource(R.drawable.love_2);
                show[0] = 1;
                show[1] = 3;
                show[2] = 4;
                show[3] = 5;
                show[4] = 6;
                break;
            case 2:
                question.setBackgroundResource(R.drawable.love_3);
                show[0] = 3;
                show[1] = 0;
                show[2] = 1;
                show[3] = 6;
                show[4] = 7;
                break;
        }

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if(val > 3){
                        intent = new Intent(PresentShow.this, PresentGame.class);
                        intent.putExtra("num", 0);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                        thread.interrupt();
                    }
                    Thread.sleep(1000);
                    val++;
                    if(val > 3){
                        intent = new Intent(PresentShow.this, PresentGame.class);
                        intent.putExtra("num", 0);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                        thread.interrupt();
                    }
                    Thread.sleep(1000);
                    val++;
                    if(val > 3){
                        intent = new Intent(PresentShow.this, PresentGame.class);
                        intent.putExtra("num", 0);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                        thread.interrupt();
                    }
                    Thread.sleep(1000);
                    val++;
                    intent = new Intent(PresentShow.this, PresentGame.class);
                    intent.putExtra("num", 0);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                    thread.interrupt();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }

    int[] getShow(){
        return show;
    }
}
