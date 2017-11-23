package com.example.ip.myapplication_3;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.logging.Handler;

/**
 * Created by Sun_Sun on 2017-11-15.
 */

public class LunchShow extends AppCompatActivity {

    int[] show = new int[8];
    static int[] num = new int[4];
    String[] numst = new String[4];
    ImageView[] lunchshow = new ImageView[4];
    int[] lunchimg = {R.drawable.kimchi,R.drawable.bab,R.drawable.pig,R.drawable.chicken,R.drawable.frag,R.drawable.tear,
            R.drawable.heonmi,R.drawable.kimchi2};
    Image[] lunchmenu = new Image[8];
    Random random = new Random();
    //int[] show = new int[8];
    TextView time;
    int val = 0;
    Intent intent;

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunchshow);

        lunchshow[0] = (ImageView) findViewById(R.id.show11);
        lunchshow[1] = (ImageView) findViewById(R.id.show22);
        lunchshow[2] = (ImageView) findViewById(R.id.show33);
        lunchshow[3] = (ImageView) findViewById(R.id.show44);

        for (int i = 0; i < show.length; i++) {
            show[i] = random.nextInt(show.length);
            for (int j = 0; j < i; j++) {
                if (show[i] == show[j]) {
                    i--;
                    break;
                }
            }
        }



        num[0] = show[0];
        num[1] = show[1];
        num[2] = show[2];
        num[3] = show[3];

        //Toast.makeText(getApplicationContext(), String.valueOf(num[0]) , Toast.LENGTH_LONG).show();

        /*Random ram = new Random();
        int num = ram.nextInt(lunchimg.length);*/

        //Toast.makeText(getApplicationContext(), num[0] , Toast.LENGTH_LONG).show();

        lunchshow[0].setBackgroundResource(lunchimg[num[0]]);
        lunchshow[1].setBackgroundResource(lunchimg[num[1]]);
        lunchshow[2].setBackgroundResource(lunchimg[num[2]]);
        lunchshow[3].setBackgroundResource(lunchimg[num[3]]);

        for(int i=0; i<num.length; i++) {
            numst[i] = String.valueOf(num[i]);
        }
        //Toast.makeText(getApplicationContext(), numst[0] , Toast.LENGTH_LONG).show();





        /*lunchmenu[0].setBackgroundResource(R.drawable.bab);
        lunchmenu[1].setBackgroundResource(R.drawable.tear);
        lunchmenu[2].setBackgroundResource(R.drawable.frag);
        lunchmenu[3].setBackgroundResource(R.drawable.heonmi);
        lunchmenu[4].setBackgroundResource(R.drawable.kimchi);
        lunchmenu[5].setBackgroundResource(R.drawable.kimchi2);
        lunchmenu[6].setBackgroundResource(R.drawable.pig);
        lunchmenu[7].setBackgroundResource(R.drawable.chicken);*/



        /*lunchshow[0] = lunchmenu[show[0]];
        lunchshow[1] = lunchmenu[show[1]];
        lunchshow[2] = lunchmenu[show[2]];
        lunchshow[3] = lunchmenu[show[3]];*/

       /* for(int i = 0; i<show.length; i++) {
            lunchshow[i] lunchmenu[show[i]];
        }*/

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(7000);
                    Intent intent = new Intent(LunchShow.this, Lunch_Activity.class);
                    intent.putExtra("numst", num);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }
        });

        thread.start();
    }
}
