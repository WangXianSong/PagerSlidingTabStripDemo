package com.songsong.pagerslidingtabstriptest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.astuetz.PagerSlidingTabStrip;

public class MainActivity extends FragmentActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        PagerSlidingTabStrip tabs = findViewById(R.id.tabs);

        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        tabs.setShouldExpand(true);//平分导航栏
        tabs.setViewPager(viewPager);
    }
}
