package com.ar6.proyecto5.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ar6.proyecto5.R;
import com.ar6.proyecto5.adapters.Petadapter;
import com.ar6.proyecto5.data.Pet;
import com.ar6.proyecto5.presentador.IPetFragmentPresenter;
import com.ar6.proyecto5.presentador.PetFragmentPresenter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PetFragment extends Fragment implements IPetFragmentView{

    private ArrayList<Pet> varPetsList = new ArrayList<>();
    //private CreatePet varPetsIni = new CreatePet();
    private RecyclerView varRvListPet;
    private IPetFragmentPresenter varIPetPresenter;

    public PetFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View varView;
        // Inflate the layout for this fragment
       // varPetsList = varPetsIni.getVarPets();

        varView = inflater.inflate(R.layout.fragment_pet, container, false);
        varRvListPet = varView.findViewById(R.id.v1_FrgRecycledView);
        varIPetPresenter = new PetFragmentPresenter(this, getContext());

        return varView;
    }


    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager varLLM = new LinearLayoutManager(getActivity());
        varLLM.setOrientation(LinearLayoutManager.VERTICAL);
        varRvListPet.setLayoutManager(varLLM);
    }

    @Override
    public Petadapter crearAdapatadorPet(ArrayList<Pet> paramPet) {
        Petadapter varAdapterPet = new Petadapter(paramPet);
        return varAdapterPet;
    }

    @Override
    public void inicializarAdapatadorReciclerView(Petadapter paramAdaptador) {
        varRvListPet.setAdapter(paramAdaptador);
    }
}