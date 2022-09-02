package com.shubham.mdpractice.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.shubham.mdpractice.fragments.Calls;
import com.shubham.mdpractice.fragments.Chats;
import com.shubham.mdpractice.fragments.Groups;
import com.shubham.mdpractice.fragments.Status;

public class ViewPagerAdapter extends FragmentPagerAdapter {



    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new Chats();
        }else if(position ==1){
            return new Groups();
        }else if(position ==2){
            return  new Status();
        }else{
            return new Calls();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Chats";
        }else if(position ==1){
            return "Groups";
        }else if(position ==2){
            return  "Status";
        }else{
            return "Calls";
        }
    }
}
