package com.ar6.proyecto5.presentador;

import android.content.Context;
import android.widget.ImageView;

import com.ar6.proyecto5.data.CreateMyPet;
import com.ar6.proyecto5.data.CreatePet;
import com.ar6.proyecto5.data.Pet;
import com.ar6.proyecto5.fragments.IMyPetFragmentView;

import java.util.ArrayList;

public class MyPetFragmentPresenter {

    private IMyPetFragmentView varIMyPetFragmentView;
    private Context varContext;
    private CreateMyPet varCreateMyPet;
    private ArrayList<Pet> varPetList;
    private Pet varPet = new Pet();

    public MyPetFragmentPresenter(IMyPetFragmentView varIMyPetFragmentView, Context varContext) {
        this.varIMyPetFragmentView = varIMyPetFragmentView;
        this.varContext = varContext;
        optenerMyPetsDB();
    }

    public void optenerMyPetsDB() {
        varCreateMyPet = new CreateMyPet(varContext);
        varPetList = varCreateMyPet.getMyPetDet();
        varPet = varCreateMyPet.getMyPet();
        mostrarMyPetsRV(varPet);
    }

    public void mostrarMyPetsRV(Pet varMyPet) {
        varIMyPetFragmentView.inicializarAdapatadorReciclerView(varIMyPetFragmentView.crearAdapatadorMyPet(varPetList));
        varIMyPetFragmentView.generarGridLayoutVertical();
        varIMyPetFragmentView.setViewMyPet(varPet);
    }
}
