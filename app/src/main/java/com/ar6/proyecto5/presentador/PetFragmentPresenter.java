package com.ar6.proyecto5.presentador;

import android.content.Context;

import com.ar6.proyecto5.data.CreatePet;
import com.ar6.proyecto5.data.Pet;
import com.ar6.proyecto5.fragments.IPetFragmentView;

import java.util.ArrayList;

public class PetFragmentPresenter implements IPetFragmentPresenter{

    private IPetFragmentView varPetFragmentView;
    private Context varContext;
    private CreatePet varCreatePet;
    private ArrayList<Pet> varPetList;

    public PetFragmentPresenter(IPetFragmentView varPetFragmentView, Context varContext) {
        this.varPetFragmentView = varPetFragmentView;
        this.varContext = varContext;
        optenerPetsDB();
    }

    @Override
    public void optenerPetsDB() {
        varCreatePet = new CreatePet(varContext);
        varPetList = varCreatePet.getPets();
        mostrarPetsRV();
    }

    @Override
    public void mostrarPetsRV() {
        varPetFragmentView.inicializarAdapatadorReciclerView(varPetFragmentView.crearAdapatadorPet(varPetList));
        varPetFragmentView.generarLinearLayoutVertical();
    }
}
