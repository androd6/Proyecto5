package com.ar6.proyecto5.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ar6.proyecto5.R;


public class MyPetFragment extends Fragment {

    public RecyclerView varRV_DetMyPet;

    public MyPetFragment() {
        // Required empty public constructor
    }

     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View varView;

        varView = inflater.inflate(R.layout.fragment_my_pet, container, false);
        varRV_DetMyPet = varView.findViewById(R.id.v1_fr2_rvMyPet);
        return  varView;
    }
}