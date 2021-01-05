package com.ar6.proyecto5.data;

import android.content.ContentValues;
import android.content.Context;

import com.ar6.proyecto5.R;

import java.util.ArrayList;

public class CreatePet {

    private Context varContext;

    public CreatePet(Context varContext) {
        this.varContext = varContext;
    }

    public ArrayList<Pet> getPets() {
        Database varDB = new Database(varContext);
        insertarPets(varDB);
        return varDB.getAllPets();
    }

    public void insertarPets(Database varDB) {
        ContentValues varContentValues = new ContentValues();

        varContentValues.put("Nombre", "Lukas");
        varContentValues.put("Edad", 1);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet1);
        varDB.insertDB(varContentValues);

        varContentValues = new ContentValues();
        varContentValues.put("Nombre", "Matias");
        varContentValues.put("Edad", 3);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet3);
        varDB.insertDB(varContentValues);

        varContentValues = new ContentValues();
        varContentValues.put("Nombre", "Candy");
        varContentValues.put("Edad", 1);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet2);
        varDB.insertDB(varContentValues);

        varContentValues = new ContentValues();
        varContentValues.put("Nombre", "Trosky");
        varContentValues.put("Edad", 4);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet5);
        varDB.insertDB(varContentValues);

        varContentValues = new ContentValues();
        varContentValues.put("Nombre", "Turqueza");
        varContentValues.put("Edad", 4);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet7);
        varDB.insertDB(varContentValues);

        varContentValues = new ContentValues();
        varContentValues.put("Nombre", "Spok");
        varContentValues.put("Edad", 1);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet8);
        varDB.insertDB(varContentValues);

        varContentValues = new ContentValues();
        varContentValues.put("Nombre", "sakura");
        varContentValues.put("Edad", 2);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet9);
        varDB.insertDB(varContentValues);

        varContentValues = new ContentValues();
        varContentValues.put("Nombre", "Pulgitas");
        varContentValues.put("Edad", 1);
        varContentValues.put("Rank", 0);
        varContentValues.put("Foto", R.drawable.pet6);
        varDB.insertDB(varContentValues);
    }

    public void darLikePet(Pet varPet) {
        Database varDB = new Database(varContext);
        int varNumLikes  = varPet.getVarRanking() ;
        ContentValues varContentValues = new ContentValues();
        varContentValues.put("Rank",varNumLikes);
        varDB.updateDB(varContentValues,varPet.getVarID());
    }

}
