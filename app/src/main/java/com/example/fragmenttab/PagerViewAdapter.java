package com.example.fragmenttab;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdapter  extends FragmentPagerAdapter {
    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position){

            case  0:
                fragment = new Fragment_Camera();
                break;
            case 1:
                fragment = new Fragment_Chat();
                break;
            case 2:
                fragment = new Fragment_Status();
                break;
            case 3:
                fragment = new Fragment_Call();
        }
        return  fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
