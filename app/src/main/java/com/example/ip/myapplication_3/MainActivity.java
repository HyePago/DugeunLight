package com.example.ip.myapplication_3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        supportRequestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        setContentView(R.layout.activity_main);
        mp=MediaPlayer.create(this,R.raw.snacktime);
        mp.setLooping(true);
        mp.start();

        Button but_1 = (Button)findViewById(R.id.but1);
        but_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, StartWebtoon1Activity.class); // StartWebtoon1Activity  LunchShow  PresentShow, 점심식단표 & 앞 만화 & 버스정류장 경우의 수 & 음악
                startActivity(intent);
            }
        });
/*
        Button but_2 = (Button)findViewById(R.id.but2);
        but_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, GameRuleActivity.class);
                startActivity(intent);
            }
        });
*/
    }

}
