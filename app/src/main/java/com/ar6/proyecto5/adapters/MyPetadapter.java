package com.ar6.proyecto5.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ar6.proyecto5.R;
import com.ar6.proyecto5.data.CreatePet;
import com.ar6.proyecto5.data.Pet;

import java.util.ArrayList;

public class MyPetadapter extends RecyclerView.Adapter<MyPetadapter.MyPetViewHolder> {

    ArrayList<Pet> varListPet;

    public MyPetadapter(ArrayList<Pet> varListPet) {
        this.varListPet = varListPet;
    }

    @NonNull
    @Override
    public MyPetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varViewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_elemnt, parent,false);
        return new MyPetViewHolder(varViewInflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyPetViewHolder varholder, int position) {
        String varTemp;
        Pet varPet = varListPet.get(position);
        varholder.varCvImgPet.setImageResource(varPet.getVarFoto());
        varholder.varCvTvName.setText(varPet.getVarNombre());
        varTemp = Integer.toString(varPet.getVarRanking());
        varholder.varCvTvRank.setText(varTemp);

        varholder.varCvBtnRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int varTempRank = varPet.getVarRanking() + 1;
                varPet.setVarRanking(varTempRank);
                varholder.varCvTvRank.setText(Integer.toString(varPet.getVarRanking()));
                CreatePet varCreatePet = new CreatePet(v.getContext());
                varCreatePet.darLikePet(varPet);
            }
        });
    }

    @Override
    public int getItemCount() {
        return varListPet.size();
    }

    public static class MyPetViewHolder extends RecyclerView.ViewHolder {

        private final ImageView varCvImgPet;
        private final ImageButton varCvBtnRank;
        private final TextView varCvTvName;
        private final TextView varCvTvRank;

        public MyPetViewHolder(@NonNull View itemView) {
            super(itemView);

            varCvImgPet = itemView.findViewById(R.id.cvimagePet);
            varCvBtnRank = itemView.findViewById(R.id.cvImgBtnRank);
            varCvTvName = itemView.findViewById(R.id.cvtvName);
            varCvTvRank = itemView.findViewById(R.id.cvtvRank);

        }
    }
}











