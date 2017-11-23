package com.example.ip.myapplication_3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PresentGame extends AppCompatActivity {
    ImageView[] img = new ImageView[8];
    int[] click_num = new int[5];
    int result = 0;
    int cnt = 0, val = 0;
    PresentShow activity_before = new PresentShow();
    int[] show = activity_before.getShow();
    //   ImageView stop;
    Intent intent;
    Handler handler;
    TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        supportRequestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        setContentView(R.layout.activity_game);

        intent = getIntent();
        val = intent.getExtras().getInt("num");

        time = (TextView)findViewById(R.id.time);

        handler = new Handler(){
            public void handleMessage(Message msg){
                time.setText(""+val);
                handler.sendEmptyMessageDelayed(0,1000);
                val++;
                time.setText(""+val);

                if(val == 20){
                    handler.removeMessages(0);
                    intent = new Intent(PresentGame.this, MainActivity.class); //처음 화면
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                }
            }
        };

        handler.sendEmptyMessage(0);

        ImageView.OnClickListener onClickListener = new ImageView.OnClickListener(){
            @Override
            public void onClick(View view){
                int num = Integer.parseInt(view.getTag().toString());

                click_num[cnt] = num;

                //  Toast.makeText(activity_before, num+", ", Toast.LENGTH_SHORT).show();

                if(click_num[cnt] != show[cnt]) {
                    result = 1;
                }

                img[num].setVisibility(View.INVISIBLE);

                if(result == 1 && cnt == show.length-1){
                    handler.removeMessages(0);
                    intent = new Intent(PresentGame.this, MainActivity.class);
                    Toast.makeText(PresentGame.this, click_num[cnt] + ", " + activity_before.show[cnt] + "미션 실패", Toast.LENGTH_SHORT).show();
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                }
                if(result == 0 && cnt == show.length-1){
                    handler.removeMessages(0);
                    intent = new Intent(PresentGame.this, LastPropose.class); //다음 화면으로 연결
                    intent.putExtra("num", 0);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                }

                cnt++;
            }
        };

        img[0] = (ImageView)findViewById(R.id.blue);
        img[0].setTag(0);
        img[1] = (ImageView)findViewById(R.id.orange);
        img[1].setTag(1);
        img[2] = (ImageView)findViewById(R.id.whitec);
        img[2].setTag(2);
        img[3] = (ImageView)findViewById(R.id.candy);
        img[3].setTag(3);
        img[4] = (ImageView)findViewById(R.id.darkc);
        img[4].setTag(4);
        img[5] = (ImageView)findViewById(R.id.blues);
        img[5].setTag(5);
        img[6] = (ImageView)findViewById(R.id.ball);
        img[6].setTag(6);
        img[7] = (ImageView)findViewById(R.id.reds);
        img[7].setTag(7);

        for(int i=0; i<img.length; i++){
            img[i].setOnClickListener(onClickListener);
        }
    }
}
