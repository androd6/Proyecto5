package com.ar6.proyecto5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import com.ar6.proyecto5.support.SendMail;
import com.google.android.material.textfield.TextInputEditText;

public class EmailActivity extends AppCompatActivity {

    // Definicion de las variables que se emparejaran con los objetos de la vista
    private TextInputEditText varV4tiaddress;
    private TextInputEditText varV4tisubject;
    private TextInputEditText varV4timesage;
    private TextInputEditText varV4tisuaddress;
    private TextInputEditText varV4tisupassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        // Activacion del toolbar
        Toolbar varToolbar = findViewById(R.id.v4_ToolBar);
        setSupportActionBar(varToolbar);

        // Soporte para la flecha de retroceder
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Emparejamiento de las variables con los objetos de la vista
        varV4tiaddress = findViewById(R.id.v4_Address);
        varV4tisubject = findViewById(R.id.v4_Subject);
        varV4timesage = findViewById(R.id.v4_Message);
        varV4tisuaddress = findViewById(R.id.v4_suAddress);
        varV4tisupassword = findViewById(R.id.v4_suPassword);

    }

    // Define el metodo que se configura en la propiedad onClick del objeto v4_btnSend y que hace
    // que se envie el email
    public void onClickBoton1(View v){
        String varEmail = varV4tiaddress.getText().toString().trim();
        String varSubject = varV4tisubject.getText().toString().trim();
        String varMessage = varV4timesage.getText().toString().trim();
        String varsuAddress = varV4tisuaddress.getText().toString().trim();
        String varsuPassword = varV4tisupassword.getText().toString().trim();

        SendMail varSendMail = new SendMail(this,varEmail,varSubject,varMessage,varsuAddress,varsuPassword);

        varSendMail.execute();

    }

}