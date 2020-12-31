package com.ar6.proyecto5.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Database extends SQLiteOpenHelper {

    private Context varContext;

    public Database(Context context) {
        super(context, "Pets", null, 1);
        this.varContext = context;
    }

    // Crea la estructura de la tabla o tablas
    @Override
    public void onCreate(SQLiteDatabase db) {
        String varCreateTablePet = "CREATE TABLE Pet(" +
                                   "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                                   "Nombre TEXT," +
                                   "Edad INTEGER," +
                                   "Rank INTEGER," +
                                   "Foto INTEGER)";
        db.execSQL(varCreateTablePet);
    }

    // Borra la tabla y la vuelve a crear
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String varComandText = "DROP TABLE IF EXISTS Pet";
        db.execSQL(varComandText);
        onCreate(db);
    }

    // crea una busqueda en la base de datos
    public ArrayList<Pet> getAllPets() {
        ArrayList<Pet> varPets = new ArrayList<>();
        String varQuery;
        Cursor varCursor;
        Pet varPet = new Pet();

        varQuery = "SELECT * FROM Pet";

        SQLiteDatabase varDB = this.getWritableDatabase();
        varCursor = varDB.rawQuery(varQuery,null);

        while (varCursor.moveToNext()) {
            varPet.setVarID(varCursor.getInt(0));
            varPet.setVarNombre(varCursor.getString(1));
            varPet.setVarEdad(varCursor.getInt(2));
            varPet.setVarRanking(varCursor.getInt(3));
            varPet.setVarFoto(varCursor.getInt(4));

            varPets.add(varPet);

        }

        varDB.close();

        return varPets;
    }

    // Inserta un elemento en la base de datos
    public void insertDB(ContentValues varContentValues) {
        SQLiteDatabase varDB = this.getWritableDatabase();
        varDB.insert("Pet", null, varContentValues);
        varDB.close();
    }

}