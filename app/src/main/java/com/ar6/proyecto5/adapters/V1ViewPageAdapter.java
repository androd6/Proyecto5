package com.ar6.proyecto5.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class V1ViewPageAdapter extends FragmentStateAdapter {

    ArrayList<Fragment> varArrayList = new ArrayList<>();

    public V1ViewPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return varArrayList.get(position);
    }

    @Override
    public int getItemCount() {

        return varArrayList.size();
    }

    public void addFragment(Fragment varFragment){

        varArrayList.add(varFragment);
    }

}
