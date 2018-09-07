package com.holamundo.personasmovil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {

    private EditText txtCedula,txtNombre,txtApellido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        txtCedula = findViewById(R.id.txtCedula);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);

    }

    public  void guardar (View v){

        String ced,nom,apell;

        ced = txtCedula.getText().toString();
        nom = txtNombre.getText().toString();
        apell = txtApellido.getText().toString();

        Persona p = new Persona(ced,nom,apell);
        p.guardar();
        Toast.makeText(this, getResources().getString(R.string.mensaje),Toast.LENGTH_SHORT).show();
        borrar();



    }

    public void limpiar (View v){
        borrar();
    }

    private  void borrar (){

        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.requestFocus();
    }
}
