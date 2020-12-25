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

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    //private ArrayList<Pet> varPetsList = new ArrayList<>();
    //private CreatePet varPetsIni = new CreatePet();
    //private V1ViewPageAdapter varViewPagerAdapter;
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
    }

    public void onClickImgBtn(View v){

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
                //varIntent = new Intent(this, EmailActivity.class);
                //startActivity(varIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}