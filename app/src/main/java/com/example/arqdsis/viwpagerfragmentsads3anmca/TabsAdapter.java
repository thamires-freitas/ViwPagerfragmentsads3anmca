package com.example.arqdsis.viwpagerfragmentsads3anmca;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Thamires on 23/04/2018.
 */

public class TabsAdapter extends FragmentPagerAdapter {
    public TabsAdapter (FragmentManager fm){
        super(fm);
    }
    @Override
     public int getCount()
        return 3;

}

      @Override
      public Fragment getItem(int position){
         switch (position){
             case 0;
             return new BlankFragment()
             break;
             case 1;
                 return new BlankFragment1()
             break;
             case 2;
                 return new BlankFragment2()
             break;
         }
      }
