package com.ar6.proyecto5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar varToolbar = findViewById(R.id.v3_ToolBar);
        setSupportActionBar(varToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}