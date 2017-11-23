package com.example.ip.myapplication_3;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameRuleActivity extends AppCompatActivity {

    int MAX_PAGE = 11;
    Fragment cur_fragment = new Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_rule);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);        //Viewpager 선언 및 초기화
        viewPager.setAdapter(new adapter(getSupportFragmentManager()));

    }

    private class adapter extends FragmentPagerAdapter {                    //adapter클래스
        public adapter(FragmentManager fm) {
            super(fm);
        }

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        @Override
        public Fragment getItem(final int position) {

            if (position < 0 || MAX_PAGE <= position)        //가리키는 페이지가 0 이하거나 MAX_PAGE보다 많을 시 null로 리턴
                return null;

            switch (position) {              //포지션에 맞는 Fragment찾아서 cur_fragment변수에 대입
                case 0:
                    cur_fragment = new page_1();

                    break;

                case 1:
                    cur_fragment = new page_2();
                    break;

                case 2:
                    cur_fragment = new page_3();
                    break;

                case 3:
                    cur_fragment = new page_4();
                    break;

                case 4:
                    cur_fragment = new page_5();
                    break;

                case 5:
                    cur_fragment = new page_6();
                    break;

                case 6:
                    cur_fragment = new page_7();
                    break;

                case 7:
                    cur_fragment = new page_8();
                    break;

                case 8:
                    cur_fragment = new page_9();
                    break;

                case 9:
                    cur_fragment = new page_10();
                    break;

                case 10:
                    cur_fragment = new page_11();
                    break;
            }

            return cur_fragment;
        }

        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }
}
