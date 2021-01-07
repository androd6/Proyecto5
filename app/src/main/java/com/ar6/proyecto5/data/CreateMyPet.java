package com.ar6.proyecto5.data;

import android.content.ContentValues;
import android.content.Context;

import com.ar6.proyecto5.R;

import java.util.ArrayList;

public class CreateMyPet {

    private Context varContext;

    public CreateMyPet(Context varContext) {

        this.varContext = varContext;
    }

    public Pet getMyPet() {
        Database varDB = new Database(varContext);
        insertarMyPet(varDB);
        return varDB.getMyPet();
    }

    public void insertarMyPet(Database varDB) {
        ContentValues varContentValues = new ContentValues();

        varContentValues.put("Nombre", "Pulgitas");
        varContentValues.put("Edad", 1);
        varContentValues.put("Foto", R.drawable.pet6);
        varDB.insertDBMyPet(varContentValues);
    }

    public ArrayList<Pet> getMyPetDet() {
        Database varDB = new Database(varContext);
        insertarMyPetsDet(varDB);
        return varDB.getMyPetDet();
    }

    public void insertarMyPetsDet(Database varDB) {
        ContentValues varContentValues = new ContentValues();

        varContentValues.put("Nombre", "Pulgitas");
        varContentValues.put("Edad", 1);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet6e);
        varContentValues.put("IDMyPet",1);
        varDB.insertDBMyPetDet(varContentValues);

        varContentValues.put("Nombre", "Pulgitas");
        varContentValues.put("Edad", 1);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet6e);
        varContentValues.put("IDMyPet",1);
        varDB.insertDBMyPetDet(varContentValues);

        varContentValues.put("Nombre", "Pulgitas");
        varContentValues.put("Edad", 1);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet6e);
        varContentValues.put("IDMyPet",1);
        varDB.insertDBMyPetDet(varContentValues);

        varContentValues.put("Nombre", "Pulgitas");
        varContentValues.put("Edad", 1);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet6e);
        varContentValues.put("IDMyPet",1);
        varDB.insertDBMyPetDet(varContentValues);

    }
}
