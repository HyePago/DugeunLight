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
 * Created by Sun_Sun on 2017-11-07.
 */

public class TimeTable_Activity extends AppCompatActivity {

    TextView time;
    Handler handler;
    int val = 0;
    ImageView timetable,psy,design,math,korea,java,science,club;
    ImageView[] timetablearr = new ImageView[7];
    ImageView[] img = new ImageView[7];
    int[] click_num = new int[7];
    int result = 0;
    int cnt = 0;
    ImageView[] show_img = new ImageView[7];
    String answer[]={"m1","m2","m3","m4","m5","m6","m7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        time = (TextView) findViewById(R.id.time);
        timetable = (ImageView) findViewById(R.id.timetable);

        ImageView.OnClickListener onClickListener = new ImageView.OnClickListener(){
            @Override
            public void onClick(View view){
                show_img[0] = (ImageView)findViewById(R.id.img_show11);
                show_img[1] = (ImageView)findViewById(R.id.img_show22);
                show_img[2] = (ImageView)findViewById(R.id.img_show33);
                show_img[3] = (ImageView)findViewById(R.id.img_show44);
                show_img[4] = (ImageView)findViewById(R.id.img_show55);
                show_img[5] = (ImageView)findViewById(R.id.img_show66);
                show_img[6] = (ImageView)findViewById(R.id.img_show77);
                String ivKey=(String)view.getTag();

                switch (ivKey){
                    case "m1":
                        show_img[cnt].setBackgroundResource(R.drawable.korea);
                        break;
                    case "m2":
                        show_img[cnt].setBackgroundResource(R.drawable.math);
                        break;
                    case "m3":
                        show_img[cnt].setBackgroundResource(R.drawable.java);
                        break;
                    case "m4":
                        show_img[cnt].setBackgroundResource(R.drawable.science);
                        break;
                    case "m5":
                        show_img[cnt].setBackgroundResource(R.drawable.design);
                        break;
                    case "m6":
                        show_img[cnt].setBackgroundResource(R.drawable.psy);
                        break;
                    case "m7":
                        show_img[cnt].setBackgroundResource(R.drawable.club);
                        break;
                }

                timetablearr[0]= (ImageView) findViewById(R.id.psy);
                timetablearr[1] = (ImageView) findViewById(R.id.science);
                timetablearr[2] = (ImageView) findViewById(R.id.korea);
                timetablearr[3] = (ImageView) findViewById(R.id.club);
                timetablearr[4] = (ImageView) findViewById(R.id.design);
                timetablearr[5] = (ImageView) findViewById(R.id.math);
                timetablearr[6] = (ImageView) findViewById(R.id.java);

                //String ivKey=(String)view.getTag(); //m3, m1
                if(!ivKey.equals(answer[cnt])){
                    Toast.makeText(TimeTable_Activity.this, ivKey+", "+answer[cnt], Toast.LENGTH_SHORT).show();
                    result = 1;
                }


                if(result == 1 ){ //&& cnt == 11
                    Toast.makeText(TimeTable_Activity.this,"실패입니다.", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(TimeTable_Activity.this, MainActivity.class));
                    handler.removeMessages(0);
                }

               cnt++;

                if(cnt==7){
                    Toast.makeText(TimeTable_Activity.this,"성공입니다.", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(TimeTable_Activity.this, LunchShow.class));
                    handler.removeMessages(0);
                }
            }
        };

        img[0] = (ImageView)findViewById(R.id.psy);
        img[0].setTag("m6");

        img[1] = (ImageView)findViewById(R.id.science);
        img[1].setTag("m4");

        img[2] = (ImageView)findViewById(R.id.korea);
        img[2].setTag("m1");

        img[3] = (ImageView)findViewById(R.id.club);
        img[3].setTag("m7");

        img[4] = (ImageView)findViewById(R.id.design);
        img[4].setTag("m5");

        img[5] = (ImageView)findViewById(R.id.math);
        img[5].setTag("m2");

        img[6] = (ImageView)findViewById(R.id.java);
        img[6].setTag("m3");

        for(int i=0; i<7; i++){
            img[i].setOnClickListener(onClickListener);
        }

        handler = new Handler() {
            public void handleMessage(Message msg) {
                val++;
                time.setText("" + val);
                handler.sendEmptyMessageDelayed(0, 1000);

                if (val == 15) {
                    //if(num!=1) {
                        Intent intent = new Intent(TimeTable_Activity.this, MainActivity.class);
                        handler.removeMessages(0);
                        startActivity(intent);
                        val =0;
                    //}
                }

                if (val > 6) {
                    timetable.setVisibility(View.GONE);

                }

            }
        };
        handler.sendEmptyMessage(0);
    }
}
