
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

import static com.example.ip.myapplication_3.LunchShow.num;


/**
 * Created by Sun_Sun on 2017-11-10.
 */

public class Lunch_Activity extends AppCompatActivity {
    //열무김치, 차조밥,대패,안동,개구리,사슴,현미,배추
    int[] lunchimg = {R.drawable.kimchi,R.drawable.bab,R.drawable.pig,R.drawable.chicken,R.drawable.frag,R.drawable.tear,
            R.drawable.heonmi,R.drawable.kimchi2};
    ImageView[] showlunch = new ImageView[4]; //보여줄 급식
    //static int[] show = new int [4];
    TextView time;
    int val = 0;
    int[] click_num = new int[4];
    int result = 0;
    int cnt = 0;
    ImageView[] lunch = new ImageView[8];
    /*Intent intent = getIntent();
    int myStrings[] = intent.getExtras().getIntArray("numst");*/
    //int[] myStrings = intent.getIntArrayExtra("numst");
    int[] shownum = new int[4];
    ImageView showimg1;
    ImageView showimg2;
    Handler handler;

    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        ImageView imageView=new ImageView(getApplicationContext());
        imageView.setImageResource(R.drawable.success);

        //Toast.makeText(Lunch_Activity.this, String.valueOf(num[0]), Toast.LENGTH_LONG).show();

        time = (TextView)findViewById(R.id.time);

        lunch[0] = (ImageView)findViewById(R.id.lunch2);
        lunch[1] = (ImageView)findViewById(R.id.lunch3);
        lunch[2] = (ImageView)findViewById(R.id.lunch4);
        lunch[3] = (ImageView)findViewById(R.id.lunch5);
        lunch[4] = (ImageView)findViewById(R.id.lunch6);
        lunch[5] = (ImageView)findViewById(R.id.lunch7);
        lunch[6] = (ImageView)findViewById(R.id.lunch8);
        lunch[7] = (ImageView)findViewById(R.id.lunch9);

        showimg1=(ImageView)findViewById(R.id.success);
        showimg2=(ImageView)findViewById(R.id.fail);

        lunch[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num[cnt++]==0){
                    showimg1.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg1.setVisibility(View.GONE);

                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);

                }
                else {
                    showimg2.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg2.setVisibility(View.GONE);
                            Intent intent = new Intent(Lunch_Activity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }

                if(cnt==4){
                    Intent intent = new Intent(Lunch_Activity.this, PresentShow.class); //CleanActivity
                    handler.removeMessages(0);
                    startActivity(intent);
                }

            }
        });

        lunch[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num[cnt++]==1){
                    showimg1.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg1.setVisibility(View.GONE);

                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }
                else {
                    showimg2.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg2.setVisibility(View.GONE);
                            Intent intent = new Intent(Lunch_Activity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }

                if(cnt==4){
                    Intent intent = new Intent(Lunch_Activity.this, PresentShow.class); //CleanActivity
                    handler.removeMessages(0);
                    startActivity(intent);
                }

            }
        });

        lunch[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num[cnt++]==2){
                    showimg1.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg1.setVisibility(View.GONE);

                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }
                else {
                    showimg2.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg2.setVisibility(View.GONE);
                            Intent intent = new Intent(Lunch_Activity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }

                if(cnt==4){
                    Intent intent = new Intent(Lunch_Activity.this, PresentShow.class); //CleanActivity
                    handler.removeMessages(0);
                    startActivity(intent);
                }

            }
        });

        lunch[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num[cnt++]==3){
                    showimg1.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg1.setVisibility(View.GONE);

                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }
                else {
                    showimg2.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg2.setVisibility(View.GONE);
                            Intent intent = new Intent(Lunch_Activity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }

                if(cnt==4){
                    Intent intent = new Intent(Lunch_Activity.this, PresentShow.class); //CleanActivity
                    handler.removeMessages(0);
                    startActivity(intent);
                }

            }
        });

        lunch[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num[cnt++]==4){
                    showimg1.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg1.setVisibility(View.GONE);

                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }
                else {
                    showimg2.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg2.setVisibility(View.GONE);
                            Intent intent = new Intent(Lunch_Activity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }

                if(cnt==4){
                    Intent intent = new Intent(Lunch_Activity.this, PresentShow.class); //CleanActivity
                    handler.removeMessages(0);
                    startActivity(intent);
                }

            }
        });

        lunch[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num[cnt++]==5){
                    showimg1.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg1.setVisibility(View.GONE);

                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }
                else {
                    showimg2.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg2.setVisibility(View.GONE);
                            Intent intent = new Intent(Lunch_Activity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }

                if(cnt==4){
                    Intent intent = new Intent(Lunch_Activity.this, PresentShow.class); //CleanActivity
                    handler.removeMessages(0);
                    startActivity(intent);
                }

            }
        });

        lunch[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num[cnt++]==6){
                    showimg1.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg1.setVisibility(View.GONE);

                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }
                else {
                    showimg2.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg2.setVisibility(View.GONE);
                            Intent intent = new Intent(Lunch_Activity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }

                if(cnt==4){
                    Intent intent = new Intent(Lunch_Activity.this, PresentShow.class); //CleanActivity
                    handler.removeMessages(0);
                    startActivity(intent);
                }

            }
        });

        lunch[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num[cnt++]==7){
                    showimg1.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg1.setVisibility(View.GONE);

                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);
                }
                else {
                    showimg2.setVisibility(View.VISIBLE);
                    Handler handler = new Handler(){
                        public void handleMessage(Message msg){
                            showimg2.setVisibility(View.GONE);
                            Intent intent = new Intent(Lunch_Activity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    };
                    handler.sendEmptyMessageDelayed(0, 500);


                }

                if(cnt==4){

                    Intent intent = new Intent(Lunch_Activity.this, PresentShow.class); //CleanActivity
                    handler.removeMessages(0);
                    startActivity(intent);
                }


            }
        });

        handler = new Handler() {
            public void handleMessage(Message msg) {
                val++;
                time.setText("" + val);
                handler.sendEmptyMessageDelayed(0, 1000);

                if (val == 15) {
                    Intent intent = new Intent(Lunch_Activity.this, MainActivity.class);
                    handler.removeMessages(0);
                    startActivity(intent);
                    val =0;
                }
            }
        };
        handler.sendEmptyMessage(0);
    }
}
