package com.ar6.proyecto5.data;

import android.os.Parcel;
import android.os.Parcelable;

public class Pet implements Parcelable {

    public static final Parcelable.Creator<Pet> CREATOR = new Parcelable.Creator<Pet>() {
        public Pet createFromParcel(Parcel in) {
            return new Pet(in);
        }

        public Pet[] newArray(int size) {
            return new Pet[size];
        }
    };

    private int varID;
    private String varNombre;
    private int varRanking;
    private int varEdad;
    private int varFoto;

    public Pet() {
    }

    public Pet(String varNombre, int varRanking, int varEdad, int varFoto) {
        this.varNombre = varNombre;
        this.varRanking = varRanking;
        this.varEdad = varEdad;
        this.varFoto = varFoto;
    }

    public Pet(Parcel in) {
        this.varNombre = in.readString();
        this.varRanking = in.readInt();
        this.varEdad = in.readInt();
        this.varFoto = in.readInt();
        this.varID = in.readByte();
    }

    public int getVarID() {
        return varID;
    }

    public void setVarID(int varID) {
        this.varID = varID;
    }

    public String getVarNombre() {
        return varNombre;
    }

    public void setVarNombre(String varNombre) {
        this.varNombre = varNombre;
    }

    public int getVarRanking() {
        return varRanking;
    }

    public void setVarRanking(int varRanking) {
        this.varRanking = varRanking;
    }

    public int getVarEdad() {
        return varEdad;
    }

    public void setVarEdad(int varEdad) {
        this.varEdad = varEdad;
    }

    public int getVarFoto() {
        return varFoto;
    }

    public void setVarFoto(int varFoto) {
        this.varFoto = varFoto;
    }

    @Override
    public int describeContents() {

        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.varNombre);
        dest.writeInt(this.varRanking);
        dest.writeInt(this.varEdad);
        dest.writeInt(this.varFoto);
        dest.writeInt(this.varID);
    }

}

