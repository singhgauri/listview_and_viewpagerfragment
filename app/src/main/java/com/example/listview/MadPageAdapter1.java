package com.example.listview;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MadPageAdapter1 extends FragmentPagerAdapter {

    private int numOfTabs;

    MadPageAdapter1(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MadExam();
            case 1:
                return new MadTheory();
            case 2:
                return new MadPractical();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}