package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view){
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText dtFechaNacimiento = (EditText)findViewById(R.id.dtFechaNacimiento);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        RadioButton rbtMasculino = (RadioButton)findViewById(R.id.rbtMasculino);
        RadioButton rbtFemenino = (RadioButton)findViewById(R.id.rbtFemenino);
        // Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("FECHANACIMIENTO", dtFechaNacimiento.getText().toString());
        b.putString("TELEFONO", txtTelefono.getText().toString());
        if(rbtMasculino.isChecked() == true){
            b.putString("GENERO", "Masculino");
        }
        if(rbtFemenino.isChecked() == true){
            b.putString("GENERO", "Femenino");
        }
        //Añadimos la información al intent
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }

}