package com.ar6.proyecto5.presentador;

import android.content.Context;

import com.ar6.proyecto5.data.CreatePet;
import com.ar6.proyecto5.data.Pet;

import java.util.ArrayList;

public class PetFavoritosPresenter implements  IPetFavoritos{

    ArrayList<Pet> varPetList5 = new ArrayList<>();
    private Context varContext;
    CreatePet varCreatePet;

    public PetFavoritosPresenter(Context varContext) {
        this.varContext = varContext;
    }

    @Override
    public ArrayList<Pet> getPetTop5() {
        varCreatePet = new CreatePet(varContext);
        varPetList5 = varCreatePet.getPetsTop5();
        return varPetList5;
    }

}
