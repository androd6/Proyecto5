package com.ar6.proyecto5.data;

import android.content.ContentValues;
import android.content.Context;

import com.ar6.proyecto5.R;

public class CreateMyPet {

    private Context varContext;

    public CreateMyPet(Context varContext) {
        this.varContext = varContext;
    }

    public void insertarMyPets(Database varDB) {
        ContentValues varContentValues = new ContentValues();

        varContentValues.put("Nombre", "Pulgitas");
        varContentValues.put("Edad", 1);
        varContentValues.put("Foto", R.drawable.pet6);
        varDB.insertDB(varContentValues);
    }

    public void insertarMyPetsDet(Database varDB) {
        ContentValues varContentValues = new ContentValues();

        varContentValues.put("Nombre", "Pulgitas");
        varContentValues.put("Edad", 1);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet6e);
        varContentValues.put("IDMyPet", 1);
        varDB.insertDB(varContentValues);
    }
}
