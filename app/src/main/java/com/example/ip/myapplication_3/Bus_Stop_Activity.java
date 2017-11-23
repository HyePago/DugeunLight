package com.example.ip.myapplication_3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Sun_Sun on 2017-11-03.
 */

public class Bus_Stop_Activity extends AppCompatActivity {

    ImageView bus_speak,red152b,blue152,red152,green5517,green5521b,blue5521b;
    TextView time;
    Handler handler;
    int val = 0;
    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_stop);

        bus_speak = (ImageView) findViewById(R.id.bus_speak);
        time = (TextView) findViewById(R.id.time);
        red152b = (ImageView)findViewById(R.id.red152b);
        blue152 = (ImageView)findViewById(R.id.blue152);
        red152 = (ImageView)findViewById(R.id.red152);
        green5517 = (ImageView)findViewById(R.id.green5517);
        green5521b = (ImageView)findViewById(R.id.green5521);
        blue5521b = (ImageView)findViewById(R.id.blue5521);

        red152b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bus_Stop_Activity.this,"오답입니다.", Toast.LENGTH_SHORT).show();
                handler.removeMessages(0);
                Intent intent = new Intent(Bus_Stop_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        blue152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bus_Stop_Activity.this,"오답입니다.", Toast.LENGTH_SHORT).show();
                handler.removeMessages(0);
                Intent intent = new Intent(Bus_Stop_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        red152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bus_Stop_Activity.this,"정답입니다.", Toast.LENGTH_SHORT).show();
                handler.removeMessages(0);
                Intent intent = new Intent(Bus_Stop_Activity.this, TimeTable_Activity.class); //  LunchShow
                startActivity(intent);
                num=1;
                val = 0;
            }
        });

        green5517.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bus_Stop_Activity.this,"오답입니다.", Toast.LENGTH_SHORT).show();
                handler.removeMessages(0);
                Intent intent = new Intent(Bus_Stop_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        green5521b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bus_Stop_Activity.this,"오답입니다.", Toast.LENGTH_SHORT).show();
                handler.removeMessages(0);
                Intent intent = new Intent(Bus_Stop_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        blue5521b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bus_Stop_Activity.this,"오답입니다.", Toast.LENGTH_SHORT).show();
                handler.removeMessages(0);
                Intent intent = new Intent(Bus_Stop_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        handler = new Handler() {
            public void handleMessage(Message msg) {
                val++;
                time.setText("" + val);
                handler.sendEmptyMessageDelayed(0, 1000);

                if (val == 10) {
                    if(num!=1) {
                        Intent intent = new Intent(Bus_Stop_Activity.this, MainActivity.class);
                        handler.removeMessages(0);
                        startActivity(intent);
                        val =0;
                    }
                }

                if (val > 2) {
                    bus_speak.setVisibility(View.INVISIBLE);
                }

            }
        };
        handler.sendEmptyMessage(0);
    }
}


