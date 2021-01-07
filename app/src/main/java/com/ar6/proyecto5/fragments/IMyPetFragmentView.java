package com.ar6.proyecto5.fragments;

import com.ar6.proyecto5.adapters.MyPetadapter;
import com.ar6.proyecto5.adapters.Petadapter;
import com.ar6.proyecto5.data.Pet;

import java.util.ArrayList;

public interface IMyPetFragmentView {

    public void generarGridLayoutVertical();
    public MyPetadapter crearAdapatadorMyPet(ArrayList<Pet> paramPet);
    public void inicializarAdapatadorReciclerView(MyPetadapter paramAdaptador);
    public void setViewMyPet(Pet paramPet);

}
