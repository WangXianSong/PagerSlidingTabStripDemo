package com.songsong.pagerslidingtabstriptest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private final String[] title = {"模块1", "模块2", "模块3"};
    private List<Fragment> fragments = new ArrayList<Fragment>();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
        Fragment3 fragment3 = new Fragment3();
        //添加fragment到集合中时注意顺序
        fragments.add(fragment1);
        fragments.add(fragment2);
        fragments.add(fragment3);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
