package com.ar6.proyecto5.fragments;

import com.ar6.proyecto5.adapters.Petadapter;
import com.ar6.proyecto5.data.Pet;

import java.util.ArrayList;

public interface IMyPetFragmentView {

    public void generarLinearLayoutVertical();
    public Petadapter crearAdapatadorPet(ArrayList<Pet> paramPet);
    public void inicializarAdapatadorReciclerView(Petadapter paramAdaptador);

}
