package com.ar6.proyecto5.presentador;

import android.content.Context;

import com.ar6.proyecto5.fragments.IMyPetFragmentView;

public class MyPetFragmentPresenter {

    private IMyPetFragmentView varIMyPetFragmentView;
    private Context varContext;

    public MyPetFragmentPresenter(IMyPetFragmentView varIMyPetFragmentView, Context varContext) {
        this.varIMyPetFragmentView = varIMyPetFragmentView;
        this.varContext = varContext;
    }
}
