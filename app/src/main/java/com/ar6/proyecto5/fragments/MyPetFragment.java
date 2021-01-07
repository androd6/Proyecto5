package com.ar6.proyecto5.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.ar6.proyecto5.R;
import com.ar6.proyecto5.adapters.MyPetadapter;
import com.ar6.proyecto5.adapters.Petadapter;
import com.ar6.proyecto5.data.Pet;
import com.ar6.proyecto5.presentador.MyPetFragmentPresenter;
import com.ar6.proyecto5.presentador.PetFragmentPresenter;

import java.util.ArrayList;


public class MyPetFragment extends Fragment implements IMyPetFragmentView {

    public RecyclerView varRV_DetMyPet;
    private ArrayList<Pet> varPetsList = new ArrayList<>();
    private MyPetFragmentPresenter varIPetPresenter;
    private ImageView varIVMyPet;
    private TextView varTVMyPet;

    public MyPetFragment() {
        // Required empty public constructor
    }

     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View varView;

        varView = inflater.inflate(R.layout.fragment_my_pet, container, false);
        varRV_DetMyPet = varView.findViewById(R.id.v1_fr2_rvMyPet);
        varIVMyPet = varView.findViewById(R.id.v1_fr2_iwMyPet);
        varTVMyPet = varView.findViewById(R.id.v1_fr2_tvName);
        varIPetPresenter = new MyPetFragmentPresenter(this, getContext());
        return  varView;
    }

    @Override
    public void generarGridLayoutVertical() {
        GridLayoutManager varLLM = new GridLayoutManager(getActivity(), 2);
        varRV_DetMyPet.setLayoutManager(varLLM);
    }

    @Override
    public MyPetadapter crearAdapatadorMyPet(ArrayList<Pet> paramPet) {
        MyPetadapter varAdapterMyPet = new MyPetadapter(paramPet);
        return varAdapterMyPet;
    }

    @Override
    public void inicializarAdapatadorReciclerView(MyPetadapter paramAdaptador) {
        varRV_DetMyPet.setAdapter(paramAdaptador);
    }

    @Override
    public void setViewMyPet(Pet paramPet) {
        varIVMyPet.setImageResource(paramPet.getVarFoto());
        varTVMyPet.setText(paramPet.getVarNombre());
    }

}














