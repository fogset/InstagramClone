package com.example.tianhao.instagramclone.Home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;
//Class that stores fragments for tabs
public class SectionsPagerAdapter extends FragmentPagerAdapter{
    private  static  final String TAG = "SectionsPagerAdapter";
    private  final List<Fragment> mfragmentList = new ArrayList<>();
    public SectionsPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mfragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }
    public void addFragment(Fragment fragment){
        mfragmentList.add(fragment);
    }
}
