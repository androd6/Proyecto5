package com.ar6.proyecto5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.ar6.proyecto5.adapters.V1ViewPageAdapter;
import com.ar6.proyecto5.data.Pet;
import com.ar6.proyecto5.fragments.MyPetFragment;
import com.ar6.proyecto5.fragments.PetFragment;
import com.ar6.proyecto5.presentador.PetFavoritosPresenter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //private ArrayList<Pet> varPetsList = new ArrayList<>();
    //private CreatePet varPetsIni = new CreatePet();
    private V1ViewPageAdapter varViewPagerAdapter;
    private ViewPager2 varViewPager;
    private TabLayout varTabLayout;

    //public static final ArrayList<Pet> paramPetsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Definicion del toolbar del activity
        Toolbar varToolbar = findViewById(R.id.v1_ToolBar);
        setSupportActionBar(varToolbar);

        varViewPager = findViewById(R.id.v1_ViewPager);
        varViewPagerAdapter = new V1ViewPageAdapter(getSupportFragmentManager(),getLifecycle());
        varViewPagerAdapter.addFragment(new PetFragment());
        varViewPagerAdapter.addFragment(new MyPetFragment());
        varViewPager.setAdapter(varViewPagerAdapter);

        varTabLayout = findViewById(R.id.v1_TabBar);
        new TabLayoutMediator(varTabLayout, varViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText(R.string.v1_Tab1);
                        break;
                    case 1:
                        tab.setText(R.string.v1_Tab2);
                        break;
                }
            }
        }).attach();

    }

    public void onClickImgBtn(View v){
        ArrayList<Pet> varPetsList = new ArrayList<>();
        PetFavoritosPresenter varPetFavPre = new PetFavoritosPresenter(this);

        varPetsList = varPetFavPre.getPetTop5();

        Intent varIntent = new Intent(this, FavoritosActivity.class);
        varIntent.putParcelableArrayListExtra("Lista", varPetsList);
        startActivity(varIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opt_mainact, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent varIntent;

        switch (item.getItemId()){
            case R.id.mnoptmaitem2:
                varIntent = new Intent(this, AboutActivity.class);
                startActivity(varIntent);
                break;
            case R.id.mnoptmaitem1:
                varIntent = new Intent(this, EmailActivity.class);
                startActivity(varIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}