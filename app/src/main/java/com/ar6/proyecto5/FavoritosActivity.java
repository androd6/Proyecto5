package com.ar6.proyecto5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.ar6.proyecto5.adapters.Petadapter;
import com.ar6.proyecto5.data.Pet;

import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity {

    private ArrayList<Pet> varPetsList = new ArrayList<>();
    private RecyclerView varRvListPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar varToolbar = findViewById(R.id.v2_ToolBar);
        setSupportActionBar(varToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent varPrmIntent = getIntent();

        if (varPrmIntent.getExtras() != null){
            varPetsList =  getIntent().getParcelableArrayListExtra("Lista");
        }

        varRvListPet = findViewById(R.id.v2_RecycledView);

        LinearLayoutManager varLLM = new LinearLayoutManager(this);
        varLLM.setOrientation(LinearLayoutManager.VERTICAL);

        varRvListPet.setLayoutManager(varLLM);

        iniAdaptador();
    }

    public void iniAdaptador () {
        Petadapter varAdapterPet = new Petadapter(varPetsList);
        varRvListPet.setAdapter(varAdapterPet);
    }
}